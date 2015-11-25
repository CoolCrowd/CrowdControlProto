package edu.ipd.kit.crowdcontrol.proto.web;

import edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.pojos.Experiment;
import spark.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by skorz on 21.11.15.
 */
public class CreativeTaskView implements TaskView {
    private final Experiment experiment;
    private final boolean again;

    public CreativeTaskView(Experiment experiment, boolean again) {
        this.experiment = experiment;
        this.again = again;
    }

    @Override
    public ModelAndView render() {
        //TODO is ok, but looks shitty. Also cryptic HashMap
        Map<String, Object> attributes = new HashMap<>();
        attributes.put("task", experiment.getQuestion());
        String pictureUrl = experiment.getPictureUrl();
        if (pictureUrl == null) pictureUrl = "";
        attributes.put("pic", pictureUrl);
        attributes.put("exdesc", experiment.getAnswerDescription());
        attributes.put("expid", experiment.getIdexperiment());
        //WTF! Warum haben die in cc das iframe genannt?
        String pictureLicenseUrl = experiment.getPictureLicenseUrl();
        if (pictureLicenseUrl == null) pictureLicenseUrl = "";
        attributes.put("iframe", pictureLicenseUrl);
        if (again) {
            attributes.put("next", "n");
            attributes.put("sub", "s");
        } else {
            attributes.put("next", "");
            attributes.put("sub", "only");
        }
        attributes.put("again", "");
        return new ModelAndView(attributes, "creativeTask.ftl");
    }
}
