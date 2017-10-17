package com.CucumberMaven;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		format = { "pretty","json:target/json/output.json","html:target/html/output.html","junit:target/junit/output.junit"},
		features = "src/test/resources"
		)
public class Runner {

}
