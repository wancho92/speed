package speed.common;


import speed.주문Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { 주문Application.class })
public class CucumberSpingConfiguration {
    
}
