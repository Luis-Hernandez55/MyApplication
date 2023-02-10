package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        (findViewById(R.id.btnAceptar)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String nombre = ((TextView)findViewById(R.id.txtNombre)).getText().toString();
        Toast.makeText(getApplicationContext(), getString(R.string.texto_resultado).replace("{nombre}",nombre), Toast.LENGTH_LONG).show();
    }
}