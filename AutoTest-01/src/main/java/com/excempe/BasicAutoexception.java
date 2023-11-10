package com.excempe;


import org.testng.annotations.*;

public class BasicAutoexception {

    @Test
    public void test01(){
    System.out.println("妈的终于好了+");
    }
    @Test
    public void test02(){
        System.out.println("测试用例02");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("方法前运行，测试顺序01" );
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("方法之后运行+a01");
    }
    @AfterMethod
    public void afterMethod02(){
        System.out.println("方法之后运行+a02");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("berforeclass");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass");
    }
    @BeforeSuite
    public void Beforesuit(){
        System.out.println("执行前测试套件");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("执行后测试套件");
    }
}
