package com.teksenz.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test(priority = 1,testName ="login test with valid username and password" )
    public void loginWithValidUserTest(){
        System.out.println("login test with valid user and password");
        String exp = "Hello";
        String act = "Hello";
        Assert.assertEquals(act,exp,"The words do not match");
    }

@Test(priority = 2,testName = "Login test with invalid username and password")
    public void loginWithInvalidUser(){
        System.out.println("Login test with invalid user");
    }
    @Test(priority = 3,testName ="verify home page test" )
    public  void homePageTest(){
        System.out.println("This is a home page test");
    }
    @Test(priority = 4,testName = "verify logout test")
    public void logoutTest(){
        System.out.println("This is a logout test");
    }
}
