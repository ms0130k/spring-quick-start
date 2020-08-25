package polymorphism;

public class SamsungTV implements TV{
	private String name;
	private Speaker speaker;
	private int price;

	public SamsungTV() {
		System.out.println(">> Constructor of SamsungTV");
	}
	
//	public SamsungTV(Speaker speaker, int price) {
//		System.out.println(">> Constructor of SamsungTV with speaker");
//		System.out.println(">> Conttructor price : " + price);
//		this.speaker = speaker;
//		this.price = price;
//	}
	
	private void init() {
		this.name = "-- init name --";
		System.out.println(name);
	}
	
	private void destroy() {
		System.out.println(">> destroy instance");
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}
	
	@Override
	public void turnOn() {
		System.out.println(">>> turn on Samsung");
	}

	@Override
	public void turnOff() {
		System.out.println(">>> turn off Samsung");
	}
	
}
