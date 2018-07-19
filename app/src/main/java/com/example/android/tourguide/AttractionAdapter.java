package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by krzysztof on 19.07.18.
 */

public class AttractionAdapter<W> extends ArrayAdapter<Attraction> {

    public AttractionAdapter(@NonNull Context context, @NonNull List<Attraction> attractions) {
        super(context, 0, attractions);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final Attraction attraction = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(attraction.getName());

        TextView descriptionTextView = listItemView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(attraction.getDescription());

        int imageResourceId = attraction.getImageResourceId();
        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        if(imageResourceId != 0) {
            image.setImageResource(imageResourceId);
        } else {
            image.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
