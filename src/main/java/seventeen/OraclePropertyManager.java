package seventeen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class OraclePropertyManager{

	private Properties properties;
	private String pathname = "seventeen.properties";

	public String getPorperty(String key, String defaultValue) {
		return this.properties.getProperty(key, defaultValue);
	}

	public void init() throws FileNotFoundException, IOException {
		System.out.println("Oracle init method called");
		File f = new File(getClass().getClassLoader().getResource(pathname).getFile());
		InputStream in = new FileInputStream(f);
		properties = new Properties();
		properties.load(in);
	}

	public void destroy() throws Exception {
		System.out.println("Oracle destroy method called");
		this.properties.clear();
	}
}
