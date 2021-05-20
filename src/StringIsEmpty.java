public class StringIsEmpty {
    public static void main(String[] args) {
        String s = ""; // the string does not point to an object
        if(s.length() == 0)
            System.out.println("String is empty");
    }
}
