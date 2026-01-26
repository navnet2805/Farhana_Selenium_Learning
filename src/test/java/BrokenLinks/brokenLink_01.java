package BrokenLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class brokenLink_01 {
    public static void main(String[] args) {

        int count = 0;

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.deadlinkcity.com/");

        List<WebElement> links = driver.findElements(By.tagName("a")); // all the link
        System.out.println(links.size()); //print number of links //48

        for (WebElement element : links)
        {
            String hrefValue = element.getAttribute("href");

            if (hrefValue==null || hrefValue.isEmpty())
            {
                System.out.println("can not find link is broken or not");

            }

            //href -> URL -> connect -> get response in terms of status code -> verify


            try {
                //href -> URL
                URL url = new URL(hrefValue);

                // URL -> connect
                HttpURLConnection urlconnect = (HttpURLConnection) url.openConnection();

                //press the Enter button
                urlconnect.connect();

                //get response from API
                int statusCode = urlconnect.getResponseCode();

                if (statusCode >=400)
                {
                    System.out.println(url + "is a broken link");
                }
                else {
                    System.out.println(url + "is not a broken link");
                }
            }catch (Exception e)
            {

            }


        }


        driver.quit();

    }
}
