public class Longitude {
	private double value;

	public Longitude() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public double getValue() {
		return this.value;
	}
	public double updateGPS(double cur_lat, double cur_long) {
		this.value = cur_long;
		return this.value;
	}
}