package com.CathKidston;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags = {"@SmokePack"},plugin = {"pretty","html:test-out"})
public class TestRunner {
}
