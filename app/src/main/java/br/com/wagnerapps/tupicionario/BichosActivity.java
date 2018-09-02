package br.com.wagnerapps.tupicionario;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class BichosActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_bichos);

        String bichosArray[] = getResources().getStringArray(R.array.bichos);
        List<String> listBichos = Arrays.asList(bichosArray);
    }
}
