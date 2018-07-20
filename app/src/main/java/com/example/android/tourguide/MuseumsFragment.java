package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.atraction_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<>(Arrays.asList(
            new Attraction(getActivity().getString(R.string.museum_name_01), getActivity().getString(R.string.museum_description_01)),
            new Attraction(getActivity().getString(R.string.museum_name_02), getActivity().getString(R.string.museum_description_02)),
            new Attraction(getActivity().getString(R.string.museum_name_03), getActivity().getString(R.string.museum_description_03))

        ));

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(new AttractionAdapter<Attraction>(getActivity(), attractions));

        return rootView;
    }

}
