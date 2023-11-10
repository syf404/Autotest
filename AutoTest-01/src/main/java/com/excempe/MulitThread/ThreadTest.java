package com.excempe.MulitThread;

import org.testng.annotations.Test;

public class ThreadTest {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void ThreadTest(){
        System.out.println(1);
        System.out.printf("Thread id :%s%n",Thread.currentThread().getId());
    }
}
