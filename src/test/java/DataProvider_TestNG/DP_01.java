package DataProvider_TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP_01 {

    @DataProvider(name = "loginData")
    public Object[][] loginDataMethod()
    {
        return new Object[][]
                {
                        {"user1","password1"},
                        {"admin","12345"},
                        {"user2","password2"}
                };
    }


    @Test(dataProvider = "loginData" )
    public void test1(String username, String password)
    {
        System.out.println("username: " +username);
        System.out.println("password: " +password);
    }
}
