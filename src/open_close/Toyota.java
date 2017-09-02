package open_close;

public class Toyota implements Car{

	public void getPassanger() {
		System.out.println("Get passanger");
	}
	
	@Override
	public void workInTaxi() {
		getPassanger();
	}

}
