package eighteen;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(value = { "eighteen" })
public class AppConfiguration {

	@Bean(initMethod="init")
	public PropertyManager getMessageService() throws FileNotFoundException, IOException {
		return new PropertyManager();
	}
	
}