
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Menu {
    private ArrayList<menuItems> items;
    private Date lastUpdated;

    public Menu() {
        this.items = new ArrayList<>();
        this.lastUpdated = new Date();
    }

    public void addItem(menuItems item){
        items.add(item);
        this.lastUpdated = new Date();
    }

    public void removeItem (menuItems item){
        this.items.remove(item);
        this.lastUpdated = new Date();
    }

    public Date getLastUpdated(){
        return lastUpdated;
    }

    public ArrayList<menuItems> getItems() {
        return items;
    }

    public String getItem (String item){
        if (items.contains(item)){
            int index = items.indexOf(item);
            return items.get(index).toString();
        } else {
           return item + " is not on the menu.";
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(items, menu.items) &&
                Objects.equals(lastUpdated, menu.lastUpdated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, lastUpdated);
    }

}
