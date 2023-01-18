package Task2;

public class Human {
    private String surname; // Фамилия
    private String name;    // Имя


    public Human(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    @Override
    public String toString() {
        return surname + ' ' + name + ' ';
    }

    /**
     * Взаимодействие человека и шкафа (человек двигает шкаф)
     */
    public void move(Wardrobe wardrobe) { System.out.println(toString() + "подвинул " + Wardrobe.TYPE); }

    /**
     * Взаимодействие человека и стола (человек протёр стол)
     */
    public void wipe(Table table) {
        System.out.println(toString() + "протёр " + Table.TYPE);
    }
}
