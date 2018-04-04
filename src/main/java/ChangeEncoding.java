package main.java;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ChangeEncoding {

    public static void searchKeywords(String path) {
        try (Reader reader = new InputStreamReader(new FileInputStream(path),"UTF-8");
             Writer writer = new OutputStreamWriter(new FileOutputStream("src\\main\\java\\resources\\" +
                     "fileIN16.txt"),"UTF-16"))
        {


            int len;
            while ((len = reader.read()) != -1)
            {
                writer.write(len);
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
