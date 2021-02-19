import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReadWrite;


import java.io.FileInputStream;
import java.io.IOException;


import java.io.FileNotFoundException;



public class Mvn2 {
    @Test
    public void naveen() throws IOException, InterruptedException {

        System.setProperty("webdriver.chrome.driver","./src/test/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

       /* Dimension n = new Dimension(360,592);
        driver.manage().window().setSize(n);
        Thread.sleep(3000);*/

        driver.findElement(By.xpath("//input[@id ='email']")).sendKeys(ReadWrite.readData("fb",0,0));
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id ='pass']")).sendKeys(ReadWrite.readData("google",1,1));
        System.out.println(ReadWrite.readData("fb",0,0));
        System.out.println(ReadWrite.readData("google",1,1));
        Thread.sleep(3000);
        driver.quit();

        ReadWrite.writeData("google",2,0,"anuti");

    }
}
