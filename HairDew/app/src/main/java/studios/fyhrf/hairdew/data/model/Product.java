package studios.fyhrf.hairdew.data.model;

import java.io.Serializable;

/**
 * @author : Eduardo Medina
 * @see : https://developer.android.com/index.html
 * @since : 4/19/18
 */

public class Product implements Serializable {

    private String name;
    private boolean used ;
    private float price;
    private int section;

    public Product(String name, float price, int section) {
        this.name = name;
        this.price = price;
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }
}
