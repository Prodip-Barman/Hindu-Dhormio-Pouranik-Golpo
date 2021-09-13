package com.example.golpo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView gorur, balmiki, basbad, ekolobbo, upomonu, aruni, narod, durbasa, prohllad, dhruvo, korno, vismo, nondini, ostobosu, porsuram, sudama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gorur = findViewById(R.id.gorur);
        balmiki = findViewById(R.id.balmiki);
        basbad = findViewById(R.id.basbad);
        ekolobbo = findViewById(R.id.ekolobbo);
        upomonu = findViewById(R.id.upomonu);
        aruni = findViewById(R.id.aruni);
        narod = findViewById(R.id.narod);
        durbasa = findViewById(R.id.durbasa);
        prohllad = findViewById(R.id.prohllad);
        dhruvo = findViewById(R.id.dhruvo);
        korno = findViewById(R.id.korno);
        vismo = findViewById(R.id.vismo);
        nondini = findViewById(R.id.nondini);
        ostobosu = findViewById(R.id.ostobosu);
        porsuram = findViewById(R.id.porsuram);
        sudama = findViewById(R.id.sudama);

        gorur.setOnClickListener(this);
        balmiki.setOnClickListener(this);
        basbad.setOnClickListener(this);
        ekolobbo.setOnClickListener(this);
        upomonu.setOnClickListener(this);
        aruni.setOnClickListener(this);
        narod.setOnClickListener(this);
        durbasa.setOnClickListener(this);
        prohllad.setOnClickListener(this);
        dhruvo.setOnClickListener(this);
        korno.setOnClickListener(this);
        vismo.setOnClickListener(this);
        nondini.setOnClickListener(this);
        ostobosu.setOnClickListener(this);
        porsuram.setOnClickListener(this);
        sudama.setOnClickListener(this);

    }

    @Override
    public void onBackPressed() {
        AlertDialog builder = new AlertDialog.Builder(this)
                .setMessage("আপনি কি অ্যাপটি বন্ধ করতে চান?")
                .setNegativeButton("না", null)
                .setPositiveButton("হ্যা", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finishAffinity();
                    }
                }).show();
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, StoryActivity.class);

        switch (v.getId()) {
            case R.id.gorur:
                intent.putExtra("story", 1);
                startActivity(intent);
                break;
            case R.id.balmiki:
                intent.putExtra("story", 2);
                startActivity(intent);
                break;
            case R.id.basbad:
                intent.putExtra("story", 3);
                startActivity(intent);
                break;
            case R.id.ekolobbo:
                intent.putExtra("story", 4);
                startActivity(intent);
                break;
            case R.id.upomonu:
                intent.putExtra("story", 5);
                startActivity(intent);
                break;
            case R.id.aruni:
                intent.putExtra("story", 6);
                startActivity(intent);
                break;
            case R.id.narod:
                intent.putExtra("story", 7);
                startActivity(intent);
                break;
            case R.id.durbasa:
                intent.putExtra("story", 8);
                startActivity(intent);
                break;
            case R.id.prohllad:
                intent.putExtra("story", 9);
                startActivity(intent);
                break;
            case R.id.dhruvo:
                intent.putExtra("story", 10);
                startActivity(intent);
                break;
            case R.id.korno:
                intent.putExtra("story", 11);
                startActivity(intent);
                break;
            case R.id.vismo:
                intent.putExtra("story", 12);
                startActivity(intent);
                break;
            case R.id.nondini:
                intent.putExtra("story", 13);
                startActivity(intent);
                break;
            case R.id.ostobosu:
                intent.putExtra("story", 14);
                startActivity(intent);
                break;
            case R.id.porsuram:
                intent.putExtra("story", 15);
                startActivity(intent);
                break;
            case R.id.sudama:
                intent.putExtra("story", 16);
                startActivity(intent);
                break;
        }
    }
}