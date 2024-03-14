package testCase;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		Properties properties = new Properties();
		FileInputStream inputstream = new FileInputStream("C:\\java files\\SeleniumTraining\\src\\test\\resources\\Properties\\testdata.properties");
		properties.load(inputstream);
		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("url"));
		
		FileOutputStream outputstream = new FileOutputStream("C:\\java files\\SeleniumTraining\\src\\test\\resources\\Properties\\testdata.properties");
		properties.setProperty("testdate","09-04-2022");
		properties.store(outputstream, "This is Date");
		System.out.println(properties.getProperty("testdate"));

	}

}
