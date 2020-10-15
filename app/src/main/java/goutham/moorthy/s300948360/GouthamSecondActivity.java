package goutham.moorthy.s300948360;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;

import java.net.Inet4Address;


public class GouthamSecondActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goutham_second);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.gouthammenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;

        switch (item.getItemId()) {
            case R.id.GouthamApartment:
                intent = new Intent(this,GouthamApartmentActivity.class);
                startActivity(intent);
                return true;

            case R.id.GouthamDetached:
                intent = new Intent(this,GouthamDetachedActivity.class);
                startActivity(intent);
                return true;

            case R.id.GouthamSemi:
                intent = new Intent(this,GouthamSemiActivity.class);
                startActivity(intent);
                return true;

            case R.id.GouthamCondo:
                intent = new Intent(this,GouthamCondominiumActivity.class);
                startActivity(intent);
                return true;

            case R.id.GouthamTown:
                intent = new Intent(this,GouthamTownActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        return true;
        }
    }
