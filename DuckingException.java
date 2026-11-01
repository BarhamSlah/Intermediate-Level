** Because the method ducks out of handling the problem itself, this technique is referred to as ducking the exception

** When working with checked exceptions in Java, you have two choices:
Checked Exception need try-exception or throws but Unnchecked Exception not 
  
1 - try-catch in the method : Handle it yourself immediately where the error happens.

2 - throws in the method signature : Pass the responsibility to whatever called the method to handle it instead.

** e.printStackTrace() shows you both the exact method where the error originated and the entire chain of methods that led up to it.
  
** Never Use throws on main().

Checked Exception	   Unchecked Exception
IOException	         ArithmeticException
SQLException	       NullPointerException

** You can use one try block with multiple catch blocks (or a multi-catch).

*************************************************************************************************************************************************************************************  
public class B{

    void cal() throws ClassNotFoundException {
        Class.forName("Calculator");
    }

}

public class A {

    int div() throws ArithmeticException{
        int b = 4;
        int e = 2;
        return b / e;
    }

}

void main(){

    A a =  new A();
    B b =  new B();

   try {
    a.div();
    b.cal();
    }catch(ClassNotFoundException e) {
       IO.println("Class not found");
        e.printStackTrace();
    } catch (ArithmeticException e) {
       IO.println("Division by zero");
       e.printStackTrace();
   }

} 
