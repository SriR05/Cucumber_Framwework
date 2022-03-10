package helperPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Adactin_ConfigurationReader {
	public static Properties prop;
	public Adactin_ConfigurationReader() throws IOException {
		File file = new File("/Users/srilakshmi/eclipse-workspace/Cucumber.fram/src/test/java/properties/Adactin.properties");
		FileInputStream inputFile = new FileInputStream(file);
		prop = new Properties();
		prop.load(inputFile);
	}
	
	public String getBrowser() {
		String nameBrowser = prop.getProperty("Browsername");
		return nameBrowser;
		
	}
	public String getUrl() {
		String Url = prop.getProperty("Url");
		return Url;
		
	}
	
	public String userName() {
		String nameUser = prop.getProperty("Username");
		return nameUser;
}
	public String passWord() {
		String namePass = prop.getProperty("Password");
		return namePass;
	}
	public String ccNo() {
		String noCC = prop.getProperty("creditcard");
		return noCC;
	}
	public String cvvNo() {
		String noCVV = prop.getProperty("cvv");
		return noCVV;
	}
}