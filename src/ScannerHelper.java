import java.util.Scanner;

public class ScannerHelper {

    public static String getString(String question){
        System.out.println(question);

        return new Scanner(System.in).nextLine();
    }

    public static int getInt(String question){
        System.out.println(question);
        return new Scanner(System.in).nextInt();
    }
}
