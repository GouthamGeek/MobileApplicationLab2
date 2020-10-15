package goutham.moorthy.s300948360;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class GouthamSemiActivity extends AppCompatActivity {

    ArrayList<String> checkedOptions = new ArrayList<>(); // array to store selected apartments options to view, 1st element is apartment type

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goutham_semi);

        //---CheckBox---
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.gouthamSemiCheckBox1);
        checkBox1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.semiAddress1) + " - " + getResources().getString(R.string.semiPrice1));
            }
        });

        CheckBox checkBox2 = (CheckBox) findViewById(R.id.gouthamSemiCheckBox2);
        checkBox2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.semiAddress2) + " - " + getResources().getString(R.string.semiPrice2));
            }
        });

        CheckBox checkBox3 = (CheckBox) findViewById(R.id.gouthamSemiCheckBox3);
        checkBox3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.semiAddress3) + " - " + getResources().getString(R.string.semiPrice3));
            }
        });

        CheckBox checkBox4 = (CheckBox) findViewById(R.id.gouthamSemiCheckBox4);
        checkBox4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.semiAddress4) + " - " + getResources().getString(R.string.semiPrice4));
            }
        });

        CheckBox checkBox5 = (CheckBox) findViewById(R.id.gouthamSemiCheckBox5);
        checkBox5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.semiAddress5) + " - " + getResources().getString(R.string.semiPrice5));
            }
        });

        Button nextButton = findViewById(R.id.gouthamSemiNextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GouthamSemiActivity.this, GouthamCheckoutActivity.class);
                intent.putExtra("selectedApt", checkedOptions);
                startActivity(intent);
            }
        });
    }
}