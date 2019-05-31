package exercises.restaurant;

import java.util.ArrayList;
import java.time.LocalDate;

public class Menu {
    String name;
    ArrayList<MenuItem> items;
    LocalDate dateUpdated;



    public Menu(String name){
        this.name = name;
        this.items = new ArrayList<>();
        this.dateUpdated = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public LocalDate getDateUpdated() {
        return dateUpdated;
    }

}
