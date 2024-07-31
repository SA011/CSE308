import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String packageName = sc.next();
        String communication = sc.next();
        int number_of_display = sc.nextInt();

        QueueManagementSystemBuilder builder = new QueueManagementSystemBuilder();

        builder.addPackage(packageName, number_of_display);
        builder.addCommunication(communication);

        QueueManagementSystem product = builder.getObject();

        product.printSystem();

        sc.close();
    }
}
