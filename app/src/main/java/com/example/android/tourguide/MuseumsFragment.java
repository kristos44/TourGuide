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
            new Attraction("Muzeum Miasta Łodzi", "Muzeum Miasta Łodzi – łódzkie muzeum mające swoją siedzibę w jednym z najbardziej okazałych budynków miasta, w dawnym pałacu łódzkiego fabrykanta Izraela Poznańskiego przy ul. Ogrodowej."),
            new Attraction("Muzeum Tradycji Niepodległościowych w Łodzi", "Muzeum Tradycji Niepodległościowych w Łodzi (nazwa obowiązująca od 1 stycznia 1990) – najdłużej funkcjonujące w Łodzi muzeum o profilu historycznym, powstałe w 1959 pod nazwą „Muzeum Historii Ruchu Rewolucyjnego”; samorządowe, gromadzące wszelkiego rodzaju pamiątki z zakresu tradycji niepodległościowych, przede wszystkim z Łodzi, regionu łódzkiego oraz wybiórczo Polski."),
            new Attraction("Radegast", "Radegast – właściwie „stacja Marysin”. W okresie II wojny światowej łódzki Umschlagplatz. Obecnie oddział „Stacja Radegast” Muzeum Tradycji Niepodległościowych w Łodzi, przy al. Pamięci Ofiar Litzmannstadt Getto 12.")

        ));

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(new AttractionAdapter<Attraction>(getActivity(), attractions));

        return rootView;
    }

}
