package ua.splinestudio.rentautobus.tests.bdd;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.remote.BrowserType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import ua.splinestudio.rentautobus.appmanager.ApplicationManager;
import ua.splinestudio.rentautobus.tests.TestBase;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;

@CucumberOptions(
        features = "classpath:bdd_tests"
        ,plugin = {"pretty", "html:build/cucumber-report"}
        )
public class RunBddTests extends AbstractTestNGCucumberTests {
/*
        Logger logger = LoggerFactory.getLogger(TestBase.class);

        protected static ApplicationManager app
                = new ApplicationManager(System.getProperty("browser", BrowserType.FIREFOX ));


        @BeforeMethod
        public void logTestStart(Method m, Object[] p){
                logger.info("Start test " + m.getName() + "with parameters" + Arrays.asList(p));
        }

        @AfterMethod(alwaysRun = true)
        public void logTestStop(Method  m){
                logger.info("Stop test "+ m.getName());
        }

 */
}
