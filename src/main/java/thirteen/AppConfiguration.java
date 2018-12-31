package thirteen;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(value = { "thirteen" })
public class AppConfiguration {

	@Bean
	public PropertyManager getMessageService() {
		return new PropertyManager();
	}
}