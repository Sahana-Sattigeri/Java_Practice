package OOPs;

public class Overrding {
	 void sound(){
		System.out.println("Animal make  a sound");
	}
	 
	 }
class Dog extends   Overrding {
	 void sound() {
		 System.out.println("Dog is barking");
	 }
}
class Cat extends Overrding{
	void sound() {
		System.out.println("Cat meows");
	}
}
class Cow extends Overrding{
	void sound() {
		System.out.println("Cow moos");
	}


	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		Cow cw = new Cow();
		d.sound();
		c.sound();
		cw.sound();

	}

}
