package projecteInicial;

public abstract class Duck {

    VolarComportament volarComportament;
    QuackComportament quackComportament;

        public Duck() {
        }
        abstract void fly();
        abstract void quack();
        abstract void display();

        public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}
