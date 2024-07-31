import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileSum implements FileSummer {
    @Override
    public double calculateSum(File file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            StringTokenizer strtok = new StringTokenizer(br.readLine(), " ");
            double sum = 0;
            while(strtok.hasMoreTokens())
                sum += Double.parseDouble(strtok.nextToken());

            br.close();
            return sum;
        } catch (IOException e) {
            System.out.println("File not found.");
            return 0;
        }
    }

}
