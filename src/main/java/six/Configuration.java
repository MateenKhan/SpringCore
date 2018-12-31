package six;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@org.springframework.context.annotation.Configuration
@ComponentScan(value = { "six" })
public class Configuration {

	@Bean
	public AwesomeFeature getAwesomeFeature() {
		return AwesomeFeature.getInstance();
	}
}
