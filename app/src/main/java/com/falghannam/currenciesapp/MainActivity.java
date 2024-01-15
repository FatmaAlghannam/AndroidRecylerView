package com.falghannam.currenciesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.falghannam.currenciesapp.Adapter.CurrencyAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView currencyRecyclerViews;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currencyRecyclerViews = findViewById(R.id.currencyRecyclerViews);

        ArrayList<Currency> currencyList = new ArrayList<>();
        CurrencyAdapter currencyAdapter = new CurrencyAdapter(currencyList);
        currencyRecyclerViews.setAdapter(currencyAdapter);
       Currency Currencys = new Currency("USD", "US Dollar", 3.25);
      // Currency Currencys = new Currency("KWD", "Euro", 2.96);

    }


}
