package speed.common;


import speed.상품Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { 상품Application.class })
public class CucumberSpingConfiguration {
    
}
