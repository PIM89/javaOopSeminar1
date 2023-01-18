package Task3;

public class Cat extends Animal{
    private final String type = "Кот";
    private String breed;       // порода
    private String typeOfWool;  // тип шерсти

    public Cat(String name, String colour, int weight, int height, String breed, String typeOfWool) {
        super(name, colour, weight, height);
        this.breed = breed;
        this.typeOfWool = typeOfWool;
    }

    public void voice() {
        System.out.println(type + " " + this.getName() + " мяучит");
    }
}
