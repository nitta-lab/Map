import java.util.*;

public class MapLatitude {
	private Latitude latitude;
	public MapLatitude(Latitude latitude) {
		this.latitude = latitude;
	}
	public double getValue() {
		return this.latitude.getValue();
	}
}