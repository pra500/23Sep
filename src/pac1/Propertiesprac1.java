package pac1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Propertiesprac1 {


    public static void main(String[] args) throws Exception {


String filepath ="C:\\Users\\pragt\\IdeaProjects\\proj1\\src\\pac1\\config1.properties";

FileOutputStream  fop=new FileOutputStream(filepath);

Properties prop=new Properties();


prop.setProperty("url", "https://practicetestautomation.com/practice-test-login/");

prop.store(fop, "this is");


        fop.close();













    }

}
