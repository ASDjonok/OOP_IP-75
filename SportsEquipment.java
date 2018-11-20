public class SportsEquipment {
    private String shape; //Round, Square
    private String color;
    private String texture;
    private String name;
    private String quality;
    private int cost;

    public SportsEquipment(String shape, String color, String texture,
                           String name, String quality, int cost) {
        this.shape = shape;
        this.color = color;
        this.texture = texture;
        this.name = name;
        this.quality = quality;
        this.cost = cost;
    }

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
