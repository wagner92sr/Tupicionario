package br.com.wagnerapps.tupicionario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class CulinariaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culinaria);

        String culinariaArray[] = getResources().getStringArray(R.array.culinaria);
        List<String> listCulinaria = Arrays.asList(culinariaArray);
    }
}
