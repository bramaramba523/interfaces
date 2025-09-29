class Animal {//parent class
	void eat()
	{
		System.out.println("Animal eats");
		}
}
//interface1
interface CanBark{
	void bark();
}
//interface2
interface  CanMeow{
	void meow();
}
//child class (Hybrid Inheritance)
class Pet extends Animal implements CanBark, CanMeow{
	
public void bark()
{
	System.out.println("dog barks");
}
public void meow() {
	System.out.println("cat meows");
}
void play() {
	System.out.println("pet plays");
}
}
class Main{
	
	public static void main(String[] args) {
       Pet myPet=new Pet();
       myPet.eat();//form Animal
       myPet.bark();//form CanBark
       myPet.meow();//form CanMeow
       myPet.play();//Own method

	}

}
