package com.excempe;

import org.testng.annotations.Test;

public class TimeOutTest {
    @Test(timeOut = 4000)
    public void TimeOutSucceed()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test(timeOut = 2000)
    public void TimeOutFiled()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
