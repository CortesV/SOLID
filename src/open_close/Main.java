package open_close;

public class Main {
	public static void main(String[] args) {
		Celica celica = new Celica();
		workInTaxi(celica);
	}
	
	public static void workInTaxi(Car car) {
		car.workInTaxi();
	}
}
