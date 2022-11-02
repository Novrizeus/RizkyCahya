package com.uts.fp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etNama, etNomor;
    private RadioGroup rgCK;
    private CheckBox ckCK;
    private Button btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = findViewById(R.id.et_nama);
        etNomor = findViewById(R.id.et_nomor);
        rgCK = findViewById(R.id.rg_ck);

        btnDaftar = findViewById(R.id.btn_daftar);
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String npm, nama, jk, prodi;
                int selectedID;
                nama = etNama.getText().toString();
                String nomor = etNomor.getText().toString();
                selectedID = rgCK.getCheckedRadioButtonId();
                ckCK = findViewById(selectedID);
                jk = ckCK.getText().toString();
                if (nama.trim().equals("")) {
                    etNama.setError("Nama Tidak Boleh Kosong");
                } else if (nama.trim().equals("")) {
                    etNomor.setError("Nama Tidak Boleh Kosong");
                } else {
                    Intent intent = new
                            Intent(MainActivity.this, ResultActivity.class);
                    intent.putExtra("varNPM", nama);
                    intent.putExtra("varNama", nomor);
                    intent.putExtra("varJK", jk);
                    startActivity(intent);
                }

            }
        });
    }
}