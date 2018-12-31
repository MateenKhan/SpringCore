package fifteen;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("fifteen.xml");
		PropertyManager propertyManager = context.getBean(PropertyManager.class);
		System.out.println(propertyManager.getPorperty("name", "prokarma"));
		context.close();
	}
}
