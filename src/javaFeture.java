public class javaFeture {
    public static void main(String[] args) {
        /*
        * Java 8 Features:-
        * - 2014
        * - Lambda Expression
        * - Functional Interface
        * - Stream Api
        * - Method References
        * - Optional class
        * - ForEach
        *
        * Lambda Expression:-
        * - Introduced in java 8
        * - Used to Implement Functional Interface
        * - No Modifiers
        * - No Return Type
        * - No Name
        * - Anonymous Function
        * - Doesn't belong to any class or object of any particular class
        * - Principles of Lambda Expression
        * - 1. if there is only single statement in body then remove the curly braces.
        * - 2. Type Inference "a"+"b", 10+20
        * - 3. No need of return keyword  when no braces (single statement)
        * - 4.  No need for parenthesis if singe parameter
        * - Syntax
        *   - () -> {}
        *   - () parameters
        *   - -> lambda
        *   - {} body
        *
        * - Functional Interface
        * - Introduced in java 8
        * - Interface that contain only 1 abstract method
        * - In Functional interface you can have n number of defaults and static methods.
        * - Annotations
        * - Examples
        * -- 1. interface laptop{
        *   void brand();
        *
        * }
        *
        * - Inbuilt Functional Interface
        * 1.Function<t,r>
        * T- Input
        * R- Result
        * */

        // creating the lambda expression
        shape shape = () ->{
            System.out.println("Time pass");
        };
        shape.draw();
    }
//    interface laptop{
//        void brand();
//        void ram();
//          public default   void   processors(){
//               System.out.println("processors methods");
//        }
//        public static void screen(){
//            System.out.println("Screen");
//        }
@FunctionalInterface
    interface shape{
        void draw();


}

class shapes_class implements  shape{

    @Override
    public void draw() {
        System.out.println("Hello form rectangle class calling shape interface");
    }
}
class cir implements shape{

    @Override
    public void draw() {
        System.out.println("Hello form circle class calling from the circle class");
    }
}
}
