package edu.kit.ipd.crowdcontrol.objectservice.mail;

import javax.mail.*;
import javax.mail.search.FlagTerm;
import java.util.Properties;

/**
 * A Mailhandler, that can send and fetch mails to another mail address/from a mailbox
 *
 * @author Felix Rittler
 * @author Niklas Keller
 * @author Marcel Hollerbach
 */
public class MailReceiver implements MailFetcher {
    public enum Protocol {
        imap, imaps,
        pop3, pop3s
    }

    private final Protocol protocol;
    private final String user;
    private final String password;
    private final String host;
    private final int port;
    private final String defaultInbox;
    private Properties props;


    /**
     * An e-mail receiver to fetch emails from a server.
     *
     */
    public MailReceiver(Protocol protocol, String user, String password, String host, int port, String defaultInbox, boolean debug) {
        this.protocol = protocol;
        this.user = user;
        this.password = password;
        this.host = host;
        this.port = port;
        this.defaultInbox = defaultInbox;

        props = new Properties();

        //we can always send starttls as this will ask to server if he supports it
        props.setProperty("mail.imap.starttls.enable", "true");
        props.setProperty("mail.pop3.starttls.enable", "true");

        if (debug)
          props.setProperty("mail.debug", true+"");

        props.setProperty("mail."+protocol+".ssl.checkserveridentity", "true");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Message[] fetchUnseen(String name) throws MessagingException {
        Store store = connect();

        Message[] messages;

        Folder folder = store.getFolder(name);
        folder.open(Folder.READ_WRITE);

        Flags seen = new Flags(Flags.Flag.SEEN);
        FlagTerm unseenFlagTerm = new FlagTerm(seen, false);
        messages = folder.search(unseenFlagTerm);

        for (Message msg : messages) {
            msg.setFlag(Flags.Flag.SEEN, true);
        }
        folder.close(true);

        folder.open(Folder.READ_ONLY);

        return messages;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Message[] fetchFolder(String name) throws MessagingException {
        Store store = connect();

        Folder folder = store.getFolder(name);
        folder.open(Folder.READ_WRITE);
        Message[] messages = folder.getMessages();

        for (Message msg : messages) {
            msg.setFlag(Flags.Flag.SEEN, true);
        }
        folder.close(true);

        folder.open(Folder.READ_ONLY);
        return messages;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void markAsUnseen(Message message) throws MessagingException {
        Folder folder = message.getFolder();
        boolean wasOpen = false;
        int mode = 0;
        if (folder.isOpen()) {
            wasOpen = true;
            mode = folder.getMode();
            folder.close(true);
        }
        folder.open(Folder.READ_WRITE);

        message.setFlag(Flags.Flag.SEEN, false);

        folder.close(true);
        if (wasOpen) {
            folder.open(mode);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteMails(Message message) throws MessagingException {
        Folder folder = message.getFolder();
        boolean wasOpen = false;
        int mode = 0;
        if (folder.isOpen()) {
            wasOpen = true;
            mode = folder.getMode();
            folder.close(true);
        }
        folder.open(Folder.READ_WRITE);

        message.setFlag(Flags.Flag.DELETED, true);

        folder.close(true);

        if (wasOpen) {
            folder.open(mode);
        }
    }

    @Override
    public Message[] fetchUnseen() throws MessagingException {
        return fetchUnseen(defaultInbox);
    }

    /**
     * Closes the folder and the store of the messages.
     * @param messages the messages their resources become closed
     * @throws MessagingException in case of problems with closing
     */
    public void close(Message[] messages) throws MessagingException {
        if (messages.length > 0) {
            if (messages[0].getFolder().isOpen()) {
                messages[0].getFolder().close(true);
            }
            if (messages[0].getFolder().getStore().isConnected()) {
                messages[0].getFolder().getStore().close();
            }
        }
    }

    private Store connect() throws MessagingException {
        Session session = Session.getInstance(props);
        Store store = session.getStore(protocol.toString());
        store.connect(host, port, user, password);
        return store;
    }
}