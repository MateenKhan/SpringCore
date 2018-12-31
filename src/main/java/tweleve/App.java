package tweleve;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("tweleve.xml");
		PropertyManager propertyManager = context.getBean(PropertyManager.class);
		System.out.println(propertyManager.getPorperty("name", "prokarma"));
		context.close();
	}
}
