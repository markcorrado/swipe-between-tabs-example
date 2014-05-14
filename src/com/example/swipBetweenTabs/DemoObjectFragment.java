package com.example.swipBetweenTabs;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by mark on 5/7/14.
 */
public class DemoObjectFragment extends android.support.v4.app.Fragment {
    public static final String ARG_OBJECT = "object";

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // The last two arguments ensure LayoutParams are inflated
        // properly.

        View rootView = inflater.inflate(R.layout.fragment_collection_object, container, false);
        Bundle args = getArguments();
        TextView textView = (TextView) rootView.findViewById(R.id.text1);
        Integer testInteger = args.getInt(ARG_OBJECT);
        textView.setText(Integer.toString(testInteger));
        return rootView;
    }
}
