package com.example.mymosque;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MasjidA extends Fragment {

    public MasjidA(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        //inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_masjid, container,false);
    }
}
