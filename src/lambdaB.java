interface  image{
//    void display(int a, int b);
//    int display1(int a, int b);
    int time(int a);
}
class class1 implements  image{
//    @Override
//    public int display1(int a, int b) {
//        return 0;
//    }

    @Override
    public int time(int a) {
        return 0;
    }

//    @Override
//    public void display(int a, int b) {
//        System.out.println("Result "+a*b);
//    }


}

public class lambdaB {
    public static void main(String[] args) {
        // there are four way to use the lambda expression
//        image image=(int a,int b)-> {System.out.println("Addition "+(a+b));};
//        image image1=(int a,int b)-> System.out.println("Subtraction "+(a-b));
//        image image2=( a, b)-> {System.out.println("multiplication "+(a*b));};
//        image image3=(a,b)-> System.out.println("Division "+(b/a));
//        image.display(10 ,20);
//        image1.display(10 ,20);
//        image2.display(10 ,20);
//        image3.display(10 ,20);
//        image img=(a,b)->(a*b);
//        img.display1(2,5);
        image imge=a -> a;
        imge.time(5);
    }
}
