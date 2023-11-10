package com.excempe.suit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class suitconfig {

    @AfterSuite
    public void Aftersuitconfig(){
        System.out.println("aftersuitconfig+运行了");
    }
    @BeforeSuite
    public void Beforsuitconfig(){
        System.out.println("Beforsuitconfig+运行了");
    }
    //这里befortest和aftertest有区分
    @BeforeTest
    public void ConfigbeforTest(){
        System.out.println("beforeTest在配置类里的一个区分");
    }
    @AfterTest
    public void ConfigAfterTest(){
        System.out.println("AfterTest在配置类里的一个区分");
    }
}
