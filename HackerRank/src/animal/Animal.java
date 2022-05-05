package animal;

public class Animal {

	public int age;
	public Animal(int age) {
		this.age = age;
		System.out.println("An animal has been created");
	}
	
	public void eat() {
		System.out.println("An animal is eating");
	}
	public static void main(String[] args) {
		Animal a  = new Animal(5);
		Dog d = new Dog();
		Cat c = new Cat();
		d.ruff(); 
		c.meow();
		a.eat();
		d.eat();
		c.eat();
		d.run();
		c.prance();
		
	}

}
