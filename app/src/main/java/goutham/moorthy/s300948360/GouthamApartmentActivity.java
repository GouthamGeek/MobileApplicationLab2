package goutham.moorthy.s300948360;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class GouthamApartmentActivity extends AppCompatActivity {

    ArrayList<String> checkedOptions = new ArrayList<>(); // array to store selected apartments options to view, 1st element is apartment type

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gouthamapartment);

        //---CheckBox---
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.gouthamCheckBox1);
        checkBox1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (((CheckBox) v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.Address1) + " - " + getResources().getString(R.string.apartmentPrice1));
            }
        });

        CheckBox checkBox2 = (CheckBox) findViewById(R.id.gouthamCheckBox2);
        checkBox2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (((CheckBox) v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.Address2) + " - " + getResources().getString(R.string.apartmentPrice2));
            }
        });

        CheckBox checkBox3 = (CheckBox) findViewById(R.id.gouthamCheckBox3);
        checkBox3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (((CheckBox) v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.Address3) + " - " + getResources().getString(R.string.apartmentPrice3));
            }
        });

        CheckBox checkBox4 = (CheckBox) findViewById(R.id.gouthamCheckBox4);
        checkBox4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (((CheckBox) v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.Address4) + " - " + getResources().getString(R.string.apartmentPrice4));
            }
        });

        CheckBox checkBox5 = (CheckBox) findViewById(R.id.gouthamCheckBox5);
        checkBox5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (((CheckBox) v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.Address5) + " - " + getResources().getString(R.string.apartmentPrice5));
            }
        });

        Button nextButton = findViewById(R.id.Next);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GouthamApartmentActivity.this, GouthamCheckoutActivity.class);
                intent.putExtra("selectedApt", checkedOptions);
                startActivity(intent);
            }
        });
    }
}
