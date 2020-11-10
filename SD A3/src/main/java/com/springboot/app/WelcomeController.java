package com.springboot.app;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.*;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

@Controller
public class WelcomeController {

    @Value("${application.title}")
    private String title = "";
    @Value("${application.datentime}")
    private String datentime = "";
    @Value("${application.location}")
    private String location = "";
    @Value("${application.partya}")
    private String partya = "";
    @Value("${application.partyb}")
    private String partyb = "";
    @Value("${application.vehicleowner}")
    private String vehicleowner = "";
    @Value("${application.vehiclenumber}")
    private String vehiclenumber = "";
    @Value("${application.riskassessment}")
    private String riskassessment = "";
    @Value("${application.fireassessment}")
    private String fireassessment = "";
    @Value("${application.assessment1}")
    private String assessment1 = "";
    @Value("${application.assessment2}")
    private String assessment2 = "";
    @Value("${application.hazard}")
    private String hazard = "";
    @Value("${application.personsrisk}")
    private String personsrisk = "";
    @Value("${application.controlrisk}")
    private String controlrisk = "";


    
    @GetMapping("/input")
    public String index(Model model) {
    	model.addAttribute("title", title);
    	model.addAttribute("datentime", datentime);
    	model.addAttribute("location", location);
    	model.addAttribute("partya", partya);
    	model.addAttribute("partyb", partyb);
    	model.addAttribute("vehicleowner", vehicleowner);
    	model.addAttribute("vehiclenumber", vehiclenumber);
    	model.addAttribute("riskassessment", riskassessment);
    	model.addAttribute("fireassessment", fireassessment);
    	model.addAttribute("assessment1", assessment1);
    	model.addAttribute("assessment2", assessment2);
    	model.addAttribute("hazard", hazard);
    	model.addAttribute("personsrisk", personsrisk);
    	model.addAttribute("controlrisk", controlrisk);


        return "input";
    }
    @PostMapping("/data")
    public String index( @RequestParam Map<String,String> params, Model model) {
        //Instantiate date
//        Date date = new Date(0, 0, 0);
        model.addAttribute("Date","date");
//        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
//
//        model.addAttribute("Time", params.get("datentime"));
        model.addAttribute("locationI", params.get("locationI"));
        
        model.addAttribute("vehicleOwnerFullNameA", params.get("vehicleOwnerFullNameA"));
        model.addAttribute("vehicleRegistrationNumberA", params.get("vehicleRegistrationNumberA"));
        model.addAttribute("vehicleOwnerFullNameB", params.get("vehicleOwnerFullNameB"));
        model.addAttribute("vehicleRegistrationNumberB", params.get("vehicleRegistrationNumberB"));

        model.addAttribute("RiskAssessmentOneHazard", params.get("RiskAssessmentOneHazard"));
        model.addAttribute("RiskAssessmentOnePersonsAtRisk", params.get("RiskAssessmentOnePersonsAtRisk"));
        model.addAttribute("riskAssessmentOneControlToMinimizeRisk", params.get("riskAssessmentOneControlToMinimizeRisk"));

        model.addAttribute("RiskAssessmentTwoHazard", params.get("RiskAssessmentTwoHazard"));
        model.addAttribute("RiskAssessmentTwoPersonsAtRisk", params.get("RiskAssessmentTwoPersonsAtRisk"));
        model.addAttribute("riskAssessmentTwoControlToMinimizeRisk", params.get("riskAssessmentTwoControlToMinimizeRisk"));

        model.addAttribute("RiskAssessmentThreeHazard", params.get("RiskAssessmentThreeHazard"));
        model.addAttribute("RiskAssessmentThreePersonsAtRisk", params.get("RiskAssessmentThreePersonsAtRisk"));
        model.addAttribute("riskAssessmentThreeControlToMinimizeRisk", params.get("riskAssessmentThreeControlToMinimizeRisk"));

        model.addAttribute("RiskAssessmentFourHazard", params.get("RiskAssessmentFourHazard"));
        model.addAttribute("RiskAssessmentFourPersonsAtRisk", params.get("RiskAssessmentFourPersonsAtRisk"));
        model.addAttribute("riskAssessmentFourControlToMinimizeRisk", params.get("riskAssessmentFourControlToMinimizeRisk"));
        
        return "data";
    }



}
