package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/cucumber/Webtour.feature"},glue="definition",tags ="@PostiveTesting" ,plugin= {"html:Web/Tour.html"})
//@CucumberOptions(features= {"src/test/resources/cucumber/Webtour.feature"},glue="definition",tags ="@NegativeTesting" ,plugin= {"html:Web/Tour.html"})
public class run_test {

}
