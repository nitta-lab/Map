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
	public void updateGPS(double lat2, double long2) {
		double longitude = this.longitude.updateGPS(lat2, long2);
		double latitude = this.latitude.updateGPS(lat2, long2);
		this.mapLongitude.updateLongitude(longitude);
		this.mapLatitude.updateLatitude(latitude);
	}
}