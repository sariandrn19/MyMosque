package com.example.mymosque;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class ThirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Arab Saudi","Masjidil Haram", R.drawable.indah_1));
        words.add(new Word("Arab Saudi","Masjid Nabawi", R.drawable.indah_2));
        words.add(new Word("Turki","Masjid Sultan Ahmet", R.drawable.indah_3));
        words.add(new Word("Indonesia","Masjid Istiqlal", R.drawable.indah_4));
        words.add(new Word("Pakistan","Masjid Badshahi", R.drawable.indah_5));
        words.add(new Word("Pakistan","Masjid Faisal", R.drawable.indah_6));
        words.add(new Word("Brunei Darussalam","Masjid Hassanal Bolkiah", R.drawable.indah_7));
        words.add(new Word("Iran","Masjid Imam", R.drawable.indah_8));
        words.add(new Word("Uni Emirat Arab","Masjid Sheikh Zayed", R.drawable.indah_9));
        words.add(new Word("Maroko","Masjid Hassan II", R.drawable.indah_10));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_terbaik);
        ListView listView =  (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}


