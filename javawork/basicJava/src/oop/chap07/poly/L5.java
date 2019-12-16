package oop.chap07.poly;

public class L5 extends Car implements Temp {

	public L5() {
		
	}
	public L5(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}
	
	@Override
	public int getTempGage() {
		return getDistance() / 10 * 2;
	}

	@Override
	public void go(int distance) {
		setDistance(getDistance() + distance);
		setOilSize(getOilSize() - distance / 8);
	}

	@Override
	public void setOil(int oilSize) {
		setOilSize(getOilSize() + oilSize);
	}

}
