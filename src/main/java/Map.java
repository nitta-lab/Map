import java.util.*;

public class Map {
	private Latitude latitude;
	private MapLatitude mapLatitude;
	private Longitude longitude;
	private Presenter presenter;
	private MapLongitude mapLongitude;
	public Map() {
		this.latitude = new Latitude();
		this.mapLatitude = new MapLatitude(latitude);
		this.longitude = new Longitude();
		this.presenter = new Presenter(longitude, latitude);
		this.mapLongitude = new MapLongitude(longitude);
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
	public double getMapLongitude() {
		return mapLongitude.getValue();
	}
	public void updateGPS(double cur_lat, double cur_long) {
		this.presenter.updateGPS(cur_lat, cur_long);
	}
}