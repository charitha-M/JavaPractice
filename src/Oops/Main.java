package Oops;

public class Main {
    public static void main(String[] args) {
        User u = new User();
        u.setName("Sravya");
        u.setAge(20);
        System.out.println(u.getName()+" "+u.getAge());

        Animal myAnimal = new Animal();  // Create an Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
