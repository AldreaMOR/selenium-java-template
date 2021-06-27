package com.osf;

import io.github.bonigarcia.seljup.SeleniumJupiter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@ExtendWith(SeleniumJupiter.class)
class PageGoogleHomeUnitTest {

    private static String URL_SITE = "https://osf.digital/pt-br";

    @Test
    void shouldCheckTitleSiteInFirefoxChrome(FirefoxDriver firefoxDriver, ChromeDriver chromeDriver) {
        chromeDriver.get(URL_SITE);
        Assertions.assertEquals("OSF Digital | Formerly known as OSF Global",
                chromeDriver.getTitle());

        firefoxDriver.get(URL_SITE);
        Assertions.assertEquals("OSF Digital | Formerly known as OSF Global",
                firefoxDriver.getTitle());
    }
}
