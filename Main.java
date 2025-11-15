class Animal {
       void eat() {
               System.out.println("The animal eats food.");
        }
}
class  Dog extends Animal {
          void bark() {
                  System.out println("The dog barks.");
           }
 }
 public class Main {
           public static void main(string[] args) {
                Dog d = new Dog();
                d.eat();
                d.bark();
             }
 }
