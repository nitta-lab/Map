import java.util.*;

public class Latitude {
	private MapLatitude mapLatitude;
	private double value;
	public Latitude(MapLatitude mapLatitude) {
		this.mapLatitude = mapLatitude;
	}
	public double getValue() {
		return this.value;
	}
	public void updateGPS(double lat2, double long2) {
		this.value = lat2;
		this.mapLatitude.updateLatitude(this.value);
	}
}