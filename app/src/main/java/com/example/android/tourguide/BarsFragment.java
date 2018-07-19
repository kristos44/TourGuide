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
public class BarsFragment extends Fragment {


    public BarsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.atraction_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<>(Arrays.asList(
            new Attraction("Biblioteka Pub", "Przyjemny oraz kameralny Pub położony w centrum miasta blisko ul.Piotrkowskiej. Z powodu bliskiego położenia Uniwersytetu Łódzkiego odwiedzany głównie przez studentów oraz młodych ludzi. Zróżnicowana muzyka, przyjemna obsługa oraz nie wygórowane ceny nadają niesamowity klimat temu miejscu.", R.drawable.bar01),
            new Attraction("Irish Pub", "Irish Pub'77 istnieje od 1994 roku. Jest to miejsce skupiające różne środowiska naszego miasta. Atmosfera panująca w pubie gwarantuje dobrą zabawę dla tych wszystkich, którzy chcą miło spędzić swój wolny czas. Bardzo często wydawane są w pubie przyjęcia dla firmy polski i zagranicznych.", R.drawable.bar02),
            new Attraction("Ambasada Club", "Ambasada to prestiżowy lokal znajdujący się w centrum miasta, na rogu ulic Zielonej i Al.Kościuszki. Klub Ambasada to dwie sale z dancefloorami, cztery bary obsługiwane przez profesjonalną obsługę barmańską i kelnerską oraz jedyny taki w Łodzi Bar Vip. Klub Ambasada jest jednym z największych miejsc na mapie klubowej Łodzi.", R.drawable.bar03)

        ));

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(new AttractionAdapter<Attraction>(getActivity(), attractions));

        return rootView;
    }

}
