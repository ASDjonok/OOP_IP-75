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

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
