package testks.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import testks.AaaApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { AaaApplication.class })
public class CucumberSpingConfiguration {}
