
public class SolarToyCar extends ToyCar implements SolarPanel{

	@Override
	public void chargeBattery() {
		System.out.println("Charge with " + numPanels + " solar panels");
		this.batteryLevel = fullBattery;
	}
	
	@Override
	public void moveWithSolarEnergy(double distance) {
		System.out.println("Move " + distance + " meters without using battery power");
		
	}

	@Override
	public void turnWithSolarEnergy(double angle) {
		System.out.println("Turn for " + angle + " degrees without using battery power");
		
	}

}
