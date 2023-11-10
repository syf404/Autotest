package com.excempe.Paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paramterTest {
    @Test
    @Parameters({"name","age"})
    public void Paramter(String name,Integer age){
        System.out.println(name+"这是名称"+","+"这是年龄"+age);

    }
}
