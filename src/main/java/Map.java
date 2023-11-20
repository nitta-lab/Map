import java.util.*;

public class Map {
	private MapLongitude mapLongitude;
	private Longitude longitude;
	private MapLatitude mapLatitude;
	private Latitude latitude;
	public Map() {
		this.mapLongitude = new MapLongitude();
		this.longitude = new Longitude(mapLongitude);
		this.mapLatitude = new MapLatitude();
		this.latitude = new Latitude(mapLatitude);
	}
	public double getMapLongitude() {
		return mapLongitude.getValue();
	}
	public double getLongitude() {
		return longitude.getValue();
	}
	public void updateGPS(double cur_lat, double cur_long) {
		this.longitude.updateGPS(cur_lat, cur_long);
		this.latitude.updateGPS(cur_lat, cur_long);
	}
	public double getMapLatitude() {
		return mapLatitude.getValue();
	}
	public double getLatitude() {
		return latitude.getValue();
	}
}