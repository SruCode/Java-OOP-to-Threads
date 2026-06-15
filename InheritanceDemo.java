/*
 * Demonstration of:
 * 1. Single Inheritance
 * 2. Multilevel Inheritance
 * 3. Hierarchical Inheritance
 * 4. Multiple Inheritance using Interfaces
 */

public class InheritanceDemo {

    public static void main(String[] args) {

        System.out.println("=== Single Inheritance ===");
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        System.out.println("\n=== Multilevel Inheritance ===");
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.weep();

        System.out.println("\n=== Hierarchical Inheritance ===");
        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        System.out.println("\n=== Multiple Inheritance via Interfaces ===");
        GermanShepherd germanShepherd = new GermanShepherd();
        germanShepherd.eat();
        germanShepherd.bark();
        germanShepherd.play();
        germanShepherd.protect();
    }
}

// Base Class
class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

// Single Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Multilevel Inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy whimpers.");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

// Interfaces for Multiple Inheritance
interface Pet {
    void play();
}

interface Guard {
    void protect();
}

// Multiple Inheritance through Interfaces
class GermanShepherd extends Dog implements Pet, Guard {

    @Override
    public void play() {
        System.out.println("German Shepherd plays with its owner.");
    }

    @Override
    public void protect() {
        System.out.println("German Shepherd protects the property.");
    }
}