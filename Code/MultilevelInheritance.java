public class MultilevelInheritance {
    public static void main(String[] args) {
        BabyDog dog1 = new BabyDog();
        dog1.weep();
        dog1.bark();
        dog1.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

class BabyDog extends Dog{
    void weep(){
        System.out.println("Weeping");
    }
}