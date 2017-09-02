package singleresponsibility;

public class Janitor implements Employee{
	public void cleanFloor() {
		System.out.println("Clean floor");
	}

	@Override
	public int getSalary() {
		return 1500;
	}
}
