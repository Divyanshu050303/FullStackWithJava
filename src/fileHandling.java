import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class fileHandling {
    public static void main(String[] args) throws IOException {
        /*
        * - File Handling
        * - File
        * - Package java.io
        * - Data Persistent
        * - Stream --> that contains the flow with the help of metadata either from source to destination ot destination to source.
        * - Abstract class
        * - Type of Stream
        * --> Input
        * --> Output
        *
        * --> byte Stream :- Representation of characters with 8 bits
        *                    Easily understandable by machine
        * --> Character Stream :-Representation of characters with 16 bits
        *                        No need to remember the codes
        *                        Converted into byte stream
        * - Classes
        * --> File class:-
        * File Class Methods
        * - Method
        * - Practices
        *
        * */
        File file=new File("C:/Users/Divyanshu singh/IdeaProjects/FullStackWithJava/src/time1");
//to create the file we use the create new file method
//        System.out.println( file.createNewFile());
        // to check the file is exists or not we are use .exists method
//        System.out.println(file.exists());
        // to find the length of the file we use .length() method
//        System.out.println( file.length());
        // To check the file name we have getName() method
//        System.out.println(file.getName());
        // to get the path we have the getPath method which gives abstract path
//        System.out.println(file.getPath());

        }
}
