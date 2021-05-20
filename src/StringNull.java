public class StringNull {
    public static void main(String[] args) {
        String s = null;// the string does not point to an object
        if (s != null && s.length() == 0) {
            System.out.println("String is empty");
        }
    }
}
