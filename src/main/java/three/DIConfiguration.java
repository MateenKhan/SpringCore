package three;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(value = { "two" })
public class DIConfiguration {

	@Bean
	public MessageService getMessageService() {
		return new GmailService();
	}
}