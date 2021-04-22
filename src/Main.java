import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
       int val = callSum(5, 2);
        System.out.println(val);

    }
    static int  callSum(int a, int b){
        int sum = a * b;
        return sum;
    }

}
