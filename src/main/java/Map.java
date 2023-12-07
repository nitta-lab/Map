import java.util.*;

public class Map {
	private MapLongitude mapLongitude;
	private Latitude latitude;
	private MapLatitude mapLatitude;
	private Longitude longitude;
	private Presenter presenter;
	public Map() {
		this.mapLongitude = new MapLongitude();
		this.latitude = new Latitude();
		this.mapLatitude = new MapLatitude();
		this.longitude = new Longitude();
		this.presenter = new Presenter(longitude, latitude, mapLongitude, mapLatitude);
	}
	public double getMapLongitude() {
		return mapLongitude.getValue();
	}
	public double getLatitude() {
		return latitude.getValue();
	}
	public double getMapLatitude() {
		return mapLatitude.getValue();
	}
	public double getLongitude() {
		return longitude.getValue();
	}
	public void updateGPS(double cur_lat, double cur_long) {
		this.presenter.updateGPS(cur_lat, cur_long);
	}
}