What it means: Writing long, repetitive code (boilerplate code) to perform simple tasks.  
The drawback: Increases total lines of code and the risk of bugs.  
The solution: Java 8 introduced Lambda expressions to cut down on this verbosity, making code much shorter and more concise

We can use lambda expression only with SAM (Single Abstract Method)
   
*******************************************************************************************************************************************************************************************
When your lambda body consists of a single expression like (i + j), you can omit both keyword and the curly braces{}.

   /* A obj2 = new A() {
        @Override
        public void show() {
            IO.println("Anonymous");
        }
    };
*/

   interface A {
        int show(int i,  int j );
    }

    class B implements A {
       public int show(int i, int j) {
            IO.println("Not Anonymous");
            return i + j;
        }
    }

    void main() {
        A obj2 = () -> IO.println("Anonymous");  // if you have parameter you should write in here ()
    }
*******************************************************************************************************************************************************************************************

When it becomes more than 1 statements you should write both (return and {}; )

A obj = (i, j) ->  {
    // optional additional statements
    return i + j;
};

interface A {
        int show(int i,  int j );
    }

    class B implements A {
       public int show(int i, int j) {
            IO.println("Not Anonymous");
            return i + j;
        }
    }

    void main() {

        A obj2 = (i, j) -> {
            IO.println("This is return statement");
            return i + j;
        };

        obj2.show(7, 5);
    }
  
