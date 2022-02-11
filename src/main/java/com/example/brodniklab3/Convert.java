package com.example.brodniklab3;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class Convert {


    private static final NumberFormat currencyFormat =
            NumberFormat.getCurrencyInstance();

    public static double convertToEuro(View view){
        EditText USD = (EditText) view.findViewById(R.id.USD_editText);

        double dollars = Double.parseDouble(USD.getText().toString());
        double euro = 0.85;

        double result = dollars * euro;

       // TextView euroOut = (TextView) view.findViewById(R.id.euroTextViewOut);
       // euroOut.setText(currencyFormat.format(Double.toString(result)));
        return result;
    }
    public static double convertToPound(View view){
        EditText USD = (EditText) view.findViewById(R.id.USD_editText);

        double dollars = Double.parseDouble(USD.getText().toString());
        double pound = 0.73;

        double result = dollars * pound;

        //TextView poundOut = (TextView) view.findViewById(R.id.poundTextViewOut);
       // poundOut.setText(currencyFormat.format(Double.toString(result)));
        return result;
    }
    public static double convertToYen(View view){
        EditText USD = (EditText) view.findViewById(R.id.USD_editText);

        double dollars = Double.parseDouble(USD.getText().toString());
        double yen = 109.20;

        double result = dollars * yen;

       // TextView yenOut = (TextView) view.findViewById(R.id.yentextViewOut);
       // yenOut.setText(currencyFormat.format(Double.toString(result)));
        return result;
    }

}
