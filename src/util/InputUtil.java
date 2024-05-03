package util;

import java.util.Scanner;

public class InputUtil {

    public static String InputRequiredStr(String titile){
        Scanner scanner = new Scanner(System.in);
        System.out.println(titile);
        return scanner.nextLine();
    }

    public static int InputRequiredInt(String title){
        Scanner scanner = new Scanner(System.in);
        System.out.println(title);
        return scanner.nextInt();
    }


}
