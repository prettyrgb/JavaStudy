package Basic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by jzhang1 on 2015/6/12.
 */
public class Containers {
    public static void main(String[] args) {
        PropertiesTest();
    }

    public static void PropertiesTest() {
        //????ini??? ????????
        Properties properties = new Properties();
        properties.setProperty("Key1","Value1");
        properties.setProperty("Key2","Value2");

        //save to file
        FileOutputStream out = null;
        try {
             out = new FileOutputStream("configTest.properties");
            properties.store(out,"some comments");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
