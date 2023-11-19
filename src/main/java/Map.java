public class Map {
	private MapLatitude mapLatitude;
	private Longitude longitude;
	private MapLongitude mapLongitude;
	private Latitude latitude;
	private Presenter presenter;
	public Map() {
		this.mapLatitude = new MapLatitude();
		this.longitude = new Longitude();
		this.mapLongitude = new MapLongitude();
		this.latitude = new Latitude();
		this.presenter = new Presenter(longitude, latitude, mapLongitude, mapLatitude);
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
	public double getLatitude() {
		return latitude.getValue();
	}
	public void updateGPS(double lat2, double long2) {
		this.presenter.updateGPS(lat2, long2);
	}
}