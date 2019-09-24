
public class DogOn implements DogToyState{
	
	private final DogToy dogtoy;
	
	public DogOn(DogToy dogtoy) {
		this.dogtoy = dogtoy;
	}
	public void walk() {
		System.out.println("Toy Dog walking...");
	}
	public void bark() {
		System.out.println("Dog Toy barking..");
		dogtoy.setDogToyState(dogtoy.getDogBark());
	}
	public void off() {
		dogtoy.setState(dogtoy.getDogOff());
		System.out.println("Dog Toy is Switched Off...");
	}
	
}
