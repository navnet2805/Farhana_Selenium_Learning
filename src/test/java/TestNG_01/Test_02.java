package TestNG_01;

import org.testng.annotations.*;

public class Test_02 {

    @BeforeSuite
    public void test1()
    {
        System.out.println("1");
    }

    @BeforeTest
    public void test2()
    {
        System.out.println("2");
    }

    @BeforeClass
    public  void test3()
    {
        System.out.println("3");
    }

    @BeforeMethod
    public  void test4()
    {
        System.out.println("4");
    }

    @Test
    public void test5()
    {
        System.out.println("5");
    }

    @AfterMethod
    public  void test6()
    {
        System.out.println("6");
    }

    @AfterClass
    public void test7()
    {
        System.out.println("7");
    }

    @AfterTest
    public void test8()
    {
        System.out.println("8");
    }

    @AfterSuite
    public void test9()
    {
        System.out.println("9");
    }

}
