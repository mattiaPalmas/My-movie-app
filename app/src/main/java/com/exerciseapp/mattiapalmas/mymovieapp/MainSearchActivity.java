package com.exerciseapp.mattiapalmas.mymovieapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.Toast;

public class MainSearchActivity extends AppCompatActivity {

    private EditText editText;
    private EditText searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_search);

        searchButton = (EditText) findViewById(R.id.searchButton);
    }

    public void searchMovie(View view) {
        Intent intent = new Intent(this, ListMoviesActivity.class);
        intent.putExtra("searchText", searchButton.getText().toString());

        if (searchButton.getText().equals("")) {
            Toast.makeText(this, "Sorry you need to write something.", Toast.LENGTH_LONG).show();
        }
        else {
            startActivity(intent);
        }

    }
}
