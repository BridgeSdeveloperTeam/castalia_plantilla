package com.mx.bridgestudio.kangup.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mx.bridgestudio.kangup.R;

public class SocioActivity extends AppCompatActivity {

    private Button enter,register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socio);

        enter = (Button)findViewById(R.id.enter);
        enter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                finish();
                //startActivity(new Intent(LoginActivity.this, TypesOfAutomobiles.class));
                startActivity(new Intent(SocioActivity.this, TypesOfAutomobiles.class));
            }
        });
        register = (Button)findViewById(R.id.registerA);
        register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                finish();
                //startActivity(new Intent(LoginActivity.this, TypesOfAutomobiles.class));
                startActivity(new Intent(SocioActivity.this, RegisterActivity.class));
            }
        });
    }
}
