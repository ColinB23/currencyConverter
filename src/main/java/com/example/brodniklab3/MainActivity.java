package com.example.brodniklab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    TextView euroTextViewOut;
    TextView poundTextViewOut;
    TextView yenTextViewOut;
    TextView amountEditText;

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.imageView);
        img.setImageResource(R.drawable.money);
        euroTextViewOut= findViewById(R.id.euroTextViewOut);
        poundTextViewOut= findViewById(R.id.poundTextViewOut);
        yenTextViewOut= findViewById(R.id.yentextViewOut);

        amountEditText= findViewById(R.id.USD_editText);

        EditText amountEditText =
               (EditText) findViewById(R.id.USD_editText);

        amountEditText.addTextChangedListener(amountEditTextWatcher);}

        final TextWatcher amountEditTextWatcher = new TextWatcher() {
            private final NumberFormat currencyFormat =
                    NumberFormat.getCurrencyInstance();

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {

                try {
                    double resultE = Convert.convertToEuro(amountEditText);

                    currencyFormat.format(resultE);
                    euroTextViewOut.setText(Double.toString(resultE));

                    double resultP = Convert.convertToPound(amountEditText);
                    currencyFormat.format(resultP);
                    poundTextViewOut.setText(Double.toString(resultP));

                    double resultY = Convert.convertToYen(amountEditText);
                    currencyFormat.format(resultY);
                    yenTextViewOut.setText(Double.toString(resultY));

                } catch (NumberFormatException e) {
                   euroTextViewOut.setText("Error");
                   poundTextViewOut.setText("Error");
                   yenTextViewOut.setText("Error");
                }
                //Convert.convertToEuro();
               // Convert.convertToPound();
               // Convert.convertToYen();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }

            @Override
            public void beforeTextChanged(
                    CharSequence s, int start, int count, int after) {
            }
        };
    }