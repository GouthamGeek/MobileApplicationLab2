package goutham.moorthy.s300948360;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class GouthamDetachedActivity extends AppCompatActivity {

    ArrayList<String> checkedOptions = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goutham_detached);

        //---CheckBox---
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.gouthamDetachedCheckBox1);
        checkBox1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.detachedAddress1) + " - " + getResources().getString(R.string.detachedPrice1));
            }
        });

        CheckBox checkBox2 = (CheckBox) findViewById(R.id.gouthamDetachedCheckBox2);
        checkBox2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.detachedAddress2) + " - " + getResources().getString(R.string.detachedPrice2));
            }
        });

        CheckBox checkBox3 = (CheckBox) findViewById(R.id.gouthamDetachCheckBox3);
        checkBox3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.detachedAddress3) + " - " + getResources().getString(R.string.detachedPrice3));
            }
        });

        CheckBox checkBox4 = (CheckBox) findViewById(R.id.gouthamDetachCheckBox4);
        checkBox4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.detachedAddress4) + " - " + getResources().getString(R.string.detachedPrice4));
            }
        });

        CheckBox checkBox5 = (CheckBox) findViewById(R.id.gouthamDetachCheckBox5);
        checkBox5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    checkedOptions.add(getResources().getString(R.string.detachedAddress5) + " - " + getResources().getString(R.string.detachedPrice5));
            }
        });

        Button nextButton = findViewById(R.id.gouthamDetachNextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GouthamDetachedActivity.this, GouthamCheckoutActivity.class);
                intent.putExtra("selectedApt", checkedOptions);
                startActivity(intent);
            }
        });
    }
}