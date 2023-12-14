import java.util.*;

public class Presenter {
	private Longitude longitude;
	private Latitude latitude;
	public Presenter(Longitude longitude, Latitude latitude) {
		this.longitude = longitude;
		this.latitude = latitude;
	}
	public void updateGPS(double cur_lat, double cur_long) {
		this.longitude.updateGPS(cur_lat, cur_long);
		this.latitude.updateGPS(cur_lat, cur_long);
	}
}