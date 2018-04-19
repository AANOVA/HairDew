package studios.fyhrf.hairdew;

public class Ingredients {

    private String name;
    private boolean used ;
    private String price;

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class SheaButter extends Ingredients{
        boolean isUsed;
        final int price = 75;
    }

    public static class SheaOil extends Ingredients{
        boolean isUsed;
        final int price = 12;
    }
}
