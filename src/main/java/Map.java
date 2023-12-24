public class Map {
	private MapLatitude mapLatitude;
	private MapLongitude mapLongitude;
	private Longitude longitude;
	private Latitude latitude;
	private Presenter presenter;
	public Map() {
		this.mapLatitude = new MapLatitude();
		this.mapLongitude = new MapLongitude();
		this.longitude = new Longitude();
		this.latitude = new Latitude();
		this.presenter = new Presenter(longitude, latitude, mapLongitude, mapLatitude);
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
	public double getLatitude() {
		return latitude.getValue();
	}
	public void updateGPS(double cur_lat, double cur_long) {
		this.presenter.updateGPS(cur_lat, cur_long);
	}
	public void setAutoUpdate(boolean isAutoUpdate) {
		this.presenter.setAutoUpdate(isAutoUpdate);
	}
	public void updateManually() {
		this.presenter.updateManually();
	}
}