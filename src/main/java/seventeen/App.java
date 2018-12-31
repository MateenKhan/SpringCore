package seventeen;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("seventeen.xml");
		MysqlPropertyManager propertyManager = context.getBean(MysqlPropertyManager.class);
		System.out.println(propertyManager.getPorperty("name", "prokarma"));
		context.close();
	}
}
