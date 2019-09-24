
public class DogToy implements DogToyState {
	private DogToyState dogOn;
	private DogToyState dogBark;
	private DogToyState dogOff;
	
	private DogToyState state;
	
	public DogToy() {
		this.dogOn = new DogOn(this);
		this.dogBark = new DogBark(this);
		this.dogOff = new DogOff(this);
		
		this.state = dogOn;
		}
	
	public void setDogToyState(DogToyState state) {
		this.state = state;
	}
	public void walk() {
		state.walk();
	}
	
	public void bark() {
		state.bark();
	}
	
	public void off() {
		state.off();
	}
	
	public DogToyState getDogOn() {
		return dogOn;
	}
	public void setDogOn(DogToyState dogOn) {
		this.dogOn = dogOn;
	}
	
	public DogToyState getDogBark() {
		return dogBark;
	}
	public void setDogBark(DogToyState dogBark) {
		this.dogBark = dogBark;
	}
	public DogToyState getDogOff() {
		return dogOff;
	}
	public void setDogOff(DogToyState dogOff) {
		this.dogOff = dogOff;
		
	}
	public DogToyState getState() {
		return state;
	}
	
	public void setState(DogToyState state) {
		this.state = state;
	}
}

