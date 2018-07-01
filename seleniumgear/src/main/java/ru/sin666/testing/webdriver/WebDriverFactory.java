package ru.sin666.testing.webdriver;

import org.mockito.Mockito;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

@Configuration
public class WebDriverFactory {
    @Value("${webdriver.chrome.driver}")
    private String chromeDriverLocation;

    @Bean
    public WebDriver getWebDriver() {
        setUpDriverLocation();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        return new ChromeDriver(options);
//        return Mockito.mock(WebDriver.class);
    }


    private void setUpDriverLocation(){

        System.setProperty("webdriver.chrome.driver", (new File(chromeDriverLocation)).getAbsolutePath() );
    }
}
