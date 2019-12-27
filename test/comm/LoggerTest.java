package comm;

import com.imcon.Loggers;
import com.imooc.test.SingletonOne;
import org.junit.Test;
import com.imcon.Cay;
import java.io.IOException;

public class LoggerTest {

    @Test
    public void settext() throws IOException {
        try {

            SingletonOne one= SingletonOne.getInstance();
            SingletonOne two= SingletonOne.getInstance();
            Loggers tre=new  Loggers();
            Loggers four=new  Loggers();
            System.out.println(tre);
            System.out.println(four);

        }catch(Exception e)
        {

            e.printStackTrace();

        }




    }
}