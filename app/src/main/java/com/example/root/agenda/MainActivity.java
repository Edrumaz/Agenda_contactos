package com.example.root.agenda;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Contact> lstContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        lstContact = new ArrayList<>();
        lstContact.add(new Contact("Juan", "7584-2323", "Normal", R.drawable.user_painted64));
        lstContact.add(new Contact("Elena", "7541-2110", "Normal", R.drawable.user_painted_black64));
        lstContact.add(new Contact("Maria", "7504-2000", "Normal", R.drawable.user_painted_white64_1));
        lstContact.add(new Contact("Edgardo", "2048-2048", "Normal", R.drawable.user_painted_white64_1));
        lstContact.add(new Contact("Alfonso", "9514-3214", "Normal", R.drawable.user_painted_black64));
        lstContact.add(new Contact("Erick", "5412-3652", "Normal", R.drawable.user_painted_white64_1));
        lstContact.add(new Contact("Andrea", "5874-2563", "Normal", R.drawable.user_painted_black64));
        lstContact.add(new Contact("Daniela", "2013-2365", "Normal", R.drawable.user_black));
        lstContact.add(new Contact("Juan", "7584-2323", "Normal", R.drawable.user_painted64));
        lstContact.add(new Contact("Elena", "7541-2110", "Normal", R.drawable.user_painted_black64));
        lstContact.add(new Contact("Maria", "7504-2000", "Normal", R.drawable.user_painted_white64_1));
        lstContact.add(new Contact("Edgardo", "2048-2048", "Normal", R.drawable.user_painted_white64_1));
        lstContact.add(new Contact("Alfonso", "9514-3214", "Normal", R.drawable.user_painted_black64));
        lstContact.add(new Contact("Erick", "5412-3652", "Normal", R.drawable.user_painted_white64_1));
        lstContact.add(new Contact("Andrea", "5874-2563", "Normal", R.drawable.user_painted_black64));
        lstContact.add(new Contact("Daniela", "2013-2365", "Normal", R.drawable.user_black));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.id_recyclerView);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, lstContact);
        myrv.setLayoutManager(new GridLayoutManager(this, 3));
        myrv.setAdapter(myAdapter);

     /*  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
