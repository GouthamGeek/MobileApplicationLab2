package goutham.moorthy.s300948360;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class GouthamCondominiumActivity extends AppCompatActivity {

    ArrayList<String> checkedOptions = new ArrayList<>(); // array to store selected apartments options to view, 1st element is apartment type

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goutham_condominium);

        //---CheckBox---
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.gouthamCondominiumCheckBox1);
        checkBox1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.condoAddress1) + " - " + getResources().getString(R.string.condoPrice1));
            }
        });

        CheckBox checkBox2 = (CheckBox) findViewById(R.id.gouthamCondominiumCheckBox2);
        checkBox2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.condoAddress2) + " - " + getResources().getString(R.string.condoPrice2));
            }
        });

        CheckBox checkBox3 = (CheckBox) findViewById(R.id.gouthamCondominiumCheckBox3);
        checkBox3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.condoAddress3) + " - " + getResources().getString(R.string.condoPrice3));
            }
        });

        CheckBox checkBox4 = (CheckBox) findViewById(R.id.gouthamCondominiumCheckBox4);
        checkBox4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.condoAddress4) + " - " + getResources().getString(R.string.condoPrice4));
            }
        });

        CheckBox checkBox5 = (CheckBox) findViewById(R.id.gouthamCondominiumCheckBox5);
        checkBox5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.condoAddress5) + " - " + getResources().getString(R.string.condoPrice5));
            }
        });

        Button nextButton = findViewById(R.id.gouthamCondominiumNextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GouthamCondominiumActivity.this, GouthamCheckoutActivity.class);
                intent.putExtra("selectedApt", checkedOptions);
                startActivity(intent);
            }
        });
    }
}