import java.io.File;
import java.io.IOException;

public class Exemplul1 {
    public static void main(String[] args) {

        File file = new File("./");
        //boolean succes=file.mkdir();

        String [] directprCurent = file.list();

        for (String s : directprCurent) {
            System.out.println(s);
        }

        //System.out.println(succes);
    }
}
