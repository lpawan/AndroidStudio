package com.example.pawan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Api api=retrofit.create(Api.class);
        Call<List<Hero>> call=api.getHeros();
        call.enqueue(new Callback<List<Hero>>() {
            @Override
            public void onResponse(Call<List<Hero>> call, Response<List<Hero>> response) {
                List<Hero> heroes=response.body();
                for(Hero h: heroes) {
                    Toast.makeText(getApplication(), h.getName(), Toast.LENGTH_LONG).show();
                    Log.d("name", h.getName());
                    Log.d("realname", h.getRealname());
                    Log.d("imageurl", h.getImageurl());
                }
            }
            @Override
            public void onFailure(Call<List<Hero>> call, Throwable t) {
                Toast.makeText(getApplication(),"failed", Toast.LENGTH_SHORT).show();
            }
        });
    }

}