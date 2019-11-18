package logging;

import java.io.File;
import java.io.IOException;

public class Logger {


    public void settext() throws IOException {
        File f =new File("log.txt");
        if(f.exists())
        {

            f.createNewFile();

        }


    }




}
