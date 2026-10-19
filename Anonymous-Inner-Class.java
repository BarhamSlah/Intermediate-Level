 An anonymous inner class is a class without a name that you create and use at the same time.
 "I need a small class here, but I don't need to create a separate named class for it."
 It's mainly designed for one-time or very specific use.
 If you need the same implementation in many places → create a normal named class instead.
 It can implement an interface
 It can extend a class

🔹 Rule 1: If you put a class after new, it creates an unnamed subclass (extends).
🔹 Rule 2: If you put an interface after new, it creates an unnamed implementing class (implements). 

It can never use both extends and implements at the same time.
It can never implement more than one interface.
An anonymous inner class can never extend more than one class.


Everything inside those highlighted {} curly braces is the body of a anonymous inner class


Since an anonymous inner class has no name, you can never write a constructor for it (because in Java, constructors must match the class name).


When we have an abstract class, we cannot directly instantiate an object from it. However, when we use an anonymous inner class, it doesn't give a compiler error. 
So normal method outside object but anonymous inner class method inside object.
 
**********************************************************************************************************************************************************************
 
abstract public class A{

abstract public void show();

}

void main(){

    A a = new A(){
        // THIS IS ANONYMOUS INNER CLASS
        @Override
        public void show(){
            IO.println("show in anonymous inner class");
        }

    };
    a.show();

}
