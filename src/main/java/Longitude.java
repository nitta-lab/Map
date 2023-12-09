public class Longitude {
	private MapLongitude mapLongitude;
	private double value;
	public Longitude(MapLongitude mapLongitude) {
		this.mapLongitude = mapLongitude;
	}
	public double getValue() {
		return this.value;
	}
	public double updateGPS(double cur_lat, double cur_long) {
		this.value = cur_long;
		return this.value;
	}
}