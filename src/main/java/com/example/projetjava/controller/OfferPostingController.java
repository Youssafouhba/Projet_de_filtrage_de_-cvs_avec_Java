package com.example.projetjava.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class OfferPostingController {
    @FXML
    private Label titleLabel;

    @FXML
    private Label descriptionLabel;

    @FXML
    private Label startDateLabel;

    @FXML
    private Label locationLabel;

    public void setJobPostingDetails(String title, String description, String startDate, String location) {
        titleLabel.setText("Job Title: " + title);
        descriptionLabel.setText("Description: " + description);
        startDateLabel.setText("Start Date: " + startDate);
        locationLabel.setText("Location: " + location);
    }
}
