import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class SumFromTextFile {
 
        public static void main(String[] args) throws IOException {
 
                try {
                        BufferedReader in = new BufferedReader(new FileReader("/home/pesho87/workspace/LoopsMethodsClasses/res/Input.txt"));
                        String line;
                        int sum = 0;
                        while ((line = in.readLine()) != null) {
                                sum += Integer.parseInt(line);
                        }
                        System.out.println(sum);
                        in.close();
                } catch (java.io.FileNotFoundException nfe) {
                        System.out.println("Error");
                }
        }
}