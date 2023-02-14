package tests;

import org.testng.annotations.Test;

import static utilities.SeleniumGridDrivers.*;

public class SeleniumGridTest {

@Test
    public void test01() {


    remoteDriverChromeOptions().get("https://www.amazon.com");

}

//Test
//   public void test02() {

//   remouteDriverFirefoxOptions().get("https://www.google.com");
//   System.out.println(remouteDriverFirefoxOptions().getTitle());

//
 @Test
 public void test03() {

    remouteDriverEdgeOptions().get("https://www.wisequarter.com");
    System.out.println(remouteDriverEdgeOptions().getCurrentUrl());

 }

@Test
    public void test04() {

    remoteDriverChromeOptions().get("https://www.amazon.com");
    remoteDriverChromeOptions().getTitle();
    remouteDriverEdgeOptions().get("https://www.wisequarter.com");
    remouteDriverEdgeOptions().getCurrentUrl();


}

}
