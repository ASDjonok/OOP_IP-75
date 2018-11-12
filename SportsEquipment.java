public class SportsEquipment {
    private String shape; //Round, Square
    private String color;
    private String texture;
    private String name;
    private String quality;
    private int cost;

    public String getColor() {
        return color;
    }

    public void setColor(String color, String password) {
        if (password.equals("MySupperPassword")) {
            this.color = color;
        } else {
            System.out.println("GO AWAY!!!");
        }
    }
}
