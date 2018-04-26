package studios.fyhrf.hairdew;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import studios.fyhrf.hairdew.data.model.Product;
import studios.fyhrf.hairdew.data.provider.ProductProvider;
import studios.fyhrf.hairdew.ui.adapter.ProductAdapter;


public class SubmitActivity extends AppCompatActivity {

    private List<Product> products= new ArrayList<>();

    private ListView listViewProduct;

    private void extras(){
        if(getIntent()!=null && getIntent().getExtras()!=null){
            ArrayList<Integer> productIdArray=getIntent().getExtras().getIntegerArrayList("storedChecks");
            getProducts(productIdArray);
        }

    }

    private void getProducts( ArrayList<Integer> productIdArray){
        Product product;
        for (int i = 0; i < productIdArray.size(); i++) {
            product= ProductProvider.productById(productIdArray.get(i));
            if(product!=null){
                products.add(product);
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);
        extras();
        ui();

        Log.v("CONSOLE",  "Products "+products);
        //boolean [] array = getIntent().getBooleanArrayExtra("storedChecks");


        TextView storedChecks= findViewById(R.id.displayStoredChecks);
        //storedChecks.setText(array.toString());

        populateProducts();
    }

    private void populateProducts() {

        listViewProduct.setAdapter(new ProductAdapter(this,products));
    }

    private void ui(){
        listViewProduct= findViewById(R.id.listViewProduct);
    }


}