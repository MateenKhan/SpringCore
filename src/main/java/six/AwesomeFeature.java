package six;

public class AwesomeFeature {

//	must be static
	private static final AwesomeFeature instance = new AwesomeFeature();

	private AwesomeFeature() {
		System.out.println("Object created!!");
	}

	public static AwesomeFeature getInstance() {
		System.out.println("Loading mind blowing stuff!!");
		return instance;
	}

	public void awesomeLogic() {
		System.out.println("Awesomness!!");
	}
}
