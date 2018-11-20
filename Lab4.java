public class Lab4 {
    public static void main(String[] args) {
        SportsEquipment sportsEquipment =
                new SportsEquipment("Round", "White", "plain",
                        "Ball", "High", 100);
        /*sportsEquipment.cost = 100;
        sportsEquipment.cost = sportsEquipment.cost + 100;
        sportsEquipment.cost += 100;
        System.out.println(sportsEquipment.cost);*/

//        sportsEquipment.color = "White";
        System.out.println(sportsEquipment.getColor());
        sportsEquipment.setColor("White", "MySupperPassword");
        System.out.println(sportsEquipment.getColor());
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
