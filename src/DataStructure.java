import java.util.*;

public class DataStructure {
    public static void main(String[] args) {

//        Data Structure
//        - Way of effienctly
//        storing the data in memory;
//        -Time and Space Complexity
        /**
         * Type of Ds
         * 1 Primitive
         * - Boolean
         * -Char
         * -int
         * -Byte
         * -Double
         * -Float
         *You can store only single value
         * 2: Non-Primitive
         * type
         * 1 linear
         * -Array
         * -String
         * -List
         * -Set
         * -queue
         * -ArrayList
         * -Linked List
         * -HashSet
         * -Linked HashSet
         * 2 non-linear
         * -tree
         * -graph
         *  * Primitive you can create all type of convertor like temperature convertor
         *  * Non-primitive you can create Banking Social Networking
         *              Array                                               ArrayList
         *      1 fixed size                                                    Not Fixed
         *      2 Object value and primitive value                          Non-Primitive value only
         *      3 fast as compare to arrayList                              Slow as compare to array
         *      4 manual process/logic/algorithm fetching the value       PreDefined Methods
         *
         *Type Safe:-if we define the datatype of arraylist then it did not accept any other value
         *
         * Collection FrameWork :- Predefined Api used to store non-primitive data type
         * Package :-
         * Java.util.collection-arrayList, linkedList etc
         * java.util.map- Key value pair forms data
         * Iterable - Root
         *                                      Collection
         *                                           |
         *                 |-------------------------------------------------------------|
         *                 |                         |                                   |
         *               List                        Set                                 Queue
         *        --------|--------
         *       |                |
         *     ArrayList    Linked list         SortingSet HashSet Linked HashSet TreeSet

         * Common method to all the collection category
         * Package Used java.util.collection
         *
         *method
         * -add()
         * -addAll()
         * -remove()
         * -removeAll()
         * -clear()
         * -size()
         * -contains()
         * -containsAll()
         * -isEmpty()
         * -iterable() hasNext()-return boolean value  next()- return the value and place the pointer to the next element;
         * -printing :looping, iterable(next), direct, ListIterable(next, previous)
         * **/
//        ArrayList<E> here E denoted the generic type
        ArrayList arrayList=new ArrayList();
        arrayList.add(299);
        //Add method
        arrayList.add("Divyanshu");
        arrayList.add("Time Pass");
        LinkedList linkedList=new LinkedList();
        linkedList.add("Divyasnhu");
        linkedList.add("Singh");
        linkedList.add("good");
        linkedList.add(1,"time");

        Stack stack=new Stack();
        stack.add("Divyasnhu");
        stack.add("Singh");
        stack.add("good");
        stack.add(1,"time");

        // AddAll method
        ArrayList arrayList1=new ArrayList();
        arrayList1.add(578);
        arrayList1.add("Isha");
        arrayList1.add("Time  ");
        arrayList.addAll(arrayList1);
        System.out.println(arrayList);
        System.out.println(arrayList1);
        System.out.println(linkedList);
        System.out.println(stack);

        // Remove method
        arrayList.remove("Isha");
        //Remove All
        arrayList.removeAll(arrayList1);
        System.out.println(arrayList);
        Iterator arr=arrayList.iterator();
        while (arr.hasNext()){
            System.out.println(arr.next());
        }

//        ListIterator time=arrayList1.listIterator();
//        while (time.hasNext()){
//            System.out.println(arrayList1.);
//        }
//          List
        List list =new ArrayList<>() ;
        list.add(100);
        list.add(2003);
        list.add(3003);
        list.add(4003);
        list.add(5003);

        Iterator listIte=list.iterator();
        while (listIte.hasNext()){
            System.out.println(listIte.next());
        }
        ListIterator time =list.listIterator();





    }
}
