
public class DogBark implements DogToyState {

	private final DogToy dogtoy;
	
	public DogBark(DogToy dogtoy) {
		this.dogtoy = dogtoy;
	}
	
	public void walk() {
		System.out.println("Toy Dog Walking....");
		dogtoy.setDogToyState(dogtoy.getDogOn());
	}
	
	public void bark() {
		System.out.println("Dog Toy Barking...");
	}
	public void off() {
		System.out.println("Unable to Switch Off While Barking");
		}
}
