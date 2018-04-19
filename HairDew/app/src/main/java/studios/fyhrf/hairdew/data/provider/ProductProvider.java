package studios.fyhrf.hairdew.data.provider;

import java.util.ArrayList;
import java.util.List;

import studios.fyhrf.hairdew.data.model.Product;

/**
 * @author : Eduardo Medina
 * @see : https://developer.android.com/index.html
 * @since : 4/19/18
 */

public class ProductProvider {

    private List<Product> products;

    /*
     String rawSheaButterCost = "$10";
    String whiteSheaButterCost = "$8";
    String jojobaOilCost = "$5";
    String coconutOilCost = "$5";
    String grapeseedOilCost = "$5";
    String jamaicanBlackCasterOilCost = "$5";
    String roseWaterCost = "$3";
    String vanillaCost = "$3";
    String lavenderOilCost = "$3";
    String peppermintOilCost = "$3";
    String teaTreeOilCost = "$3";
     */

    public ProductProvider() {
        products= new ArrayList<>();
        products.add(new Product("Raw Shea Butter",10f,0));
        products.add(new Product("White Shea Butter",8f,0));
        products.add(new Product("Jojoba Oil",5f,0));
        products.add(new Product("Coconut Oil",5f,0));
        products.add(new Product("Grapeseed Oil",5f,0));
        products.add(new Product("Jamaican Back Castor Oil",5f,0));
        products.add(new Product("Rose Water",3f,0));
        products.add(new Product("Vanilla",3f,0));
        products.add(new Product("Lavender Oil",3f,0));
        products.add(new Product("Tea Tree Oil",3f,0));
        products.add(new Product("Peppermint Oil",3f,0));
    }

    public List<Product> getProducts() {
        return products;
    }
}
