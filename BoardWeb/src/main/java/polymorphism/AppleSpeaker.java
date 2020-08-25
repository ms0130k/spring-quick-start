package polymorphism;

public class AppleSpeaker implements Speaker {

	public AppleSpeaker() {
		System.out.println(">> AppleSpeaker was constructed");
	}

	@Override
	public void volumeUp() {
		System.out.println(">>> Apple speaker volume up");
	}

}
