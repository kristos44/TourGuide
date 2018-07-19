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
public class OtherFragment extends Fragment {


    public OtherFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.atraction_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<>(Arrays.asList(
            new Attraction("Manufaktura", "Centrum Handlowe Manufaktura – centrum handlowo-usługowo-rozrywkowe, otwarte 17 maja 2006 roku w Łodzi, pomiędzy ulicami Zachodnią, Ogrodową, Drewnowską i Karskiego, na terenie dawnego kompleksu fabrycznego Izraela Poznańskiego."),
            new Attraction("Ulica Piotrkowska", "Ulica Piotrkowska jest symbolem Łodzi. To historyczny trakt handlowy liczący 4,2 kilometry długości. Jest jedną z najdłuższych ulic handlowych w Europie."),
            new Attraction("Atlas Arena", "Atlas Arena – hala sportowo-widowiskowa w Łodzi. Trybuny mogą pomieścić 10.049 widzów, a na płycie można ustawić dodatkowo 3 tys. miejsc; do dyspozycji gości dostępnych jest 1500 miejsc postojowych, 4 ekrany multimedialne, i 11 loży VIP-owskich.")

        ));

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(new AttractionAdapter<Attraction>(getActivity(), attractions));

        return rootView;
    }

}
