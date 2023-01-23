package com.paulodias.bancomr;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.paulodias.bancomr.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.imgSaldo.setOnClickListener(this);
        binding.imgFaturas.setOnClickListener(this);
        binding.imgTransferencia.setOnClickListener(this);
        binding.imgPoupanca.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int id = view.getId();

        if (id == R.id.imgSaldo){
            Intent navegarTelaDeSaldo = new Intent(MainActivity.this, Saldo.class);
            startActivity(navegarTelaDeSaldo);
        }else if (id == R.id.imgFaturas){
            Intent navergarTelaDeFaturas = new Intent(MainActivity.this, Faturas.class);
            startActivity(navergarTelaDeFaturas);
        }else if (id == R.id.imgTransferencia){
            Intent navegarTelaDeTranferencia = new Intent(MainActivity.this, Transferencia.class);
            startActivity(navegarTelaDeTranferencia);
        }else {
            Intent navegarTelaDePoupanca = new Intent(MainActivity.this, Poupanca.class);
            startActivity(navegarTelaDePoupanca);
        }

    }
}