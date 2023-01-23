package com.paulodias.bancomr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.paulodias.bancomr.databinding.ActivityFaturasBinding;
import com.vinaygaba.creditcardview.CardType;
import com.vinaygaba.creditcardview.CreditCardView;

public class Faturas extends AppCompatActivity {

    private ActivityFaturasBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFaturasBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_faturas);
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        binding.toolbarFaturas.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

        CreditCardView cartaoDeCredito = binding.cartaoDeCredito;
        cartaoDeCredito.setCardNumber("4267 9876 3489 0987");
        cartaoDeCredito.setCardName("Paulo Roberto F. Dias");
        cartaoDeCredito.setExpiryDate("11/28");
        cartaoDeCredito.setType(CardType.MASTERCARD);

    }
}