package Task2;
/**Класс столы*/
public class Table extends Furniture {
    public static String TYPE = "стол";
    int workingSurfaceArea;         // Площадь рабочей поверхности

    public Table(String manufacturer, String material, int price, int workingSurfaceArea) {
        super(manufacturer, material, price);
        this.workingSurfaceArea = workingSurfaceArea;
    }

    public int getWorkingSurfaceArea() {
        return workingSurfaceArea;
    }

    public void setWorkingSurfaceArea(int workingSurfaceArea) {
        this.workingSurfaceArea = workingSurfaceArea;
    }
}
