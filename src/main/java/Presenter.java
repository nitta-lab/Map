public class Presenter {
	private Longitude longitude;
	private Latitude latitude;
	private MapLongitude mapLongitude;
	private MapLatitude mapLatitude;

    public Presenter(Latitude latitude, Longitude longitude, MapLatitude mapLatitude, MapLongitude mapLongitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.mapLongitude = mapLongitude;
        this.mapLatitude = mapLatitude;
	}

	public void updateGPS(double cur_lat, double cur_long , boolean mapUpdateFlg) {
		
		
		
		double longitude = this.longitude.updateGPS(cur_lat, cur_long);
		double latitude = this.latitude.updateGPS(cur_lat, cur_long);
		
		
		
		this.mapLongitude.updateLongitude(longitude);
		this.mapLatitude.updateLatitude(latitude);
		
		if(!mapUpdateFlg) {
			// 初期化問題でビルドが失敗してしまうため、一旦mapの座標を変えてからもとに戻しています。
			longitude = mapLongitude.getValue();
			latitude = mapLatitude.getValue();
			this.mapLongitude.updateLongitude(longitude);
			this.mapLatitude.updateLatitude(latitude);			
		}


	}
}