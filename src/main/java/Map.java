import java.util.*;

public class Map {
	private Longitude longitude;
	private MapLatitude mapLatitude;
	private MapLongitude mapLongitude;
	private Latitude latitude;
	private Presenter presenter;
	public Map() {
		this.longitude = new Longitude();
		this.mapLatitude = new MapLatitude();
		this.mapLongitude = new MapLongitude();
		this.latitude = new Latitude();
		this.presenter = new Presenter(longitude, latitude, mapLongitude, mapLatitude);
	}
	public double getLongitude() {
		return longitude.getValue();
	}
	public double getMapLatitude() {
		return mapLatitude.getValue();
	}
	public double getMapLongitude() {
		return mapLongitude.getValue();
	}
	public double getLatitude() {
		return latitude.getValue();
	}
	public void updateGPS(double cur_lat, double cur_long) {
		this.presenter.updateGPS(cur_lat, cur_long);
	}
}