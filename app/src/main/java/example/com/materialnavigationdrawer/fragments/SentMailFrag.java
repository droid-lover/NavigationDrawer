package example.com.materialnavigationdrawer.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import example.com.materialnavigationdrawer.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SentMailFrag extends Fragment {


    public SentMailFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sent_mail, container, false);
    }

}
