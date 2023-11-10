package com.excempe;

import org.testng.annotations.Test;

public class exceptionTest {
    @Test(expectedExceptions = RuntimeException.class)
    public void FaildException(){
        System.out.println("这是一个失败的异常测试");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void SuccesdException() {
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }
}
