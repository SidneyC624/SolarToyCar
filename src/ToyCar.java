
public class ToyCar {
	protected double batteryLevel;
	protected final double fullBattery = 1000;
	
	public ToyCar() {
		this.batteryLevel = fullBattery;
	}
	
	public void forward(double distance) {
		System.out.println("Go forward for " + distance + " meters");
		batteryLevel -= distance; // 1 unit of distance uses 1 battery level
	}
	
	public void turn(Direction dir, double angle) {
		System.out.println("Turn " + dir + " by " + angle + " degrees");
		batteryLevel -= angle; // turning every degree uses 1 battery level
	}
	
	public double getBatteryLevel() {
		return batteryLevel;
	}
	
	public void chargeBattery() {
		System.out.println("Charge battery from wall socket");
		batteryLevel = fullBattery;
	}
}
