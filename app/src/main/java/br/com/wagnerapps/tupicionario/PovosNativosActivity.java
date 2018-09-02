package br.com.wagnerapps.tupicionario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class PovosNativosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_povos_nativos);

        String povosNativosArray[] = getResources().getStringArray(R.array.povos_nativos);
        List<String> listPovosNativos = Arrays.asList(povosNativosArray);
    }
}
