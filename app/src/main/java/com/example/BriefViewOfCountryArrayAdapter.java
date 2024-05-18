package com.example;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class BriefViewOfCountryArrayAdapter extends ArrayAdapter<BriefViewOfCountry> {

    private List<BriefViewOfCountry> countries;

    public BriefViewOfCountryArrayAdapter(Context context, int resource, List<BriefViewOfCountry> objects) {
        super(context, resource, objects);
        countries = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                                        .inflate(R.layout.list_item_of_country, parent, false);
        }

        BriefViewOfCountry briefViewOfCountry = countries.get(position);
        TextView countryName = (TextView) convertView.findViewById(R.id.country_name);
        countryName.setText(briefViewOfCountry.getName());

        return convertView;
    }

}
