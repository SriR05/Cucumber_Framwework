package helperPackage;

import java.io.IOException;

public class Adactin_FileReaderManager {
	
private Adactin_FileReaderManager() {
	
}

public static Adactin_FileReaderManager getInstance() {
	
	Adactin_FileReaderManager readme = new Adactin_FileReaderManager();
	return readme;
}
public Adactin_ConfigurationReader getAcrInstance() throws IOException {
	Adactin_ConfigurationReader Acr = new Adactin_ConfigurationReader();
	return Acr;
	
}

}
