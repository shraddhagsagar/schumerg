/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ShraddhaGanesh
 */
public class SmptestNGTest {
    private WebDriver driver;
    public SmptestNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    System.setProperty("webdriver.chrome.driver", "C:\\data\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
  @Test
  public void testUntitledTestCase1() throws Exception {
    driver.get("https://www.schaumburgmarketplace.com/");
    Thread.sleep(1000);
    driver.get("https://www.schaumburgmarketplace.com/contact/");
//    driver.findElement(By.id("wpforms-52819-field_0")).click();
//    driver.findElement(By.id("wpforms-52819-field_0")).clear();
FileUtil util = new FileUtil();
    driver.findElement(By.id("wpforms-52819-field_0")).clear();
    driver.findElement(By.id("wpforms-52819-field_0")).sendKeys(util.getFname());
    driver.findElement(By.id("wpforms-52819-field_0-last")).clear();
    driver.findElement(By.id("wpforms-52819-field_0-last")).sendKeys(util.getLname());
    driver.findElement(By.id("wpforms-52819-field_3")).clear();
    driver.findElement(By.id("wpforms-52819-field_3")).sendKeys(util.getPhnum());
//    driver.findElement(By.id("wpforms-52819-field_1")).click();
//    driver.findElement(By.id("wpforms-52819-field_1")).clear();
    driver.findElement(By.id("wpforms-52819-field_1")).sendKeys(util.getEmail());
    driver.findElement(By.id("wpforms-52819-field_2")).clear();
    driver.findElement(By.id("wpforms-52819-field_2")).sendKeys(util.getComment());
   // driver.findElement(By.xpath("//*[@id=\"wpforms-submit-52819\"]")).click();
  }
    
  }

    
