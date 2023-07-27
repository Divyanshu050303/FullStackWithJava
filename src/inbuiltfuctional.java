import java.util.function.Function;

class inbuilt implements Function<String,Integer> {


    @Override
    public Integer apply(String s) {
        return s.length();
    }


}


public class inbuiltfuctional {
    public static void main(String[] args) {
        inbuilt inbuilt=new inbuilt();
        int time=inbuilt.apply("divyanshu");
        System.out.println(time);
        Function<String, Integer> function=(String s)->{
            return s.length();
        };
        System.out.println(function.apply("divyanshu singh"));
    }
}
