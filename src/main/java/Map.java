import java.util.*;

public class Map {
	private Latitude latitude;
	private MapLatitude mapLatitude;
	private MapLongitude mapLongitude;
	private Longitude longitude;
	private Presenter presenter;
	public Map() {
		this.latitude = new Latitude();
		this.mapLatitude = new MapLatitude();
		this.mapLongitude = new MapLongitude();
		this.longitude = new Longitude();
		this.presenter = new Presenter(longitude, latitude, mapLongitude, mapLatitude);
	}
	public double getLatitude() {
		return latitude.getValue();
	}
	public double getMapLatitude() {
		return mapLatitude.getValue();
	}
	public double getMapLongitude() {
		return mapLongitude.getValue();
	}
	public double getLongitude() {
		return longitude.getValue();
	}
	public void updateGPS(double cur_lat, double cur_long) {
		this.presenter.updateGPS(cur_lat, cur_long);
	}
}