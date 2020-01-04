package logging;

import com.imcon.*;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Loggers {

    private String name;
    public int price;

    //写入日志类
    public void settext() throws IOException {
        File f = new File("log.txt");
        if (f.exists()) {

            f.createNewFile();

        }

    }


    public Loggers(String name) {

        this.name = name;
        System.out.println(this.name);
        System.out.println(price);

    }


}
