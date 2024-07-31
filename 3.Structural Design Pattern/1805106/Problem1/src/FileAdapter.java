import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class FileAdapter implements FileSummer{
    private FileSummer summer;
    public FileAdapter(){
        summer = new FileSum();
    }

    @Override
    public double calculateSum(File file){
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            StringTokenizer strtok = new StringTokenizer(br.readLine(), "~");
            PrintWriter pw = new PrintWriter(new File("intermediate.txt"));
            while(strtok.hasMoreTokens())
                pw.print(strtok.nextToken() + (strtok.hasMoreTokens() ? " " : ""));

            pw.close();
            br.close();
            return summer.calculateSum(new File("intermediate.txt"));
        } catch (IOException e) {
            System.out.println("File not found.");
            return 0;
        }
        
    }
}
