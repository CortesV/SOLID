package dependencyinversion;

public class Client {
	private DAO dao = new DataAccess();
	
	void job() {
		dao.execute();
	}
}
