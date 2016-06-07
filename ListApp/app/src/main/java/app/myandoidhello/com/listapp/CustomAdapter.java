package app.myandoidhello.com.listapp;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdapter extends ArrayAdapter<String> {

    public CustomAdapter(Context context, String [] Fruits) {
        super(context,R.layout.custom_row, Fruits);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater myInflater = LayoutInflater.from(getContext());
        View CustomView = myInflater.inflate(R.layout.custom_row,parent,false);

        // Get a reference
        String singleFruitItem = getItem(position);
        TextView myText = (TextView) CustomView.findViewById(R.id.myText);
        ImageView apple = (ImageView) CustomView.findViewById(R.id.apple);

        myText.setText(singleFruitItem);
        apple.setImageResource(R.drawable.apple);
        return CustomView;
    }
}
