package singleton02Static;

public class SingletonClient {
	public static void main(String[] args) {

        System.out.println("Main starts");

		Singleton.staticMethod();

		System.out.println("Abans d'entrar al primer  getInstance");

		Singleton singleton = Singleton.getInstance();

		System.out.println(singleton.getDescription());

		System.out.println(singleton.getDescription());

		singleton = Singleton.getInstance();

		System.out.println(singleton.getDescription());

	}
}
