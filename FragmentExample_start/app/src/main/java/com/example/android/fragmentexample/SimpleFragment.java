package com.example.android.fragmentexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by Shereen on 12/22/2017.
 */

public class SimpleFragment extends Fragment {
    TextView fragmentHeader;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_simple, container, false);
        fragmentHeader = rootView.findViewById(R.id.fragment_header);
        RadioGroup radioGroup = rootView.findViewById(R.id.radio_group);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                int i;
                RadioButton radioButton = radioGroup.findViewById(checkedId);
                i = radioGroup.indexOfChild(radioButton);
                if (i == 0)
                    fragmentHeader.setText(getString(R.string.yes_message));
                else if (i == 1)
                    fragmentHeader.setText(getString(R.string.no_message));
            }
        });
        return rootView;
    }
}
