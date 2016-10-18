package com.example.tests;

import com.thoughtworks.selenium.*;
import java.util.regex.Pattern;

public class temp script extends SeleneseTestCase {
    public void setUp() throws Exception {
        setUp("https://predix.io/", "*iexplore");
    }
    public void testTemp script() throws Exception {
        selenium.open("/#");
        selenium.click("link=Sign in");
        selenium.waitForPageToLoad("30000");
        selenium.type("name=username", "bert");
        selenium.type("name=password", "biz");
        selenium.click("name=Sign in");
        selenium.waitForPageToLoad("30000");
    }
}
