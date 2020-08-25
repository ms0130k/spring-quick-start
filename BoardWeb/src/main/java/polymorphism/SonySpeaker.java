package polymorphism;

public class SonySpeaker implements Speaker {

	public SonySpeaker() {
		System.out.println(">> Sony speaker was constructed");
	}

	@Override
	public void volumeUp() {
		System.out.println(">>> Sony speaker volume up");
	}
}
