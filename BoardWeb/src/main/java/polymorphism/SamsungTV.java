package polymorphism;

public class SamsungTV implements TV{
	private String name;

	public SamsungTV() {
		System.out.println(">> Constructor of SamsungTV");
	}
	
	private void init() {
		this.name = "-- init name --";
		System.out.println(name);
	}
	
	private void destroy() {
		System.out.println(">> destroy instance");
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
