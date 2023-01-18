package Task3;

public class Animal {
    private String name;    // имя
    private String colour;  // цвет
    private int weight;  // вес
    private int height;  // рост

    public Animal(String name, String colour, int weight, int height) {
        this.name = name;
        this.colour = colour;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
