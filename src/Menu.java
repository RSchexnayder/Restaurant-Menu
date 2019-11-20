
import java.util.ArrayList;
import java.util.Date;

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
}
