package com.example.gudang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import java.util.concurrent.ConcurrentHashMap;

public class MainActivity extends AppCompatActivity {

    EditText namabarang, jumlahbarang;
    CheckBox jenisbarang1, jenisbarang2;
    String TAG = "Activity";

    String jenBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namabarang = (EditText) findViewById(R.id.barang);
        jumlahbarang = (EditText) findViewById(R.id.jum_bar);
        jenisbarang1 = (CheckBox) findViewById(R.id.elektron);
        jenisbarang2 = (CheckBox) findViewById(R.id.rumahTg);

    }

    public void input(View view) {
        String nambar = namabarang.getText().toString();
        Log.d(TAG, nambar);
        String jumbar = jumlahbarang.getText().toString();
        Log.d(TAG,jumbar);
        String jenBar1 = jenisbarang1.getText().toString();
        Log.d(TAG,jenBar1);
        String janBar2 = jenisbarang2.getText().toString();
        Log.d(TAG, janBar2);

        Intent intent = new Intent(MainActivity.this,DetailBarang.class);
        intent.putExtra("nama barang",nambar);
        //intent.putExtra("jenis barang elektronik",jenBar1);
        //intent.putExtra("jenis barang rumahTangga", janBar2);
        intent.putExtra("jumlah barang", jumbar);


        if (jenisbarang1.isChecked()){
            String jenBar = jenisbarang1.getText().toString();
            Log.d(TAG,jenBar);
            intent.putExtra("jenis barang elektronik",jenBar);
        }else if (jenisbarang2.isChecked()){
            String jenBar = jenisbarang2.getText().toString();
            Log.d(TAG,jenBar);
            intent.putExtra("jenis barang rumahTangga",jenBar);

        }        startActivity(intent);

    }
}
