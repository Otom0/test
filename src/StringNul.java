public class StringNul {
    public static void main(String[] args) {


        String s = null; // the string does not poit to an object
        if (s.length() == 0) {
            System.out.println("String is empty");
        }
    }
}
