package com.teske.finance.cucumber.stepdefs;

import com.teske.finance.FinancialTrackingApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = FinancialTrackingApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
