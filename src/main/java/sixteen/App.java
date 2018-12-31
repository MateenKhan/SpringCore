package sixteen;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("sixteen.xml");
		DbPropertyManager propertyManager = context.getBean(DbPropertyManager.class);
		System.out.println(propertyManager.getPorperty("name", "prokarma"));
		context.close();
	}
}
