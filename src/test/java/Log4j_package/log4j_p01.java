package Log4j_package;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class log4j_p01 {
    public static void main(String[] args) {
        Logger log = LogManager.getLogger(log4j_p01.class);
        System.out.println("test case passed");
        log.info("test case passed");

    }

}
