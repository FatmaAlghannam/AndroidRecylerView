package com.falghannam.currenciesapp.Adapter;

import android.accounts.Account;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.recyclerview.widget.RecyclerView;

import com.falghannam.currenciesapp.Currency;
import com.falghannam.currenciesapp.R;

import java.util.ArrayList;

public class CurrencyAdapter extends RecyclerView.Adapter<CurrencyAdapter.AccountViewHolder> {


    private final ArrayList<Currency> CurrencyLists;

    public CurrencyAdapter(ArrayList<Currency> accountsLists) {
        this.CurrencyLists = accountsLists;
    }

    @NonNull
    @Override//inflater and we view it after and not adding to the
    public AccountViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.currencyitem,
                parent,
                false
        );
        return new AccountViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull AccountViewHolder holder, int position) {
        holder.nameTestView.setText(CurrencyLists.get(position).getCurrenyName());
        holder.codeTestView.setText(CurrencyLists.get(position).getCurrencyCode());
        holder.rateTestView.setText(String.valueOf(CurrencyLists.get(position).getExchangeRate()));


    }


    @Override
    public int getItemCount() {

        return CurrencyLists.size();
    }

    public static class AccountViewHolder extends RecyclerView.ViewHolder {

        TextView nameTestView;
        TextView codeTestView;
        TextView rateTestView;

        public AccountViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTestView = itemView.findViewById(R.id.nameTextView10);
            codeTestView = itemView.findViewById(R.id.codeNameTextView11);
            rateTestView = itemView.findViewById(R.id.rateNameTextView12);

        }
    }


}
