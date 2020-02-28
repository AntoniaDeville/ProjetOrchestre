
public class Server {
	private static final Server instance = new Server();
	private Server()
	{
		System.out.println("Hello");
	}
	
	public static final Server getInstance()
	{
		return instance;
	}
	public String toString()
	{
		return String.format("Server");
	}
	

}
