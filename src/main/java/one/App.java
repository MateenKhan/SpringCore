package one;

public class App {

	public static void main(String[] args) {
		String msg = "Hello Bob";
		String email = "bob@abc.com";
		String phone = "4088888888";
		MessageServiceInjector injector = null;
		Consumer app = null;

		// Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);

		// Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);
		
		//TODO implement fb messenger
	}
}
