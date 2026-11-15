package projecteInicial;

public class ModelDuck extends Duck {
	
        public void fly() {
		volarComportament = new NoVola();
	}
	public void quack() {
		quackComportament = new QuackNormal();
	}
        public void display() {
		System.out.println("I'm a model duck");
	}
}
