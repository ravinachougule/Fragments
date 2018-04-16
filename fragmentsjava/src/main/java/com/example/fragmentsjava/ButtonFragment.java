package com.example.fragmentsjava;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ButtonFragment extends Fragment {


    public ButtonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view=inflater.inflate(R.layout.fragment_button, container, false);

        /*view.findViewById(R.id.btnRed).setOnClickListener(v -> {
            ColorFragment frag=new ColorFragment();
            Bundle bundle=new Bundle();
            bundle.putInt(ColorFragment.KEY_COLOR, Color.RED);
            frag.setArguments(bundle);
            ((MainActivity)getActivity()).loadFragment(frag);
        });
        view.findViewById(R.id.btnGreen).setOnClickListener(v -> {
            ColorFragment frag=new ColorFragment();
            Bundle bundle=new Bundle();
            bundle.putInt(ColorFragment.KEY_COLOR, Color.GREEN);
            frag.setArguments(bundle);
            ((MainActivity)getActivity()).loadFragment(frag);
        });*/

        view.findViewById(R.id.btnRed).setOnClickListener(v ->
            ((MainActivity)getActivity()).loadFragment(ColorFragment.getInstance(Color.RED)));
        view.findViewById(R.id.btnGreen).setOnClickListener(v ->
            ((MainActivity)getActivity()).loadFragment(ColorFragment.getInstance(Color.GREEN)));
        return view;
    }

}
