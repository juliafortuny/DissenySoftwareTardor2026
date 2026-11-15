package projecteInicial;

public class RubberDuck extends Duck {


	public void display() {
		System.out.println("I'm a rubber duckie");
	}
        
        public void quack() {
		quackComportament = new Squeak();
	}
        public void fly() {
		volarComportament = new NoVola();
	}
}
