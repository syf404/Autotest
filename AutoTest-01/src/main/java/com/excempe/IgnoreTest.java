package com.excempe;

import org.testng.annotations.Test;

public class IgnoreTest {
    //忽略测试
    @Test
    public void IgnoreTest(){
        System.out.println("能执行的测试01");
    }
    @Test
    public void IgnoreTest02(){
        System.out.println("不能执行的测试02");
    }
}
