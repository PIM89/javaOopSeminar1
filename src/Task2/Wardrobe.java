package Task2;
/**Класс шкафы*/
public class Wardrobe extends Furniture {
    public static String TYPE = "шкаф";
    int width;      // Ширина
    int height;     // Высота
    int depth;      // Глубина

    public Wardrobe(String manufacturer, String material, int price, int width, int height, int depth) {
        super(manufacturer, material, price);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
}
