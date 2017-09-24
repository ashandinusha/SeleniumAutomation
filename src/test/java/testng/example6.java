package testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example6 {

    //BM m1 AM BM m2 am bm m3 am....

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am in before method");
    }

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
        System.out.println("I am in method 2");
    }

    @Test
    public void testMethod4(){
        System.out.println("I am in method 2");
    }

    @Test
    public void testMethod5(){
        System.out.println("I am in method 2");
    }
}
