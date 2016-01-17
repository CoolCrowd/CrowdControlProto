package edu.kit.ipd.crowdcontrol.objectservice.mail;

import org.junit.Test;

import javax.mail.Message;
import java.util.UUID;

import static org.junit.Assert.assertTrue;

/**
 * @author Niklas Keller
 */
public abstract class MailHandlerTest {
	protected MailHandler handler;
	protected String mail;
	protected String folder;

	@Test
	public void test() throws Exception {
		String uuid = UUID.randomUUID().toString();
		String subject = "[test] " + uuid;

		handler.sendMail(this.mail, subject, uuid);

		// TODO: Fetch sent items here instead of received, mails need their time.

		Message[] messages = handler.fetchUnseen();

		boolean found = false;

		for (Message message : messages) {
			if (message.getSubject().equals(subject)) {
				found = true;
				break;
			}

			System.out.println(message.getSubject());
		}

		// TODO: Delete test messages...

		assertTrue(found);
	}
}