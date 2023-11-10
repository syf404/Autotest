package com.excempe.MulitThread;

import org.testng.annotations.Test;

public class ThreadTest02 {
    @Test
    public void ThredTest01(){
        System.out.println("1111111");
        System.out.printf("Thread %s%n",Thread.currentThread().getId());
    }
    @Test
    public void ThredTest02(){
        System.out.println("222222");
        System.out.printf("Thread %s%n",Thread.currentThread().getId());
    }
    @Test
    public void ThredTest03(){
        System.out.println("33333");
        System.out.printf("Thread %s%n",Thread.currentThread().getId());
    }
}
