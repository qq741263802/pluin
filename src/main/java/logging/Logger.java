package logging;

import java.io.File;
import java.io.IOException;

public class Logger {

//写入日志类
    public void settext() throws IOException {
        File f =new File("log.txt");
        if(f.exists())
        {

            f.createNewFile();

        }


    }




}
