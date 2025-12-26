import org.testng.annotations.Test;

public class TestNG_invocationCount {

    @Test(invocationCount = 5)
    public void testcase1()
    {
        System.out.println("test case is executed");
    }
}
