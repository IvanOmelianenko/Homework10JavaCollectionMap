import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Map;

public class MapChamp {
    public static void main(String[] args) {
        Map<String, Integer> mapChamp = new HashMap<>();
        mapChamp.put("Manchester City", 1);
        mapChamp.put("Arsenal", 2);
        mapChamp.put("Manchester United", 3);
        mapChamp.put("Newcastle", 4);
        mapChamp.put("Liverpool", 5);
        mapChamp.put("Brighton", 6);
        mapChamp.put("Aston Villa", 7);
        mapChamp.put("Tottenham", 8);
        mapChamp.put("Brentford", 9);
        mapChamp.put("Fulham", 10);

        for(Map.Entry<String, Integer> mapping: mapChamp.entrySet()) {
            System.out.println(mapping.getKey() + " " + mapping.getValue());
        }

    }

}
