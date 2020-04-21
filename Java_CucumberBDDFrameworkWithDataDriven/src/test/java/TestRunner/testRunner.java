package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import junit.framework.Assert;

@RunWith(Cucumber.class)

@CucumberOptions
        (
        		
        		features="E:\\Andriod studio\\eclips 2019\\works\\Java_CucumberBDDFramework\\src\\test\\java\\Feature\\login.feature",
        		glue="StepDef",
        		dryRun = false,
        		monochrome = true,
        		plugin = {"pretty","html:test-output"}
        		
		)

public class testRunner {
	
	
	
}
