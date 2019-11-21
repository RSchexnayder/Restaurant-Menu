import java.util.Objects;

public class menuItems {
   private Double price;
   private String description;
   private String category;
   private Boolean newItem = true;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        menuItems menuItems = (menuItems) o;
        return Objects.equals(price, menuItems.price) &&
                Objects.equals(description, menuItems.description) &&
                Objects.equals(category, menuItems.category) &&
                Objects.equals(newItem, menuItems.newItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, description, category, newItem);
    }

    public void newItem(Double price, String description, String category){
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public String getDescription() {
        return this.description;
    }
//​
    public void setDescription(String description) {
        this.description = description;
    }
//​
    public double getPrice() {
        return this.price;
    }
//​
    public void setPrice(double price) {
        this.price = price;
    }
//​
    public String getCategory() {
        return category;
    }
//​
    public void setCategory(String category) {
        this.category = category;
    }
//​
    public boolean isNew() {
        return newItem;
    }
//​
    public void setNew(boolean aNew) {
        newItem = aNew;
    }
//​
}
