class Animal {
    String name = "Generic Animal";
    void eat() {
        System.out.println("This animal is eating food.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking: Woof! Woof!");
    }
}
public class singleinheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        System.out.println("Animal Name: " + myDog.name);
        myDog.eat();
        myDog.bark();
    }
}
// so this is the basic program of java using single inheritance concept . 
