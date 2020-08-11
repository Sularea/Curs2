import java.io.File;

public class ExercitiuDelete {

    public static void main(String[] args) {

        File file = new File("./Folder");


    }

    private static void deletDirector(File file) {
        File[] contents = file.listFiles();
        if (contents != null) {
            for (File f : contents) {
                deletDirector(f);
            }
            file.delete();
        }
    }
}