package com.falghannam.currenciesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.falghannam.currenciesapp.Adapter.CurrencyAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView currencyRecyclerViews;
    ArrayList<Currency> currencyList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currencyRecyclerViews = findViewById(R.id.RecyclerViewTextView);
        currencyRecyclerViews.setLayoutManager(new LinearLayoutManager(this));
        addCurrency();
        CurrencyAdapter currencyAdapter = new CurrencyAdapter(currencyList);
        currencyRecyclerViews.setAdapter(currencyAdapter);

    }

    private void addCurrency() {
        currencyList.add(new Currency("Kuwait", "KWD", 1.0));
        currencyList.add(new Currency("Euro", "EUR", 0.32));


    }


}
