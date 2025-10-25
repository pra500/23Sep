package pac1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Propertiesprac {


    public static void main(String[] args) throws Exception {


        String filpath="C:\\Users\\pragt\\IdeaProjects\\proj1\\src\\pac1\\config.properties";

        FileInputStream fip = new FileInputStream(filpath);

        Properties prop=new Properties();

        prop.load(fip);

     String url=   prop.getProperty("url");
      String  username = prop.getProperty("username");

        System.out.println(url);
        System.out.println(username);



    }

}
