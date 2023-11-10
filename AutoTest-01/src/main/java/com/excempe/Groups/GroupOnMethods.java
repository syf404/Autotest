package com.excempe.Groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupOnMethods {
    @Test(groups = "Group01")
    public void Groups01(){
        System.out.println("这是群组测试01");
    }
    @Test(groups = "Group01")
    public void Groups02(){
        System.out.println("这是群组测试02");
    }
    @Test(groups = "Group01")
    public void Groups03(){
        System.out.println("这是群组测试03");
    }
    @Test(groups = "Group01")
    public void Groups04(){
        System.out.println("这是群组测试04");
    }
    @Test(groups = "Group02")
    public void NewGroup(){
        System.out.println("这是新群组测试02");
    }
    @BeforeGroups("Group01")
    public void Beforegroups01(){
        System.out.println("这是组测试之前测试");
    }
    @AfterGroups("Group01")
    public void Aftergroups01(){
        System.out.println("这是组测试之后测试");
    }
}
