import java.util.*;

public class Presenter {
	private Longitude longitude;
	private Latitude latitude;
	private MapLongitude mapLongitude;
	private MapLatitude mapLatitude;
	public Presenter(Longitude longitude, Latitude latitude, MapLongitude mapLongitude, MapLatitude mapLatitude) {
		this.longitude = longitude;
		this.latitude = latitude;
		this.mapLongitude = mapLongitude;
		this.mapLatitude = mapLatitude;
	}
	public void updateGPS(double cur_lat, double cur_long) {
		double longitude = this.longitude.updateGPS(cur_lat, cur_long);
		double latitude = this.latitude.updateGPS(cur_lat, cur_long);
		this.mapLongitude.updateLongitude(longitude);
		this.mapLatitude.updateLatitude(latitude);
	}
}