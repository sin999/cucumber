package ru.sin666.testing.webdriver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes =  WebDriverFactoryTest.class)
@Configuration
@ComponentScan("ru.sin666.testing.webdriver")
@PropertySource("classpath:test-webdriver.property")
public class WebDriverFactoryTest {

    @Autowired
    private WebDriver webDriver;


    @Test
    public void checkIfWebDriverInjectedProperly(){
        assertNotNull(webDriver);
    }

    @Test
    public void openPage(){
        webDriver.navigate().to("http://ya.ru");
        WebElement element_enter = webDriver.findElement(By.id("text"));
        element_enter.sendKeys("selecium cucumber");
//        webDriver.get_screenshot_as_file("capture.png");
        webDriver.close();
    }

}