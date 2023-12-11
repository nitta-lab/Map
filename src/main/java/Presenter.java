public class Presenter {
	private Longitude longitude;
	private Latitude latitude;
	private MapLongitude mapLongitude;
	private MapLatitude mapLatitude;

	public Presenter(MapLongitude mapLongitude,Longitude longitude,MapLatitude mapLatitude,Latitude latitude) {
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