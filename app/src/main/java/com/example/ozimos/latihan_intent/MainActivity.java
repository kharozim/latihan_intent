package com.example.ozimos.latihan_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnPindahAvtivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPindahAvtivity = (Button) findViewById(R.id.btn_pindah_activity);
        btnPindahAvtivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_pindah_activity:
                Intent pindahIntent  = new Intent(MainActivity.this,PindahActivity.class);
                startActivity(pindahIntent);
                break;
        }
    }
}
