package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 

@CucumberOptions(features="C:\\Users\\lakmi\\eclipse-workspace5\\BDDFramework\\src\\main\\java\\features",
				glue="step_definition")

public class test_runner {
	

}
