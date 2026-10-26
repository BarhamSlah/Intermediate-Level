// To create manual exception you should create 
1- create class and extend Exception 
2- create constructor and pass parameter     

public class ManuallyException extends Exception{
    ManuallyException(String text){
        super(text);
    }

}

void main() {

    int a = 0;

    try {

      if(a == 0){
       throw new ManuallyException("This is manual exception"){  // Custom logic: if the result is 0, manually throw an exception
       };
      }

      int b = 10 / a;
    } catch(ArithmeticException e){
         IO.println("This is default output and equal to 1");
    }catch (Exception e){
        IO.println("The error " + e.getMessage());
    }

}
