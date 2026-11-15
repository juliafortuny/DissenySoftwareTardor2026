package singleton02Static;

public class Singleton {
	// Bloc estàtic per detectar el moment de càrrega
	static {
		System.out.println("Classe EagerSingleton carregada a la JVM!");
	}
	public static String description = "I'm a statically initialized Singleton!";
	private static Singleton uniqueInstance = new Singleton();


	private Singleton() {System.out.println("EagerSingleton instanciat!");}
 
	public static Singleton getInstance() {
		System.out.println("EagerSingleton dins de getInstance!");
		return uniqueInstance;
	}
	
	// other useful methods here
	public String getDescription() {
		return description+" de dins del mètode " + uniqueInstance.hashCode();
	}
	// Mètode estàtic que no accedeix a uniqueInstance
	public static void staticMethod() {
		System.out.println("Mètode estàtic de Singleton cridat!");
	}
}
