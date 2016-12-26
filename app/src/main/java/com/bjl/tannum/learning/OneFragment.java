package com.bjl.tannum.learning;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class OneFragment extends Fragment {

    //String str;
    private static final String KEY_STRING = "key_string";
    TextView textView1;

    public OneFragment() {
        // Required empty public constructor
    }

    public static OneFragment newInstance() {
        OneFragment fragment = new OneFragment();
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        Log.d("debug", "OnCreateView");

        View rootView = inflater.inflate(R.layout.fragment_one,container,false);
        textView1 = (TextView)rootView.findViewById(R.id.textView1);

        return rootView;
    }
    public String getMyText() {
        return textView1.getText().toString();
    }
    @Override
    public void onDestroy() {

        super.onDestroy();

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("debug", "OnDestroyView");
    }
}
