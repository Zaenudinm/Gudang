package com.example.gudang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class DetailBarang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_barang);

        TextView namaoutputBarang = findViewById(R.id.output_barang);
        String barOutput = getIntent().getStringExtra("nama barang");
        namaoutputBarang.setText(barOutput);

        TextView namaBarElektro = findViewById(R.id.output_elektron);
        String elektronOutput = getIntent().getStringExtra("jenis barang elektronik");
        namaBarElektro.setText(elektronOutput);

        TextView namaBarRumahTg = findViewById(R.id.output_rumahTg);
        String rumahTgOutput = getIntent().getStringExtra("jenis barang rumahTangga");
        namaBarRumahTg.setText(rumahTgOutput);

        TextView jumBarang = findViewById(R.id.output_jumlahBar);
        String outputJumBar = getIntent().getStringExtra("jumlah barang");
        jumBarang.setText(outputJumBar);



    }
}
