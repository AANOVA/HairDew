package studios.fyhrf.hairdew;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fyhrf on 3/24/2018.
 */

public class BuildProductActivity extends AppCompatActivity {
    static private float price;

    public CheckBox rawSheaButter;
    public CheckBox whiteSheaButter;
    public CheckBox jojobaOil;
    public CheckBox coconutOil;
    public CheckBox grapeseedOil;
    public CheckBox jamaicanBlackCastorOil;
    public CheckBox roseWater;
    public CheckBox vanilla;
    public CheckBox lavenderOil;
    public CheckBox peppermintOil;
    public CheckBox teaTreeOil;
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

    float fRawSheaButterCost = 10;
    float fWhiteSheaButterCost = 8;
    float fJojobaOilCost = 5;
    float fCoconutOilCost = 5;
    float fGrapeseedOilCost = 5;
    float fJamaicanBlackCasterOilCost = 5;
    float fRoseWaterCost = 3;
    float fVanillaCost = 3;
    float fLavenderOilCost = 3;
    float fPeppermintOilCost = 3;
    float fTeaTreeOilCost = 3;

    private List<CheckBox> checkBoxList;
    private List<Float> prices;
    private float total=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build_product);
        checkBoxList = new ArrayList<>();
        checkBoxList.add((CheckBox)findViewById(R.id.raw_shea_butter));
        checkBoxList.add((CheckBox)findViewById(R.id.white_Shea_Butter));
        checkBoxList.add((CheckBox)findViewById(R.id.jojoba_oil));
        checkBoxList.add((CheckBox)findViewById(R.id.grapeseed_oil));
        checkBoxList.add((CheckBox)findViewById(R.id.jamaican_black_castor_oil));
        checkBoxList.add((CheckBox)findViewById(R.id.rose_water));
        checkBoxList.add((CheckBox)findViewById(R.id.vanilla));
        checkBoxList.add((CheckBox)findViewById(R.id.lavender_oil));
        checkBoxList.add((CheckBox)findViewById(R.id.peppermint_oil));
        checkBoxList.add((CheckBox)findViewById(R.id.teatree_oil));

        prices = new ArrayList<>();
        prices.add(fRawSheaButterCost);
        prices.add(fWhiteSheaButterCost);
        prices.add(fJojobaOilCost);
        prices.add(fCoconutOilCost);
        prices.add(fGrapeseedOilCost);
        prices.add(fJamaicanBlackCasterOilCost);
        prices.add(fRoseWaterCost);
        prices.add(fVanillaCost);
        prices.add(fLavenderOilCost);
        prices.add(fPeppermintOilCost);
        prices.add(fTeaTreeOilCost);

        priceViews();

        updateOrderSum();

        events();

    }

    private void events(){
        for (final CheckBox checkbox:checkBoxList) {
            checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    checkTotalPrice();
                }
            });
        }
    }

    private void checkTotalPrice() {
        total=0;
        int position;
        for (final CheckBox checkbox:checkBoxList) {
            position=checkBoxList.indexOf(checkbox);
            if(checkbox.isChecked()){
                total+=prices.get(position);
            }
        }

        Log.v("CONSOLE","total price is "+total);

        ((TextView)findViewById(R.id.order_sum)).setText("Total :$ "+total);
    }

    //Method that displays the total cost of a purchase.
    public float displayOrderSum(float sum) {
        TextView orderSum = (TextView) findViewById(R.id.order_sum);
        orderSum.setText(String.valueOf(sum));
        return sum;
        }
    //This method updates the total price of a purchase
    public float updatedPrice(float num){
        float newNum = price + num;
        displayOrderSum(newNum);

        return newNum;

    }

    public void updateOrderSum() {
        rawSheaButter = findViewById(R.id.raw_shea_butter);
        rawSheaButter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean yesRawShea = rawSheaButter.isChecked();
                if (yesRawShea) {

                    updatedPrice(fRawSheaButterCost);
                }else {

                }


            }
        });
        whiteSheaButter = findViewById(R.id.white_Shea_Butter);
        whiteSheaButter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean yesWShea = whiteSheaButter.isChecked();
                if (yesWShea) {
                    //updatedPrice(fWhiteSheaButterCost);

                }
            }


        });
    }

//This method displays the prices of the products
    public void priceViews (){
        Ingredients ingredients1A = new Ingredients();
        ingredients1A.setName("Raw Shea Butter");
        ingredients1A.setPrice(rawSheaButterCost);

        Ingredients ingredients1B = new Ingredients();
        ingredients1B.setName("White Shea Butter");
        ingredients1B.setPrice(whiteSheaButterCost);

        Ingredients ingredients2A = new Ingredients();
        ingredients2A.setName("Jojoba Oil");
        ingredients2A.setPrice(jojobaOilCost);

        Ingredients ingredients2B = new Ingredients();
        ingredients2B.setName("Coconut Oil");
        ingredients2B.setPrice(coconutOilCost);

        Ingredients ingredients2C = new Ingredients();
        ingredients2C.setName("Grapeseed Oil");
        ingredients2C.setPrice(grapeseedOilCost);

        Ingredients ingredients2D = new Ingredients();
        ingredients2D.setName("Jamaican Back Castor Oil");
        ingredients2D.setPrice(jamaicanBlackCasterOilCost);

        Ingredients ingredients3A = new Ingredients();
        ingredients3A.setName("Rose Water");
        ingredients3A.setPrice(roseWaterCost);

        Ingredients ingredients3B = new Ingredients();
        ingredients3B.setName("Vanilla");
        ingredients3B.setPrice(vanillaCost);

        Ingredients ingredients3C = new Ingredients();
        ingredients3C.setName("Lavender Oil");
        ingredients3C.setPrice(lavenderOilCost);

        Ingredients ingredients3D = new Ingredients();
        ingredients3D.setName("Tea Tree Oil");
        ingredients3D.setPrice(teaTreeOilCost);

        Ingredients ingredients3E = new Ingredients();
        ingredients3E.setName("Peppermint Oil");
        ingredients3E.setPrice(peppermintOilCost);


        TextView rSTextView = (TextView) findViewById(R.id.raw_shea_butterPrice);
        rSTextView.setText(ingredients1A.getPrice());

        TextView wSTextView = (TextView) findViewById(R.id.white_shea_butterPrice);
        wSTextView.setText(ingredients1B.getPrice());

        TextView jojobaOilTextView = (TextView) findViewById(R.id.jojoba_oilPrice);
        jojobaOilTextView.setText(ingredients2A.getPrice());

        TextView coconutOilTextView = (TextView) findViewById(R.id.coconut_oilPrice);
        coconutOilTextView.setText(ingredients2B.getPrice());

        TextView grapeseedOilTextView = (TextView) findViewById(R.id.grapeseed_oilPrice);
        grapeseedOilTextView.setText(ingredients2C.getPrice());

        TextView jamaicanOilTextView = (TextView) findViewById(R.id.jamaican_black_castor_oilPrice);
        jamaicanOilTextView.setText(ingredients2D.getPrice());

        TextView roseWaterTextView = (TextView) findViewById(R.id.rose_waterPrice);
        roseWaterTextView.setText(ingredients3A.getPrice());

        TextView vanillaTextView = (TextView) findViewById(R.id.vanillaPrice);
        vanillaTextView.setText(ingredients3B.getPrice());

        TextView lavenderOilTextView = (TextView) findViewById(R.id.lavender_oilPrice);
        lavenderOilTextView.setText(ingredients3C.getPrice());

        TextView peppermentOilTextView = (TextView) findViewById(R.id.peppermint_oilPrice);
        peppermentOilTextView.setText(ingredients3D.getPrice());

        TextView teatreeOilTextView = (TextView) findViewById(R.id.teatree_oilPrice);
        teatreeOilTextView.setText(ingredients3E.getPrice());

    }
//    public void stuff (){
//          CHECK BOX CLICKS------------------------------------
//        rawSheaButter = findViewById(R.id.raw_shea_butter);
//        boolean yesRawShea = rawSheaButter.isChecked();
//
//        whiteSheaButter = findViewById(R.id.white_Shea_Butter);
//        boolean yesWShea = whiteSheaButter.isChecked();
//
//        jojobaOil = findViewById(R.id.jojoba_oil);
//        boolean yesJojo = jojobaOil.isChecked();
//
//        coconutOil = findViewById(R.id.coconut_oil);
//        boolean yesCoconut = coconutOil.isChecked();
//
//        grapeseedOil = findViewById(R.id.grapeseed_oil);
//        boolean yesGrapeSeed = grapeseedOil.isChecked();
//
//        jamaicanBlackCastorOil = findViewById(R.id.jamaican_black_castor_oil);
//        boolean yesJamaicanBCO = jamaicanBlackCastorOil.isChecked();
//
//        roseWater = findViewById(R.id.rose_water);
//        boolean yesRoseWater = roseWater.isChecked();
//
//        vanilla = findViewById(R.id.vanilla);
//        boolean yesVanilla = vanilla.isChecked();
//
//        lavenderOil = findViewById(R.id.lavender_oil);
//        boolean yesLavender = lavenderOil.isChecked();
//
//        peppermintOil = findViewById(R.id.peppermint_oil);
//        boolean yesPeppermint = peppermintOil.isChecked();
//
//        teaTreeOil = findViewById(R.id.teatree_oil);
//        boolean yesTeaTree = teaTreeOil.isChecked();
    //-------------PRICE VIEWS---------------------







//}

}
