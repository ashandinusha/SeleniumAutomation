package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class example5 {

    @BeforeClass

    public void beforeClass(){
        System.out.println("I am in before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("I am in after class");
    }
    //BC m1 m2 m3 m4 m5 AC

    @Test
    public void testMethod1(){
        System.out.println("I am in method 1");
    }

    @Test
    public void testMethod2(){
        System.out.println("I am in method 2");
    }

    @Test
    public void testMethod3(){
        System.out.println("I am in method 3");
    }

    @Test
    public void testMethod4(){
        System.out.println("I am in method 4");
    }

    @Test
    public void testMethod5(){
        System.out.println("I am in method 5");
    }
}
