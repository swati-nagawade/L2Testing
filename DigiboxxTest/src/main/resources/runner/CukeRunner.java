package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;


public class CukeRunner {

	@RunWith(Cucumber.class)
	@CucumberOptions(
		features ={"C:\\Users\\thora\\git\\L2Testing\\DigiboxxTest\\src\\main\\java\\Feature\\Digiboxx.feature"}
		,glue = {"stepdefinitions"},
		//plugin = {"pretty","test-output"},
		monochrome =true,
		
		tags = {"@smokeTest"}
	)


	public class TestRunner {

	}


	}


