package entities;

public class Address {
	private String location;
	public Address() {}
	public Address(String location) {
		this.location = location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLocation() {
		return this.location;
	}
}
