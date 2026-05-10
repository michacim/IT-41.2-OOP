import java.io.FileWriter;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("write...");
        FileHandler.writeText("out.txt");
        System.out.println("read...");
        FileHandler.readText("out.txt");

//        String s = "Hallo guten Tag";

//        String[] arr = s.split(" ");
//
//        System.out.println(Arrays.toString(arr));
    }
}