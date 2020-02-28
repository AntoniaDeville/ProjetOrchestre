
public class Server {
	private static final Server instance = new Server();
	
	// Lancement du Server
	private Server()
	{
		System.out.println("Je suis bien lancé !");
	}
	
	
	public static final Server getInstance()
	{
		return instance;
	}
	
	// Affichage du server
	public String toString()
	{
		return String.format("Server");
	}
	

}
