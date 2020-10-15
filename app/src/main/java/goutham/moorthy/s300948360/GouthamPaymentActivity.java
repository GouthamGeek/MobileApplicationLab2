package goutham.moorthy.s300948360;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.


    public class GouthamPaymentActivity extends AppCompatActivity {

        Button nextButton = findViewById(R.id.Next);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GouthamCheckoutActivity.this, GouthamPaymentActivity.class);
                intent.putExtra("selectedApt", checkedOptions);
                startActivity(intent);
            }
        });
    }

 */
