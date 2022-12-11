import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String folderPath = "D:/games/";
        File file = new File(folderPath);
        System.out.println(getFolderSize(file));
    }
    public static long getFolderSize(File folder) {
        if (folder.isFile()) {
            return folder.length();
        }
        File[] files = folder.listFiles();
        long sum = 0;
        for (File file : files) {
            sum += getFolderSize(file);
        }
        return sum;
    }
}
