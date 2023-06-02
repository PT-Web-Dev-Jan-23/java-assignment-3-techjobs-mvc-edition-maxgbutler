package org.launchcode.techjobs.mvc.controllers;

import org.launchcode.techjobs.mvc.models.JobData;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

public class TechJobsController {

    public static HashMap<String, String> actionChoices = new HashMap<>();
    static HashMap<String, String> columnChoices = new HashMap<>();
    static HashMap<String, Object> tableChoices = new HashMap<>();

    public TechJobsController () {
        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");

        columnChoices.put("all", "All");
        columnChoices.put("employer", "Employer");
        columnChoices.put("location", "Location");
        columnChoices.put("positionType", "Position Type");
        columnChoices.put("coreCompetency", "Skill");

        tableChoices.put("all", "View All");
        tableChoices.put("employer", JobData.getAllEmployers());
        tableChoices.put("location", JobData.getAllLocations());
        tableChoices.put("positionType", JobData.getAllPositionTypes());
        tableChoices.put("coreCompetency", JobData.getAllCoreCompetency());
    }

    @ModelAttribute(value = "actions")
    public static HashMap<String, String> getActionChoices() {
        return actionChoices;
    }

    @ModelAttribute(value = "columnChoices")
    public static HashMap<String, String> getColumnChoices() { return columnChoices; }

    @ModelAttribute(value = "tableChoices")
    public static HashMap<String, Object> getTableChoices() { return tableChoices; }
}
