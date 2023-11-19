public class Longitude {
	private double value;
	public double getValue() {
		return this.value;
	}
	public double updateGPS(double lat2, double long2) {
		this.value = long2;
		return this.value;
	}
}