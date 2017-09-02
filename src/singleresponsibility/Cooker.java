package singleresponsibility;

public class Cooker implements Employee{
	public void cook() {
		System.out.println("Cook food");
	}

	@Override
	public int getSalary() {
		return 2000;
	}
}
