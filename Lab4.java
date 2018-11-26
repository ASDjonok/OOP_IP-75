import java.util.Arrays;
import java.util.Comparator;

public class Lab4 {
    public static void main(String[] args) {
        SportsEquipment sportsEquipment =
                new SportsEquipment("Round", "Black", "plain",
                        "Ball", "High", 100);

        SportsEquipment[] sportsEquipments = new SportsEquipment[3];
        sportsEquipments[0] = sportsEquipment;
        sportsEquipments[1] = new SportsEquipment("Square", "Red", "plain",
                "Ball", "High", 200);
        sportsEquipments[2] = new SportsEquipment("Round", "White", "plain",
                "Ball", "High", 300);

        for (int i = 0; i < sportsEquipments.length; i++) {
            System.out.println(sportsEquipments[i].getShape() + " " +
                    sportsEquipments[i].getColor() + " " +
                    sportsEquipments[i].getTexture() + " " +
                    sportsEquipments[i].getName() + " " +
                    sportsEquipments[i].getQuality() + " " +
                    sportsEquipments[i].getCost());
        }

        Arrays.sort(sportsEquipments, Comparator.comparing(SportsEquipment::getShape));

        System.out.println("+++++++++++++++++++++");

        for (int i = 0; i < sportsEquipments.length; i++) {
            System.out.println(sportsEquipments[i].getShape() + " " +
                    sportsEquipments[i].getColor() + " " +
                    sportsEquipments[i].getTexture() + " " +
                    sportsEquipments[i].getName() + " " +
                    sportsEquipments[i].getQuality() + " " +
                    sportsEquipments[i].getCost());
        }

        Arrays.sort(sportsEquipments, Comparator.comparing(SportsEquipment::getColor).reversed());

        System.out.println("+++++++++++++++++++++");

        for (int i = 0; i < sportsEquipments.length; i++) {
            System.out.println(sportsEquipments[i].getShape() + " " +
                    sportsEquipments[i].getColor() + " " +
                    sportsEquipments[i].getTexture() + " " +
                    sportsEquipments[i].getName() + " " +
                    sportsEquipments[i].getQuality() + " " +
                    sportsEquipments[i].getCost());
        }
        /*sportsEquipment.cost = 100;
        sportsEquipment.cost = sportsEquipment.cost + 100;
        sportsEquipment.cost += 100;
        System.out.println(sportsEquipment.cost);*/

//        sportsEquipment.color = "White";
        /*System.out.println(sportsEquipment.getColor());
        sportsEquipment.setColor("White", "MySupperPassword");
        System.out.println(sportsEquipment.getColor());*/
        /*System.out.println("Done! ;-)^)^))^");
        int a = 1;
        int b = 2;
        boolean c = false;
        if (a) {

        }
        System.out.println(a + b);
        System.out.println(a + c);*/
    }
}
