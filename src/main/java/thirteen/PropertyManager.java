package thirteen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.annotation.PostConstruct;

public class PropertyManager { 

	private Properties properties;
	private String pathname = "thirteen.properties";

	public String getPorperty(String key, String defaultValue) {
		return this.properties.getProperty(key, defaultValue);
	}

	@PostConstruct
	public void init() throws FileNotFoundException, IOException {
		System.out.println("init method called");
		File f = new File(getClass().getClassLoader().getResource(pathname).getFile());
		InputStream in = new FileInputStream(f);
		properties = new Properties();
		properties.load(in);

	}

}
