package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMenuActivity = findViewById(R.id.btn_menu_activity);
        btnMenuActivity.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);

        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        if (searchManager != null) {
            SearchView searchView = (SearchView) (menu.findItem(R.id.search)).getActionView();
            searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
            searchView.setQueryHint(getResources().getString(R.string.search_hint));
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    Toast.makeText(MainActivity.this, query, Toast.LENGTH_SHORT).show();
                    searchView.clearFocus();
                    return true;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    return false;
                }
            });
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu1){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, new TautanpanggilanFragment())
                    .addToBackStack(null)
                    .commit();
        } else if (item.getItemId() == R.id.menu2) {
            Intent a = new Intent(this, GrupBaruActivity.class);
            startActivity(a);
            return true;
        } else if (item.getItemId() == R.id.menu3) {
            Intent b = new Intent(this, SiaranActivity.class);
            startActivity(b);
            return true;
        } else if (item.getItemId() == R.id.menu4) {
            Intent c = new Intent(this, PerangkatTertautActivity.class);
            startActivity(c);
            return true;
        } else if (item.getItemId() == R.id.menu5) {
            Intent d = new Intent(this, PesanBerbintangActivity.class);
            startActivity(d);
            return true;
        }
        else if (item.getItemId() == R.id.menu6) {
            Intent e = new Intent(this, SetelanActivity.class);
            startActivity(e);
            return true;
        }
        return false;
    }

    @Override
    public void onClick(View view){
        if (view.getId() == R.id.btn_menu_activity){
            Intent moveIntent = new Intent(MainActivity.this, MenuActivity.class);
            startActivity(moveIntent);
        }
    }
}