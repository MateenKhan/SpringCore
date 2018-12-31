package fifteen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PropertyManager implements InitializingBean, DisposableBean {

	private Properties properties;
	private String pathname = "fifteen.properties";

	public String getPorperty(String key, String defaultValue) {
		return this.properties.getProperty(key, defaultValue);
	}

	public void afterPropertiesSet() throws FileNotFoundException, IOException {
		System.out.println("afterPropertiesSet method called");
		File f = new File(getClass().getClassLoader().getResource(pathname).getFile());
		InputStream in = new FileInputStream(f);
		properties = new Properties();
		properties.load(in);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method called");
		this.properties.clear();
	}
}
