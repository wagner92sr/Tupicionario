package br.com.wagnerapps.tupicionario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class PlantasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plantas);

        String plantasArray[] = getResources().getStringArray(R.array.plantas);
        List<String> listPlantas = Arrays.asList(plantasArray);

        LinearLayout root = findViewById(R.id.rootPlantas);
        for (String plantas : listPlantas) {
            TextView textView = new TextView(this);
            textView.setText(plantas);
            root.addView(textView);
        }
    }
}
