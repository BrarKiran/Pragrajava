package Constructors;

public class Animal {
        String color;
        double height;
        public void walk(){
            System.out.println("Constructors.Animal can walk");
            System.out.println("Constructors.Animal name is cow");
        }
        public void makeSound(){
            System.out.println("Constructors.Animal can make Sound");
            System.out.println("Constructors.Animal does moo moo");
        }
        public void eat(){
            System.out.println("Constructors.Animal can eat");
        }

public static void main(String[] args) {
    Animal animal = new Animal();
    animal.eat();
    animal.walk();
    animal.makeSound();
}
}
