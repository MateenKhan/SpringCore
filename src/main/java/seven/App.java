package seven;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
		AwesomeFeature awesomeFeature = context.getBean(AwesomeFeature.class);
		awesomeFeature.awesomeLogic();
		context.close();
	}
}
