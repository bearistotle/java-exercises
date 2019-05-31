package exercises.restaurant;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenuItem {
    double price;
    String description;
    String category;
    LocalDate dateCreated;
    boolean recent;

    public MenuItem(double price, String description, String category, LocalDate dateCreated){
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateCreated = dateCreated;
        this.recent = isRecent(this);

    }
    public boolean isRecent(MenuItem item){
        if (item.dateCreated.until(LocalDate.now(), ChronoUnit.DAYS) < 30){
            return true;
        } else {
            return false;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

}
