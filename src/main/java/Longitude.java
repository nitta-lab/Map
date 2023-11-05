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
	public void updateGPS(double lat2, double long2) {
		this.value = long2;
		this.mapLongitude.updateLongitude(this.value);
	}
}