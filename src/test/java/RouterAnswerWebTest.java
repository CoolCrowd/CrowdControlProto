import edu.ipd.kit.crowdcontrol.proto.web.FreeMarkerEngine;
import spark.ModelAndView;
import spark.servlet.SparkApplication;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.staticFileLocation;

/**
 * @author LeanderK
 * @version 1.0
 */
public class RouterAnswerWebTest implements SparkApplication {
    /**
     * Invoked from the SparkFilter. Add routes here.
     */
    @Override
    public void init() {
        staticFileLocation("/public");
        FreeMarkerEngine engine = new FreeMarkerEngine();
        get("/assignment/:exID", ((request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("task", "hagia sophia!");
            attributes.put("pic", "https://upload.wikimedia.org/wikipedia/commons/5/52/Jesus-Christ-from-Hagia-Sophia.jpg");
            attributes.put("exdesc", "do something funny");
            attributes.put("expid", "12155236");
            //WTF! Warum haben die in cc das iframe genannt?
            attributes.put("iframe", "https://commons.wikimedia.org/wiki/File:Jesus-Christ-from-Hagia-Sophia.jpg");
            attributes.put("next", "n");
            attributes.put("again", "a");
            attributes.put("sub", "s");

            return new ModelAndView(attributes, "creativeTask.ftl");
        }), engine);

        get("/preview/:exID", ((request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("task", "hagia sophia!");
            attributes.put("pic", "https://upload.wikimedia.org/wikipedia/commons/5/52/Jesus-Christ-from-Hagia-Sophia.jpg");
            attributes.put("exdesc", "do something funny");
            attributes.put("expid", "12155236");
            //WTF! Warum haben die in cc das iframe genannt?
            attributes.put("iframe", "https://commons.wikimedia.org/wiki/File:Jesus-Christ-from-Hagia-Sophia.jpg");
            attributes.put("next", "n");
            attributes.put("again", "a");
            attributes.put("sub", "s");

            return new ModelAndView(attributes, "creativeTaskPreview.ftl");
        }), engine);

        post("/assignment/:expID", ((request, response) -> {
            Map<String, String[]> parameterMap = request.raw().getParameterMap();
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("task", "hagia sophia!");
            attributes.put("pic", "https://upload.wikimedia.org/wikipedia/commons/5/52/Jesus-Christ-from-Hagia-Sophia.jpg");
            attributes.put("exdesc", "do something funny");
            attributes.put("expid", "12155236");
            //WTF! Warum haben die in cc das iframe genannt?
            attributes.put("iframe", "https://commons.wikimedia.org/wiki/File:Jesus-Christ-from-Hagia-Sophia.jpg");
            attributes.put("next", "n");
            attributes.put("again", "a");
            attributes.put("sub", "s");

            return new ModelAndView(attributes, "creativeTask.ftl");
        }), engine);

        post("/assignment/:expID/submit", ((request, response) -> {
            Map<String, String> params = request.params();
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("task", "hagia sophia!");
            attributes.put("pic", "https://upload.wikimedia.org/wikipedia/commons/5/52/Jesus-Christ-from-Hagia-Sophia.jpg");
            attributes.put("exdesc", "do something funny");
            attributes.put("expid", "12155236");
            //WTF! Warum haben die in cc das iframe genannt?
            attributes.put("iframe", "https://commons.wikimedia.org/wiki/File:Jesus-Christ-from-Hagia-Sophia.jpg");
            attributes.put("next", "n");
            attributes.put("again", "a");
            attributes.put("sub", "s");

            return new ModelAndView(attributes, "creativeTask.ftl");
        }), engine);
    }

    public static void main(String[] args) {
        new RouterAnswerWebTest().init();
    }
}
