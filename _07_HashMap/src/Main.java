import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> farben = new HashMap<>();  // see neues HashMap Java25
        farben.put("rot", "#ff0000"); //key:value

        farben.put("grün", "#00ff00");
        farben.put("blau", "#00ff00");

        System.out.println(farben);
        System.out.println(farben.get("grün"));//-> Value: #00ff00

        farben.put("blau","#00AA00"); // Element mit Key "blau" wird überschrieben

        System.out.println(farben);

        System.out.println(farben.containsKey("blau"));
        if(farben.containsKey("blau")){
            System.out.println("blau vorhanden");
        }

        String v =farben.remove("grün");
        System.out.println(v);
        System.out.println(farben);


        for(String key:farben.keySet()){  // foreach über keySet
            System.out.println(key+": "+farben.get(key));

        }



        HashMap<Integer, List<Integer>>  map = new HashMap<>();

        map.put(1,List.of(2,33,1,7,40));
        map.put(2,List.of(4,32,1,12,44));

        System.out.println(map.get(2));//[4, 32, 1, 12, 44]

        HashMap<LocalDateTime, Integer> map2 = new HashMap<>();
        map2.put(LocalDateTime.now(),2);
        map2.put(LocalDateTime.now(),4);
        System.out.println(map2);

    }
}