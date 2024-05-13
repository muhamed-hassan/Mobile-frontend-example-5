package com.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InMemoryDataSource inMemoryDataSource = new InMemoryDataSource();
        List<BriefViewOfCountry> countries = inMemoryDataSource.getBriefViewOfData();
        ListView listView = (ListView) findViewById(R.id.countries_list_view);
        ArrayAdapter<BriefViewOfCountry> arrayAdapter = new ArrayAdapter<BriefViewOfCountry>(this, android.R.layout.simple_list_item_1, countries);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                BriefViewOfCountry selectedElement = (BriefViewOfCountry) parent.getItemAtPosition(position);
                goToBriefViewOfCountry(selectedElement.getId());
            }
        });
    }

    private void goToBriefViewOfCountry(int selectedElementId) {

        Intent intentOfDetailsViewScreen = new Intent(this, DetailsViewScreen.class);
        intentOfDetailsViewScreen.putExtra("selectedElementId", selectedElementId);
        startActivity(intentOfDetailsViewScreen);
    }

}
