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


    private final ArrayList<Currency> accountLists;

    public CurrencyAdapter(ArrayList<Currency> accountsLists) {
        this.accountLists = accountsLists;
    }

    @NonNull
    @Override//inflater and we view it after and not adding to the
    public AccountViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.bank_account_item,
                parent,
                false
        );
        return new AccountViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull AccountViewHolder holder, int position) {
        holder.nameTestView.setText((CharSequence) accountLists.get(position));


    }


    @Override
    public int getItemCount() {

        return accountLists.size();
    }

    public static class AccountViewHolder extends RecyclerView.ViewHolder {

        TextView nameTestView;
        TextView codeTestView;
        TextView rateTestView;

        public AccountViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTestView = itemView.findViewById(R.id.accountNameTextView);
            codeTestView = itemView.findViewById(R.id.codeNameTextView);
            rateTestView = itemView.findViewById(R.id.rateNameTextView);

        }
    }

    private void Account() {
        for (int i = 0; i < 10; i++) {
            Currency Currencys = new Currency("KWD", "Kuwait Dinar", 1);

        }
    }
}
