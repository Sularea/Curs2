import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercitii {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try (isr;br){

            String line =br.readLine();

            StringBuilder builder = new StringBuilder(line);
            String reversed = builder.reverse().toString();

            System.out.println(reversed);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("test github");
        }
    }

}
