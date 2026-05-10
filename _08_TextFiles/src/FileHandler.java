import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileHandler {

    public static void writeText(String filename){

        try {
            FileWriter fw = new FileWriter(filename);
            for (int i = 0; i < 5; i++) {
                fw.write(i+1+",Max,2552242,ma@web.de\n");
            }
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void readText(String filename){
        try {
            Scanner sc = new Scanner(new File(filename));// out.txt
            while(sc.hasNext()){
                String line = sc.nextLine();
                String[] arr= line.split(",");
                //System.out.println(Arrays.toString(arr));
                int id = Integer.parseInt(arr[0]);
                String name = arr[1];
                String number =arr[2];
                String email =arr[3];

                // hier new Contact(id,name,number,email)
                // Contact zu ArrayList hinzufügen

                System.out.printf("%s %s %s %s\n",id, name,number,email );
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }



}
