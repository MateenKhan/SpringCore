package three;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("three.xml");
		MyApplication app = context.getBean(MyApplication.class);

		app.processMessage("Hello bob!!", "bob@abc.com");

		context.close();
	}
}
