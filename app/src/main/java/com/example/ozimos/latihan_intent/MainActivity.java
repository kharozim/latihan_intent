package com.example.ozimos.latihan_intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnPindahAvtivity;
    private Button btnpindahdata;
    private Button btnDialPhone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPindahAvtivity = (Button) findViewById(R.id.btn_pindah_activity);
        btnPindahAvtivity.setOnClickListener(this);

       btnpindahdata = (Button)findViewById(R.id.btn_pindah_activity_data);
       btnpindahdata.setOnClickListener(this);

        btnDialPhone = (Button) findViewById(R.id.btn_dial_number);
        btnDialPhone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_pindah_activity:
                Intent pindahIntent = new Intent(MainActivity.this, PindahActivity.class);
                startActivity(pindahIntent);
                break;

            case R.id.btn_pindah_activity_data:
                Intent pindah = new Intent(MainActivity.this, PindahWithDataActivity.class);
                pindah.putExtra(PindahWithDataActivity.EXTRA_NAME,"Kharozim Boy\n");
                pindah.putExtra(PindahWithDataActivity.EXTRA_AGE,20);

                startActivity(pindah);

                break;

            case R.id.btn_dial_number:
                String phoneNumber = "085211649526";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;
        }
    }

}
