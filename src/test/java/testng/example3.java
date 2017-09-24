package testng;

import org.testng.annotations.Test;

public class example3 {

    @Test
    public void testMethod1(){
        System.out.println("I am in method 1");
    }

    @Test(invocationCount = 5, invocationTimeOut = 5)
    public void testMethod2(){
        //selenium code will go here

        System.out.println("I am in method 2");

    }

    @Test
    public void testMethod3(){
        System.out.println("I am in method 3");
    }
}
