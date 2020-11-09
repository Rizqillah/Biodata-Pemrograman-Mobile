package com.example.postest5;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.opsi, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.praktikum){
            startActivity(new Intent(this, PraktikumActivity.class));
        } else if (item.getItemId() == R.id.biodata) {
            startActivity(new Intent(this, BioActivity.class));
        } else if (item.getItemId() == R.id.favorite) {
            startActivity(new Intent(this, FavActivity.class));
        }

        return true;
    }
}
