public class Latitude {
	private double value;
	public Latitude(MapLatitude mapLatitude) {
	}
	public double getValue() {
		return this.value;
	}
	public double updateGPS(double cur_lat, double cur_long) {
		this.value = cur_lat;
		return this.value;
	}
}