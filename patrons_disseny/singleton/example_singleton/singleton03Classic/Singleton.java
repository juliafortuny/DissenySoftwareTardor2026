package singleton03Classic;

// NOTE: This is not thread safe!

public class Singleton {
	private static Singleton uniqueInstance;

	// Bloc estàtic per veure quan es carrega la classe
	static {
		System.out.println("Classe LazySingleton carregada a la JVM!");
	}
	private Singleton() {System.out.println("LazySingleton instanciat!");}
 
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
	public String getDescription() {
		return "I'm a singleton03Classic Singleton!";
	}
}
