
public class DogOff implements DogToyState{
	
	private final DogToy dogtoy;
	
	public DogOff(DogToy dogtoy) {
		this.dogtoy = dogtoy;
	}
	
	public void walk() {
		System.out.println("Dog Toy is walking....");
		dogtoy.setDogToyState(dogtoy.getDogOn());
	}
	
	public void bark() {
		System.out.println("Cannot Bark while Dog Toy is off");
	}
	
	public void off() {
		System.out.println("Dog Toy is Off Already");
	}
}
