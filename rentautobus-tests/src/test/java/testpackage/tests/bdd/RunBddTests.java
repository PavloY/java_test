package testpackage.tests.bdd;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = "classpath:bdd_tests"
        ,plugin = {"pretty", "html:build/cucumber-report"}
        )
public class RunBddTests extends AbstractTestNGCucumberTests {

}
