Annotation : gives extra information/instructions to the compiler or tools about your code.

@Override tells the compiler: “I intend to override a method. Check that I actually do :

It helps detect mistakes such as:

Wrong method name.
Wrong parameters.
Trying to override a method that doesn't exist.
  
********************************************************************************************************************************************************************
@Deprecated

Used to mark something as old/outdated.

@Deprecated
void oldMethod() {
}

Meaning:
“This still works, but don't use it in new code. There is a better alternative.” 
