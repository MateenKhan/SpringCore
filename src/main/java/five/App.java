package five;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("five.xml");
		AwesomeFeature awesomeFeature = context.getBean(AwesomeFeature.class);
		awesomeFeature.awesomeLogic();
		context.close();
	}
}
