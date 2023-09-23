package BDD.Login;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue = {"BDD/Login"},
        features = {"src/test/java/BDD/Login/login.feature"},
        plugin = {"pretty","html:tsrget/cucumber-html-report"},
        monochrome = true)
public class LoginRunner extends AbstractTestNGCucumberTests{

}
