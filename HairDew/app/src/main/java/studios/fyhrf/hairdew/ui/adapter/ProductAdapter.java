package studios.fyhrf.hairdew.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import studios.fyhrf.hairdew.R;
import studios.fyhrf.hairdew.data.model.Product;

/**
 * @author : Eduardo Medina
 * @see : https://developer.android.com/index.html
 * @since : 4/25/18
 */

public class ProductAdapter extends BaseAdapter {

    private final Context context;
    private List<Product> data;

    public ProductAdapter(Context context, List<Product> mData) {
        this.context = context;
        this.data = mData;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if (convertView == null) {
            view = LayoutInflater.from(this.context).inflate(R.layout.row_product, parent, false);
        } else {
            view = convertView;
        }
        TextView textViewName = view.findViewById(R.id.textViewName);
        textViewName.setText(data.get(position).getName());
        return view;
    }
}
