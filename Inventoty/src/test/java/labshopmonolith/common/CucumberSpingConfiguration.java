package labshopmonolith.common;

import io.cucumber.spring.CucumberContextConfiguration;
import labshopmonolith.InventotyApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { InventotyApplication.class })
public class CucumberSpingConfiguration {}
