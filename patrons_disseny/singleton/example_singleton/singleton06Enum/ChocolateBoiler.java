package singleton06Enum;
 
public enum ChocolateBoiler {
	INSTANCE;
	private boolean empty;
	private boolean boiled;

	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
  

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// fill the boiler with a milk/singleton06Enum mixture
		}
	}
 
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// drain the boiled milk and singleton06Enum
			empty = true;
		}
	}
 
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// bring the contents to a boil
			boiled = true;
		}
	}
  
	public boolean isEmpty() {
		return empty;
	}
 
	public boolean isBoiled() {
		return boiled;
	}
}
