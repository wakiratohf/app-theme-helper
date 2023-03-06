package com.kabouzeid.appthemehelpersample;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.Toolbar;

import com.kabouzeid.appthemehelper.ATH;
import com.kabouzeid.appthemehelper.common.ATHToolbarActivity;

/**
 * @author Aidan Follestad (afollestad)
 */
public class MiscActivity extends ATHToolbarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_misc);
        ATH.setNavigationbarColorAuto(this);
        ATH.setStatusbarColorAuto(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_back);
        toolbar.setTitle(null);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        setSupportActionBar(toolbar);

        AppCompatSpinner spinner = (AppCompatSpinner) findViewById(R.id.toolbarSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_spinner,
                new String[]{"One", "Two", "Three", "Four", "Five", "Six"});
        adapter.setDropDownViewResource(R.layout.list_item_spinner_dropdown);
        spinner.setAdapter(adapter);
    }
}