public class Presenter {
	private Longitude longitude;
	private Latitude latitude;
	private MapLongitude mapLongitude;
	private MapLatitude mapLatitude;
	private boolean isAutoUpdate;
	public Presenter(Longitude longitude, Latitude latitude, MapLongitude mapLongitude, MapLatitude mapLatitude) {
		this.longitude = longitude;
		this.latitude = latitude;
		this.mapLongitude = mapLongitude;
		this.mapLatitude = mapLatitude;
		this.isAutoUpdate = true;
	}
	public void updateGPS(double cur_lat, double cur_long) {
		double longitude = this.longitude.updateGPS(cur_lat, cur_long);
		double latitude = this.latitude.updateGPS(cur_lat, cur_long);
		if (isAutoUpdate) {
			this.mapLongitude.updateLongitude(longitude);
			this.mapLatitude.updateLatitude(latitude);
		}
	}
	public void setAutoUpdate(boolean isAutoUpdate) {
		this.isAutoUpdate = isAutoUpdate;
	}
	public void updateManually() {
		this.isAutoUpdate = true;
		this.mapLongitude.updateLongitude(this.longitude.getValue());
		this.mapLatitude.updateLatitude(this.latitude.getValue());

	}
}