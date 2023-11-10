package com.excempe;

import org.testng.annotations.Test;

public class DependTest {
    @Test
    public void dependTest01(){
        System.out.println("这是被依赖的测试");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"dependTest01"})
    public void dependTest02(){
        System.out.println("这是需要依赖的测试");
    }
}
