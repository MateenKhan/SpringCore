package sixteen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MailPropertyManager{

	private Properties properties;
	private String pathname = "fifteen.properties";

	public String getPorperty(String key, String defaultValue) {
		return this.properties.getProperty(key, defaultValue);
	}

	public void loadConnectionProperties() throws FileNotFoundException, IOException {
		System.out.println("Mail loadConnectionProperties method called");
		File f = new File(getClass().getClassLoader().getResource(pathname).getFile());
		InputStream in = new FileInputStream(f);
		properties = new Properties();
		properties.load(in);
	}

	public void clearConnectionProperties() throws Exception {
		System.out.println("Mail clearConnectionProperties method called");
		this.properties.clear();
	}
}
