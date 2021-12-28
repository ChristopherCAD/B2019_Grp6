package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast;

public class pp_rabbit_diseases extends AppCompatActivity implements View.OnClickListener{

    LinearLayout rabbit_disease1, rabbit_disease2, rabbit_disease3;
    LinearLayout rabbit_disease4, rabbit_disease5, rabbit_disease6;
    CardView rabbitDisease1, rabbitDisease2, rabbitDisease3, rabbitDisease4, rabbitDisease5;
    CardView rabbitDisease6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp_rabbit_diseases);

        // CardView Block

        rabbitDisease1 = findViewById(R.id.rabbitDisease1);
        rabbitDisease2 = findViewById(R.id.rabbitDisease2);
        rabbitDisease3 = findViewById(R.id.rabbitDisease3);
        rabbitDisease4 = findViewById(R.id.rabbitDisease4);
        rabbitDisease5 = findViewById(R.id.rabbitDisease5);
        rabbitDisease6 = findViewById(R.id.rabbitDisease6);

        // Click Listener Block

        rabbitDisease1.setOnClickListener(this);
        rabbitDisease2.setOnClickListener(this);
        rabbitDisease3.setOnClickListener(this);
        rabbitDisease4.setOnClickListener(this);
        rabbitDisease5.setOnClickListener(this);
        rabbitDisease6.setOnClickListener(this);


        // Diseases Block

        rabbit_disease1 = findViewById(R.id.rabbitdisease1);
        rabbit_disease2 = findViewById(R.id.rabbitdisease2);
        rabbit_disease3 = findViewById(R.id.rabbitdisease3);
        rabbit_disease4 = findViewById(R.id.rabbitdisease4);
        rabbit_disease5 = findViewById(R.id.rabbitdisease5);
        rabbit_disease6 = findViewById(R.id.rabbitdisease6);

        // Intent Block

        Boolean check1 = getIntent().getExtras().getBoolean("rs1");
        Boolean check2 = getIntent().getExtras().getBoolean("rs2");
        Boolean check3 = getIntent().getExtras().getBoolean("rs3");
        Boolean check4 = getIntent().getExtras().getBoolean("rs4");
        Boolean check5 = getIntent().getExtras().getBoolean("rs5");

        if (check1 && check3 && check4 && check2) {
            rabbit_disease2.setVisibility(View.GONE);
            rabbit_disease5.setVisibility(View.GONE);
            rabbit_disease6.setVisibility(View.GONE);
            showToast("Conditions Met");
        }
        if (check2 && check5) {
            rabbit_disease1.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease4.setVisibility(View.GONE);
            showToast("Conditions are met.");
        }


        // Try the if Statement here tomorrow!!!! DON'T YOU DARE GIVE UP
        // Good job, self ;)

    }
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void onClick(View v){
        Intent activate;

        switch (v.getId()) {
            case R.id.rabbitDisease1:
                activate = new Intent(this, disease1_rabbit.class);
                startActivity(activate);
                break;
            default:
                break;
        }
    }

}