package com.excempe.Paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DateProvaderTest {

    @Test(dataProvider =  "pre")
    public void paramter (String name,Integer age){
        System.out.println("name="+name+" age"+age);
    }
    @DataProvider(name = "pre")
    public Object[][] PreDateProvider(){
        Object [][] pre={
                {"zs",12},
                {"lisi",15},
                {"wangwu",19}
        };
        return pre;
    }
    //一个好玩的方法
    @Test(dataProvider = "pre02")
    public void test01(String name,Integer age){
        System.out.println("测试test01方法"+name+"年龄是"+age);
    }
    @Test(dataProvider = "pre02")
    public void test02(String name,Integer age){
        System.out.println("测试test02方法"+name+"年龄是"+age);
    }
    @DataProvider(name = "pre02")
    public Object[][] preDate02(Method method){
        Object [][] result;
        if(method.getName().equals("test01")){
            result=new Object[][]{
                    {"zs",15},
                    {"cj",16}
            };

        }else {
            result=new Object[][]{
                    {"dd",125},
                    {"ll",169}
            };
        }
        return result;
    }
}
