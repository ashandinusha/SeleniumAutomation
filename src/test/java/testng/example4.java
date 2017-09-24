package testng;

import org.testng.annotations.Test;

public class example4 {

    @Test
    public void testMethod1(){
        System.out.println("I am in method 1");
    }

    @Test(enabled = false)
    public void testMethod2(){
        System.out.println("I am in method 2");
    }

    @Test
    public void testMethod3(){
        System.out.println("I am in method 3");
    }
}
