import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String filename = sc.next();
        Editor editor = Editor.getObject();

        editor.processFile(filename);
        sc.close();
    }
}
