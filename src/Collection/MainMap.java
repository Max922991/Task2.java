package Collection;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {

        Map<String, Cat> map = new HashMap<>();

        Cat lori = new Cat("lori", 4);
        Cat baxter = new Cat("baxter", 7);
        Cat martin = new Cat("martin", 3);
        Cat bublic = new Cat("bublic", 9);

        String  loriName = "lori";
        String baxterName = "baxter";
        String martinName = "martin";
        String bublicName = "bublic";

        map.put(loriName, lori);
        map.put(baxterName, baxter);
        map.put(martinName, martin);
        map.put(bublicName, bublic);

        System.out.println(map.get(loriName));
        System.out.println(map.get(baxterName));
        System.out.println(map.get(martinName));
        System.out.println(map.get(bublicName));

        WeekDays friday = WeekDays.FRIDAY;

        WeekDays monday = WeekDays.valueOf("MONDAY");
        System.out.println(monday);








    }
}
