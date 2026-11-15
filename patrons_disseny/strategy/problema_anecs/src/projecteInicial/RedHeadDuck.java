package projecteInicial;

public class RedHeadDuck extends Duck {
 
	public void fly() {
		volarComportament = new Volar();
	}
        public void quack() {
		quackComportament = new QuackNormal();
	}
        public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
