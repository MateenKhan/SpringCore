package three;

public class MyApplication {

	private MessageService service;

	public void setService(MessageService svc) {
		this.service = svc;
	}

	public boolean processMessage(String msg, String rec) {
		return this.service.sendMessage(msg, rec);
	}
}