package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsViewScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_view_screen);

        // To show back-arrow along with wiring this child to its parent-activity in AndroidManifest.xml
        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }

        int selectedElementId = getIntent().getExtras().getInt("selectedElementId");
        InMemoryDataSource inMemoryDataSource = new InMemoryDataSource();
        Country country = inMemoryDataSource.transform(selectedElementId);
        String formattedCountryDetails = formatCountryDetailsView(country);

        TextView detailsOfCountryTextView = (TextView) findViewById(R.id.details_of_country);
        detailsOfCountryTextView.setText(formattedCountryDetails);
    }

    private String formatCountryDetailsView(Country country) {

        String formattedText = country.getName() + " located in " + country.getContinent() +
                " that speaks " + country.getLanguage() + ". It's capital is " + country.getCapital() +
                " and currency is " + country.getCurrency() + ".";
        return formattedText;
    }

}
