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

    private static List<Product> products;

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

    public static void setUp() {
        products= new ArrayList<>();
        products.add(new Product(100,"Raw Shea Butter",10f,0));
        products.add(new Product(101,"White Shea Butter",8f,0));
        products.add(new Product(102,"Jojoba Oil",5f,0));
        products.add(new Product(103,"Coconut Oil",5f,0));
        products.add(new Product(104,"Grapeseed Oil",5f,0));
        products.add(new Product(105,"Jamaican Back Castor Oil",5f,0));
        products.add(new Product(106,"Rose Water",3f,0));
        products.add(new Product(107,"Vanilla",3f,0));
        products.add(new Product(108,"Lavender Oil",3f,0));
        products.add(new Product(109,"Tea Tree Oil",3f,0));
        products.add(new Product(110,"Peppermint Oil",3f,0));
    }

    public  static List<Product> getProducts() {
        return products;
    }

    public static Product productById(int id){
        for (Product product:products) {
            if(product.getId()==id){
                return product;
            }
        }
        return null;
    }
}
