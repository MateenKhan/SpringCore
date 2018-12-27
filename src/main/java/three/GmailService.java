package three;

public class GmailService implements MessageService {

	@Override
	public boolean sendMessage(String msg, String rec) {
		// logic to send email
		System.out.println("Email sent to " + rec + " with Message=" + msg);
		return true;
	}

}
