package com.example.buah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
 TextView txtNamaBuah,txtTipeAkar,txtBentukDaun,txtVar1,txtVar2,txtVar3;
 ApiInterpace apiInterpace;
 Buah buah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNamaBuah=(TextView)findViewById(R.id.txt_NamaBuah);
        txtBentukDaun=(TextView)findViewById(R.id.txt_BentukDaun);
        txtTipeAkar=(TextView)findViewById(R.id.txt_TipeAkar);
        txtVar1=(TextView)findViewById(R.id.txt_Var1);
        txtVar2=(TextView)findViewById(R.id.txt_Var2);
        txtVar3=(TextView)findViewById(R.id.txt_Var3);
        apiInterpace=Apiclient.ambilData().create(ApiInterpace.class);
        Call<Buah> call=apiInterpace.getBuah();
        call.enqueue(new Callback<Buah>() {
            @Override
            public void onResponse(Call<Buah> call, Response<Buah> response) {
                buah=response.body();
                txtNamaBuah.setText(buah.getNama_buah());
                txtBentukDaun.setText(buah.getBentuk_daun());
                txtTipeAkar.setText(buah.getTipe_akar());
                txtVar1.setText(buah.getVariasi().get(0));
                txtVar2.setText(buah.getVariasi().get(1));
                txtVar3.setText(buah.getVariasi().get(2));
            }

            @Override
            public void onFailure(Call<Buah> call, Throwable t) {

            }
        });
    }
}

