import java.util.*;

public class Longitude {
	private MapLongitude mapLongitude;
	private double value;
	public Longitude(MapLongitude mapLongitude) {
		this.mapLongitude = mapLongitude;
	}
	public double getValue() {
		return this.value;
	}
	public void updateGPS(double cur_lat, double cur_long) {
		this.value = cur_long;
		this.mapLongitude.updateLongitude(this.value);
	}
}