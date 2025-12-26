package TestNG_01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_01 {


    @Test(enabled = true)
    public void testcase1()
    {
        System.out.println("test case 1 executed");
    }

    @Test(priority = 3)
    public void testcase4()
    {
        System.out.println("test case 2 executed");
    }

    @Test(dependsOnMethods = "testcase5")
    public void testcase3()
    {
        System.out.println("test case 3 executed");
    }


    @Test(priority = 4)
    public void testcase2()
    {
        System.out.println("test case 4 executed");
    }

    @Test
    public void testcase5()
    {
        System.out.println("test case 5 executed");
    }





}
