package goutham.moorthy.s300948360;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class GouthamTownActivity extends AppCompatActivity {

    ArrayList<String> checkedOptions = new ArrayList<>(); // array to store selected apartments options to view, 1st element is apartment type

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goutham_town);

        //---CheckBox---
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.gouthamTownCheckBox1);
        checkBox1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.townAddress1) + " - " + getResources().getString(R.string.townPrice1));
            }
        });

        CheckBox checkBox2 = (CheckBox) findViewById(R.id.gouthamTownCheckBox2);
        checkBox2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.townAddress2) + " - " + getResources().getString(R.string.townPrice2));
            }
        });

        CheckBox checkBox3 = (CheckBox) findViewById(R.id.gouthamTownCheckBox3);
        checkBox3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.townAddress3) + " - " + getResources().getString(R.string.townPrice3));
            }
        });

        CheckBox checkBox4 = (CheckBox) findViewById(R.id.gouthamTownCheckBox4);
        checkBox4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.townAddress4) + " - " + getResources().getString(R.string.townPrice4));
            }
        });

        CheckBox checkBox5 = (CheckBox) findViewById(R.id.gouthamTownCheckBox5);
        checkBox5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.townAddress5) + " - " + getResources().getString(R.string.townPrice5));
            }
        });

        Button nextButton = findViewById(R.id.gouthamTownNextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GouthamTownActivity.this, GouthamCheckoutActivity.class);
                intent.putExtra("selectedApt", checkedOptions);
                startActivity(intent);
            }
        });
    }
}