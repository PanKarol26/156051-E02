import java.io.File;
import java.util.Arrays;

public class zadanie3 {
    public static void main(String dir){
        File[] katalog = new File(dir).listFiles();

        Arrays.sort(katalogi, (x,y)) -> {
            if(x.isDirectory() && !y.isDirectory()){
                return 1;
            }
            if(!x.isDirectory() &&!y.isDirectory()){
                return -1;
            }
            return x.compareTo(y);
        }

        Arrays.stream(katalogi).forEach(System.out::println);
    }

}
