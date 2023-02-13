package tests;

import org.testng.annotations.Test;

import static utilities.SeleniumGridDrivers.remoteDriverChromeOptions;
import static utilities.SeleniumGridDrivers.remoteDriverEdgefoxOptions;


public class SeleniumGridTest {


    @Test
    public void test01(){

        remoteDriverChromeOptions().get("https://www.amazon.com");
    }


    @Test
    public void test02(){

        remoteDriverEdgefoxOptions().get("https://www.google.com");
        System.out.println(remoteDriverEdgefoxOptions().getTitle());

    }
    @Test
    public void test03(){

        remoteDriverChromeOptions().get("https://www.wisequarter.com");
        remoteDriverChromeOptions().get("https://www.google.com");
        remoteDriverEdgefoxOptions().get("https://www.amazon.com");


    }
}
