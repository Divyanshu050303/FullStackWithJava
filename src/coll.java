import java.util.*;

public class coll {
    public static void main(String[] args) {
        ArrayList arr=new ArrayList();
        arr.add(1);
        arr.add("isha");
        arr.add(true);
        arr.add(2.3);
        arr.add('a');
        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(6);
        Iterator rs=arr.iterator();
        while(rs.hasNext()){
            System.out.println(rs.next());
        }
        System.out.println("in a previous order");
        ListIterator t=arr1.listIterator();
        while(t.hasNext()){
            t.next();
        }
        while(t.hasPrevious()){
            System.out.println(t.previous());
        }
        HashSet h=new HashSet();
        for(int i=0;i<arr.size();i++){
            h.add(arr.get(i));
        }
        System.out.println(h);
    }
}
