package singleresponsibility;

public class Main {
	public static void main(String[] args) {
		EmplayeeFacade facade = new EmplayeeFacade();
		facade.cook();
		facade.cleanFloor();
	}
}
