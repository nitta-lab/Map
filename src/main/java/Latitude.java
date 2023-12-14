import java.util.*;

public class Latitude {
	private double value;
	public double getValue() {
		return this.value;
	}
	public void updateGPS(double cur_lat, double cur_long) {
		this.value = cur_lat;
	}
}