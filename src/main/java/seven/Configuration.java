package seven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@org.springframework.context.annotation.Configuration
@ComponentScan(value = { "seven" })
public class Configuration {

	@Bean
	public AwesomeFeature getAwesomeFeature() {
		return new AwesomeFeatureProvider().createAwesomeFeatureInstance();
	}
}
