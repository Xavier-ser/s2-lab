class Animal {  // Grandparent
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Mammal extends Animal {  // Parent
    void walk() {
        System.out.println("Mammal is walking");
    }
}

class Dog extends Mammal {  // Child
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();   // from Animal
        d.walk();  // from Mammal
        d.bark();  // from Dog
    }
}