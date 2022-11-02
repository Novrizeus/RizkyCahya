package com.uts.fp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends Activity {
    private TextView tvNama, tvNomor, tvAsal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvNama = findViewById(R.id.tv_nama);
        tvNomor = findViewById(R.id.tv_nomor);
        tvAsal = findViewById(R.id.tv_asal);

        Intent intent = getIntent();
        tvNama.setText(((Intent) intent).getStringExtra("varNama"));
        tvNomor.setText(intent.getStringExtra("varNomor"));
        tvAsal.setText(intent.getStringExtra("varAsal"));

    }
}
