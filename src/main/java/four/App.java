package four;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("four.xml");
		AwesomeFeature awesomeFeature = context.getBean(AwesomeFeature.class);
		awesomeFeature.awesomeLogic();
		context.close();
	}
}
