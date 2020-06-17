package academy.learnprograming;

public class Room {
    private String name;
    private int width;
    private int length;
    private int height;
    private int outlet;
    private int light;
    private Furniture desk;
    private int deskNumber;
    private Furniture chair;
    private int chairNumber;

    public Room(String name, int length, int width, int height, int outlet, int light, int deskNumber, int chairNumber) {
        System.out.println("Roomクラスを初期化します");
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.outlet = outlet;
        this.light = light;
        desk = new Furniture("desk", deskNumber);
        chair = new Furniture("chair", chairNumber);
        System.out.println("Roomクラスの初期化が完了しました");
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getOutlet() {
        return outlet;
    }

    public int getLight() {
        return light;
    }

    public void setName() {
        this.name = name;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setOutlet(int outlet) {
        this.outlet = outlet;
    }

    public void setLight(int light) {
        this.light = light;
    }

    public int getFloorSpace() {
        int floorSpace = length * width;
        System.out.println(this.getName() + "の床面積は" + floorSpace + "平方メートルです");
        return floorSpace;
    }
    public int getVolume() {
        return length * width * height;
    }

}
