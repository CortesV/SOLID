package interfacesugregation;

public class Main {
	public static void main(String[] args) {
		IWorker iWorker = new Cook();
		iWorker.eat();
		iWorker.work();
	}
}

