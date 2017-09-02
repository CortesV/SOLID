package dependencyinversion;

public class DataAccess implements DAO{

	@Override
	public void execute() {
		System.out.println("Execute");
	}

}
