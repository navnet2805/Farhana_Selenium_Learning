package DataProvider_TestNG;

import org.testng.annotations.Test;

public class DP_02 {

    @Test(dataProvider = "loginData" , dataProviderClass = DP_01.class)
    public void test1(String username, String password)
    {
        System.out.println("username: " +username);
        System.out.println("password: " +password);
    }

}
