import java.util.ArrayList;

public class Human {
    private String person;
    private static ArrayList<Human> listHuman=new ArrayList<>(10);

    public Human(String person) {
        this.person = person;
        getListHuman().add(this);
    }

    public static ArrayList<Human> getListHuman() {
        return listHuman;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Имя - "+ person ;
    }
}
