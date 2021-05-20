package SCvsBR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Bro {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
////        String str = scanner.next();
//////        System.out.println(str);
////        int num = Integer.parseInt(str);
////        System.out.println(num + 2);
//        int num = Integer.parseInt(scanner.nextLine());
//        System.out.println(num + 3);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String strin = br.readLine();
//        int num = Integer.parseInt(strin);
//        System.out.println(num + 1);
        int num = Integer.parseInt(br.readLine());
        System.out.println(num + 2);
    }
}
