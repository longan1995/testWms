package com.testWms.basicManagement;

import bean.login;
import element.basicManagement.warehouseManagement;
import element.beforeTestWarehouse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Set;

public class warehouseMangement {
    public WebDriver webDriver;

    @BeforeClass
    public void setUpEnv(){
        Path path = Paths.get("src","drivers","chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",path.toAbsolutePath().toString());

        //创建浏览器实例
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(beforeTestWarehouse.getUserCenterUrl());
        //定位到账号
        WebElement username_enter = webDriver.findElement(By.xpath(beforeTestWarehouse.getUsername()));
        username_enter.clear();
        username_enter.sendKeys(login.getUsername());//输入账号

        //定位到密码
        WebElement passwd_enter = webDriver.findElement(By.xpath(beforeTestWarehouse.getPassword()));
        passwd_enter.clear();
        passwd_enter.sendKeys(login.getPassword());//输入密码

        WebElement userCenter = webDriver.findElement(By.xpath(beforeTestWarehouse.getUCLoginButton()));
        //点击登录用户中心
        userCenter.click();
        //隐式等待
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    //新wms系统
    @Test(priority = 1)
    public void testSwithchWindows(){
        //智慧仓储系统
        webDriver.findElement(By.xpath(beforeTestWarehouse.getWarehouseSystem())).click();
        //当前页面句柄
        String currentwindows = webDriver.getWindowHandle();
        //存放句柄
        Set<String> allWindows = webDriver.getWindowHandles();
        for (String window:allWindows){
            if (window != currentwindows){
                webDriver.switchTo().window(window);
            }
        }
    }
    //基础管理
    @Test(priority = 2)
    public void basicManager(){
        WebDriverWait wait = new WebDriverWait(webDriver,10);
        WebElement oms = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(beforeTestWarehouse.getBasicManagement())));
        oms.click();

    }
    /**
     * 仓库管理
     *
     * */
    @Test(priority = 3)
    public void warehouseManagement(){
        WebDriverWait wait = new WebDriverWait(webDriver,10);
        WebElement oms = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(warehouseManagement.getWarehouseHtml())));
        oms.click();
    }

    @AfterClass
    public void quitEnv(){
        webDriver.quit();
    }
}
