
public class Presenter {
	private MapLongitude mapLongitude;
	private Longitude longitude;
	private MapLatitude mapLatitude;
	private Latitude latitude;

	public Presenter(MapLongitude mapLongitude, Longitude longitude, MapLatitude mapLatitude, Latitude latitude) {
		this.mapLongitude = mapLongitude;
		this.longitude = longitude;
		this.mapLatitude = mapLatitude;
		this.latitude = latitude;
	}

	public void updateGPS(double cur_lat, double cur_long) {
		double longitude = this.longitude.updateGPS(cur_lat, cur_long);
		double latitude = this.latitude.updateGPS(cur_lat, cur_long);
		this.mapLongitude.updateLongitude(longitude);
		this.mapLatitude.updateLatitude(latitude);
	}
}
