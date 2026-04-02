package Workshop;

class Animal2 {
    String name;

    Animal2(String name) {
        this.name = name;
    }

    void displayAnimal2() {
        System.out.println("Name: " + name);
    }
}

class Dog2 extends Animal2 {  
    String breed;

    Dog2(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    void displayDog2() {
        displayAnimal2();
        System.out.println("Breed: " + breed);
    }
}

public class Q3 {
    public static void main(String[] args) {

        Dog2 d1 = new Dog2("SANDY", "BUSYA");   
        System.out.println("\nDog Details:");
        d1.displayDog2();                      

        System.out.println();

        Dog2 d2 = new Dog2("RAJU", "BHOTEY"); 
        System.out.println("\nDog Details:");
        d2.displayDog2();                     
    }
}