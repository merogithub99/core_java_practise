package functionPractise.oop;

//Create a class called MainProgram and inside the class create a function called display()
// with no parameters and inside a body of display method add a line
// “Hello, I am called”. Call the function from the main method of
// MainProgram by creating the object of MainProgram.

public class Que1 {
   void display(){
       System.out.println("hello, I am called");
    }

    public static void main(String[] args) {
        Que1 q1= new Que1();
        q1.display();
    }


}
