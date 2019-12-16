package oop.chap07.poly;

public class CarTest {

	public static void main(String[] args) {
		Car[] car = new Car[2];
		car[0] = new L3("L3","1500",50,25,0);
		car[1] = new L5("L5","2000",70,35,0);
		
		System.out.println("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temprature");
		System.out.println("----------------------------------------------------------------------------");
		for (int i = 0; i < car.length; i++) {
			print(car[i]);
		}
		
		System.out.println("25 주유");
		for (Car obj : car) {
			obj.setOil(25);
		}
		System.out.println("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temprature");
		System.out.println("----------------------------------------------------------------------------");
		for (int i = 0; i < car.length; i++) {
			print(car[i]);
		}
		
		System.out.println("80 주행");
		for (Car obj : car) {
			obj.go(80);
		}
		System.out.println("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temprature");
		System.out.println("----------------------------------------------------------------------------");
		for (int i = 0; i < car.length; i++) {
			print(car[i]);
		}

	}
	public static void print(Car car) {
		System.out.print(car.getName() + "\t\t" + car.getEngine() + "\t\t" +
				car.getOilTank() + "\t\t" + car.getOilSize() + "\t\t" + 
				car.getDistance() + "\t\t");
		if(car instanceof L3) {
			System.out.println(((L3)car).getTempGage());
		}
		else {
			System.out.println(((L5)car).getTempGage());
		}
	}

}
