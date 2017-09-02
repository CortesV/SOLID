package singleresponsibility;

public class EmplayeeFacade {
	private Cooker cooker = new Cooker();
	private Janitor janitor = new Janitor();
	
	public void cook() {
		cooker.cook();
	}
	public void cleanFloor() {
		janitor.cleanFloor();
	}
	
	public Cooker getCooker() {
		return cooker;
	}
	public void setCooker(Cooker cooker) {
		this.cooker = cooker;
	}
	public Janitor getJanitor() {
		return janitor;
	}
	public void setJanitor(Janitor janitor) {
		this.janitor = janitor;
	}
	
	
}
