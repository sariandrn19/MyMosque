package com.example.mymosque;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RekomenActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnBack;
    private Button btnKirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rekomen);

        btnBack = findViewById(R.id.btn_back);
        btnBack.setOnClickListener(this);

        btnKirim = findViewById(R.id.kirim);
        btnKirim.setOnClickListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_back:
                finish();
                break;
            case R.id.kirim:
                EditText text = (EditText) findViewById(R.id.nama);
                String nama = text.getText().toString();

                EditText text2 = (EditText) findViewById(R.id.nama_masjid);
                String nama_masjid = text2.getText().toString();

                EditText text3 = (EditText) findViewById(R.id.lokasi);
                String lokasi = text3.getText().toString();

                String isi = createIsi(nama, nama_masjid, lokasi);

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:")); // only email apps should handle this
                intent.putExtra(Intent.EXTRA_SUBJECT, "Halo Sari!");
                intent.putExtra(Intent.EXTRA_TEXT, isi);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"sariandriani665@gmail.com"});
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
                break;
        }
    }

    private String createIsi(String nama, String nama_masjid, String lokasi){
        String isi = "Halo Sari. Perkenalkan, nama saya adalah " + nama;
        isi += ". \n Saya mempunyai rekomendasi masjid terindah" ;
        isi += " yang bisa anda tambahkan ke aplikasi anda. Nama masjid ini adalah " + nama_masjid;
        isi += ". Masjid ini terletak di " + lokasi + ".";
        return isi;
    }
}
