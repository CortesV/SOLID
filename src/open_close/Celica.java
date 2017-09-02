package open_close;

public class Celica implements Car {

	public void getPassanger() {
		System.out.println("Get one passanger");
	}

	@Override
	public void workInTaxi() {
		getPassanger();
	}

}
