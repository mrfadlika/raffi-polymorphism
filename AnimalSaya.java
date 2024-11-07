abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.print("Dog barks, ");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.print("Cat meows, ");
    }
}

public class AnimalSaya {
    public static void identifyAnimal(Animal animal) {
        animal.makeSound();
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            System.out.println("This is Dog");
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            System.out.println("This is Cat");
        }
    }

    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        identifyAnimal(myDog);
        identifyAnimal(myCat);
    }
}
