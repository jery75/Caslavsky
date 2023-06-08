package Models;

public class Zakaznici {
    private int ID;
    private String name;
    private String surname;


    public Zakaznik(int ID, String name, String surname ) {
        this.ID=ID;
        this.name = name;
        this.surname = surname;

    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

}
