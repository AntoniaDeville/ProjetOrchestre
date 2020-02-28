// Création de la classe Main
public class Main {

	public static void main (String[] args)
	{
		System.out.println("Démarrage de l'appli");
		@SuppressWarnings("unused")
		
		// On appelle le singleton : 
		Server singleton = Server.getInstance();
		
		
		System.out.println("Et donc..");
		
		// On affiche le singleton
		System.out.println(singleton);
		
	}
}
