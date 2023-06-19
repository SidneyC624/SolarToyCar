
public class Driver {

	public static void main(String[] args) {
		SolarToyCar myCar = new SolarToyCar();
		System.out.println(myCar.getBatteryLevel());
		myCar.turn(Direction.RIGHT, 45);
		System.out.println(myCar.getBatteryLevel());
		myCar.forward(200);
		System.out.println(myCar.getBatteryLevel());
		myCar.moveWithSolarEnergy(350);
		System.out.println(myCar.getBatteryLevel());
		myCar.turnWithSolarEnergy(90);
		System.out.println(myCar.getBatteryLevel());
		myCar.chargeBattery();
		System.out.println(myCar.getBatteryLevel());

	}

}
