package projecteInicial;

public class MallardDuck extends Duck {
        public void fly() {
		volarComportament = new Volar();
	}
	    public void quack() {
		quackComportament = new QuackNormal();
	}
        public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
