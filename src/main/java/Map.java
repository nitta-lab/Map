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
	public void updateGPS(double lat2, double long2) {
		this.longitude.updateGPS(lat2, long2);
		this.latitude.updateGPS(lat2, long2);
	}
	public double getMapLatitude() {
		return mapLatitude.getValue();
	}
	public double getLatitude() {
		return latitude.getValue();
	}
}