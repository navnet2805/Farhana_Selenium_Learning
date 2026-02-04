package Listeners_Package;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListener.class)
public class LoginTest1 {

        @Test
        public void test(){
            System.out.println("Test case executed");
        }


}
