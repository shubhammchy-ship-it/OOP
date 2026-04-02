package Workshop;

	
	class Animal {
	    String name;
	    int age;

	    // Constructor of Animal
	    Animal(String name, int age) {
	        this.name = name;
	        this.age = age;
	        System.out.println("Animal Constructor Called");
	    }

	    void displayAnimal() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}

	// Subclass
	class Dog extends Animal {
	    String breed;

	    // Constructor of Dog
	    Dog(String name, int age, String breed) {
	        super(name, age); // calling Animal constructor
	        this.breed = breed;
	        System.out.println("Dog Constructor Called");
	    }

	    void displayDog() {
	        displayAnimal(); // call parent method
	        System.out.println("Breed: " + breed);
	    }
	}

	// Main class
	public class Q1 {
	    public static void main(String[] args) {
	        Dog d1 = new Dog("Aaryan", 4, "TOLEY BHUSYA KUKUR");
	        System.out.println("\nDog Details:");
	        d1.displayDog();
	    }
	}

