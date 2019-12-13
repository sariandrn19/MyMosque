package com.example.mymosque;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SejarahMasjid extends AppCompatActivity implements View.OnClickListener {

    Button btnMasjidA, btnMasjidB,btnMasjidC;
    MasjidA masjida;
    MasjidB masjidb;
    MasjidC masjidc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah);

        btnMasjidA= findViewById(R.id.masjidA);
        btnMasjidA.setOnClickListener(this);

        btnMasjidB = findViewById(R.id.masjidB);
        btnMasjidB.setOnClickListener(this);

        btnMasjidC = findViewById(R.id.masjidC);
        btnMasjidC.setOnClickListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    void mMasjidA(){
        FragmentTransaction fTrans=getSupportFragmentManager().beginTransaction();
        masjida = new MasjidA();
        fTrans.replace(R.id.container,masjida);
        fTrans.commit();
    }

    void mMasjidB(){
        FragmentTransaction fTrans=getSupportFragmentManager().beginTransaction();
        masjidb = new MasjidB();
        fTrans.replace(R.id.container,masjidb);
        fTrans.commit();
    }

    void mMasjidC(){
        FragmentTransaction fTrans=getSupportFragmentManager().beginTransaction();
        masjidc = new MasjidC();
        fTrans.replace(R.id.container,masjidc);
        fTrans.commit();
    }

    @Override
    public void onClick(View view) {
    if(view==btnMasjidA)
        mMasjidA();
    if(view==btnMasjidB)
            mMasjidB();
    if(view==btnMasjidC)
            mMasjidC();
    if(view==btnMasjidA)
           mMasjidA();
    }
}
