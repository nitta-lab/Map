import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestGPSUpdate {

	@Test
	public void test() {
		// 北緯35.0度, 東経135.0度に設定する
		Map map = new Map();
		map.updateGPS(35.0, 135.0,true);
		double lati = map.getLatitude();
		double longi = map.getLongitude();
		double mapLati = map.getMapLatitude();
		double mapLongi = map.getMapLongitude();
		assertEquals(lati, 35.0, 0.0001);
		assertEquals(longi, 135.0, 0.0001);
		assertEquals(mapLati, 35.0, 0.0001);
		assertEquals(mapLongi, 135.0, 0.0001);		
		
		// 緯度方向に移動する
		map.updateGPS(35.1, 135.0,true);
		lati = map.getLatitude();
		longi = map.getLongitude();
		mapLati = map.getMapLatitude();
		mapLongi = map.getMapLongitude();
		assertEquals(lati, 35.1, 0.0001);
		assertEquals(longi, 135.0, 0.0001);
		assertEquals(mapLati, 35.1, 0.0001);
		assertEquals(mapLongi, 135.0, 0.0001);
		
		// 経度方向に移動する
		map.updateGPS(35.1, 135.1, true);
		lati = map.getLatitude();
		longi = map.getLongitude();
		mapLati = map.getMapLatitude();
		mapLongi = map.getMapLongitude();
		assertEquals(lati, 35.1, 0.0001);
		assertEquals(longi, 135.1, 0.0001);
		assertEquals(mapLati, 35.1, 0.0001);
		assertEquals(mapLongi, 135.1, 0.0001);
		
		// 緯度方向に移動する(Map情報は更新されない)
		map.updateGPS(35.2, 135.1,false);
		lati = map.getLatitude();
		longi = map.getLongitude();
		mapLati = map.getMapLatitude();
		mapLongi = map.getMapLongitude();
		assertEquals(lati, 35.2, 0.0001);
		assertEquals(longi, 135.1, 0.0001);
		assertEquals(mapLati, 35.2, 0.0001);
		assertEquals(mapLongi, 135.1, 0.0001);
		
		// 経度方向に移動する(Map情報は更新されない)
		map.updateGPS(35.2, 135.2, false);
		lati = map.getLatitude();
		longi = map.getLongitude();
		mapLati = map.getMapLatitude();
		mapLongi = map.getMapLongitude();
		assertEquals(lati, 35.2, 0.0001);
		assertEquals(longi, 135.2, 0.0001);
		assertEquals(mapLati, 35.2, 0.0001);
		assertEquals(mapLongi, 135.2, 0.0001);
	}
}
