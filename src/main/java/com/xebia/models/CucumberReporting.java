package com.xebia.models;


import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CucumberReporting {

    private static final String BUILD_PROJECT = "Cucumber-example-project";
    private static final String BUILD_NUMBER = "1";
    private static final String PLUGIN_URL_PATH = "";
    private static final Boolean SKIPPED_FAILS = false;
    private static final Boolean UNDEFINED_FAILS = false;
    private static final Boolean FLASH_CHARTS = true;
    private static final Boolean RUN_WITH_JENKINS = false;
    private static final Boolean ARTIFACTS_ENABLED = false;
    private static final String ARTIFACT_CONFIG = "";
    private static final Boolean HIGH_CHARTS = false;

    public static void generateReport() throws Exception {
        String targetDir = String.format("%s/target/", new java.io.File( "." ).getCanonicalPath());
        File reportDirectory = new File(String.format("%s/cucumber-reports/", targetDir));
        ReportBuilder reportBuilder = new ReportBuilder(getJsonReportFiles(targetDir), reportDirectory, PLUGIN_URL_PATH, BUILD_NUMBER, BUILD_PROJECT, SKIPPED_FAILS, UNDEFINED_FAILS, FLASH_CHARTS, RUN_WITH_JENKINS, ARTIFACTS_ENABLED, ARTIFACT_CONFIG, HIGH_CHARTS);
        reportBuilder.generateReports();
    }

    private static List<String> getJsonReportFiles(String jsonDir) {
        List<String> jsonReportFiles = new ArrayList<String>();
        jsonReportFiles.add(jsonDir + "cucumber.json");
        return jsonReportFiles;
    }


}