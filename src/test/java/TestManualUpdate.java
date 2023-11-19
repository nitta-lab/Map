import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestManualUpdate {

	@Test
	public void test() {
		// 北緯35.0度，東経135.0度，自動更新モードに設定する
		Map map = new Map();
		map.updateGPS(35.0, 135.0);
		map.setAutoUpdate(true);
		double lati = map.getLatitude();
		double longi = map.getLongitude();
		double mapLati = map.getMapLatitude();
		double mapLongi = map.getMapLongitude();
		assertEquals(lati, 35.0, 0.0001);
		assertEquals(longi, 135.0, 0.0001);
		assertEquals(mapLati, 35.0, 0.0001);
		assertEquals(mapLongi, 135.0, 0.0001);

		// 北緯35.1度，東経135.1度に移動する
		map.updateGPS(35.1, 135.1);
		lati = map.getLatitude();
		longi = map.getLongitude();
		mapLati = map.getMapLatitude();
		mapLongi = map.getMapLongitude();
		assertEquals(lati, 35.1, 0.0001);
		assertEquals(longi, 135.1, 0.0001);
		assertEquals(mapLati, 35.1, 0.0001);
		assertEquals(mapLongi, 135.1, 0.0001);

		// 手動更新を行う
		map.updateManually();
		lati = map.getLatitude();
		longi = map.getLongitude();
		mapLati = map.getMapLatitude();
		mapLongi = map.getMapLongitude();
		assertEquals(lati, 35.1, 0.0001);
		assertEquals(longi, 135.1, 0.0001);
		assertEquals(mapLati, 35.1, 0.0001);
		assertEquals(mapLongi, 135.1, 0.0001);

		// 手動更新モードに設定する
		map.setAutoUpdate(false);

		// 北緯35.0度，東経135.0度に戻る
		map.updateGPS(35.0, 135.0);
		lati = map.getLatitude();
		longi = map.getLongitude();
		mapLati = map.getMapLatitude();
		mapLongi = map.getMapLongitude();
		assertEquals(lati, 35.0, 0.0001);
		assertEquals(longi, 135.0, 0.0001);
		assertEquals(mapLati, 35.1, 0.0001);		// 手動更新のため値は変化しない
		assertEquals(mapLongi, 135.1, 0.0001);		// 手動更新のため値は変化しない

		// 手動更新を行う
		map.updateManually();
		lati = map.getLatitude();
		longi = map.getLongitude();
		mapLati = map.getMapLatitude();
		mapLongi = map.getMapLongitude();
		assertEquals(lati, 35.0, 0.0001);
		assertEquals(longi, 135.0, 0.0001);
		assertEquals(mapLati, 35.0, 0.0001);		// 手動更新によって値が更新される
		assertEquals(mapLongi, 135.0, 0.0001);		// 手動更新によって値が更新される
	}
}
