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
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.atraction_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<>(Arrays.asList(
            new Attraction("Park Mickiewicza", "Zwany \"Parkiem Julianowskim\" od fundatora Juliusza Heinzla. Jeden z największych łódzkich parków, w którego obrębie znajduje się pokaźnych rozmiarów staw, tzw. \"muszla\" koncertowa oraz jedna z większych łódzkich rzek – Sokołówka. Park ten niejednokrotnie porównywany jest do warszawskich Łazienek."),
            new Attraction("Pasaż Abramowskiego", "Niewielki skwer łączący ulice: Henryka Sienkiewicza i Jana Kilińskiego. Nazwę swą wziął od biegnącej równolegle do niego ulicy Edwarda Abramowskiego (pasaż od ulicy dzieli zabudowa mieszkalna). Powstał on na dawnym terenie ogrodu Barcińskich. Jest miejscem odpoczynku i relaksu okolicznych mieszkańców i nie tylko. Zachętą do odwiedzania tego skweru jest duża ilość ławek oraz drzewostanu."),
            new Attraction("Borek Lissnera", "Niewielki skwer imienia łódzkiego fabrykanta Józefa Lissnera. Park położony jest w sąsiedztwie zakładów chemicznych Organika S.A. z 1889 roku. Właścicielem był wtedy Józef Lissner.")

        ));

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(new AttractionAdapter<Attraction>(getActivity(), attractions));

        return rootView;
    }

}
