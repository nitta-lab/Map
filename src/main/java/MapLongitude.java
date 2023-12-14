import java.util.*;

public class MapLongitude {
	private Longitude longitude;
	public MapLongitude(Longitude longitude) {
		this.longitude = longitude;
	}
	public double getValue() {
		return this.longitude.getValue();
	}
}