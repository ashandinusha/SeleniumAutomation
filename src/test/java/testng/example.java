package testng;

import org.testng.annotations.Test;

public class example {

    @Test(priority = 3)
    public void testMethod1(){
        System.out.println("I am in method 1");
    }

    @Test(priority = 2)
    public void testMethod2(){
        System.out.println("I am in method 2");
    }

    @Test(priority = 1)
    public void testMethod3(){
        System.out.println("I am in Method 3");
    }
}
