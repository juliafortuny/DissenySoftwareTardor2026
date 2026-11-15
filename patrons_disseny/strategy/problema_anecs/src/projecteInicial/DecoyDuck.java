package projecteInicial;

public class DecoyDuck extends Duck {
	    public void display() {
		System.out.println("I'm a duck Decoy");
	}
        public void quack() {
		quackComportament = new Silence();
	}
        public void fly() {
		volarComportament = new NoVola();
	}
}
