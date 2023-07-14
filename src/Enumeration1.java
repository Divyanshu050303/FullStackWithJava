import java.util.Enumeration;
import java.util.Vector;

public class Enumeration1 {

    public static void main(String[] args) {
        Vector vector=new Vector();
        vector.add(1);
        vector.add(11);
        vector.add(111);
        vector.add(1111);
        Enumeration vector1=vector.elements();
        while (vector1.hasMoreElements()){
            System.out.println(vector1.nextElement());
        }
    }
}
