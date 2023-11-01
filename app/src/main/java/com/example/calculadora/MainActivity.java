package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Vibrator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public double suma(double n1, double n2) {
        return n1 + n2;
    }

    public double resta(double n1, double n2) {
        return n1 - n2;
    }

    public double multiplicacion(double n1, double n2) {
        return n1 * n2;
    }

    public double division(double n1, double n2) {
        return n1 / n2;
    }

}