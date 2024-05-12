package com.example;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDataSource {

    private List<Country> rawData;

    public InMemoryDataSource() {
        fillData();
    }

    public void fillData() {

        rawData = new ArrayList<Country>();

        Country saudiArabia = new Country();
        saudiArabia.setId(1);
        saudiArabia.setName("Saudi arabia");
        saudiArabia.setLanguage("Arabic");
        saudiArabia.setContinent("Asia");
        saudiArabia.setCapital("Riyadh");
        saudiArabia.setCurrency("SAR");

        Country unitedKingdom = new Country();
        unitedKingdom.setId(2);
        unitedKingdom.setName("United kingdom");
        unitedKingdom.setLanguage("English");
        unitedKingdom.setContinent("Europe");
        unitedKingdom.setCapital("London");
        unitedKingdom.setCurrency("GBP");

        Country australia = new Country();
        australia.setId(3);
        australia.setName("Australia");
        australia.setLanguage("English");
        australia.setContinent("Australia");
        australia.setCapital("Canberra");
        australia.setCurrency("AUD");

        Country russia = new Country();
        russia.setId(4);
        russia.setName("Russia");
        russia.setLanguage("Russian");
        russia.setContinent("Asia");
        russia.setCapital("Moscow");
        russia.setCurrency("RUB");

        Country unitedStates = new Country();
        unitedStates.setId(5);
        unitedStates.setName("United states");
        unitedStates.setLanguage("English");
        unitedStates.setContinent("North America");
        unitedStates.setCapital("Washington");
        unitedStates.setCurrency("USD");

        Country france = new Country();
        france.setId(6);
        france.setName("France");
        france.setLanguage("French");
        france.setContinent("Europe");
        france.setCapital("Paris");
        france.setCurrency("EUR");

        rawData.add(saudiArabia);
        rawData.add(unitedKingdom);
        rawData.add(australia);
        rawData.add(russia);
        rawData.add(unitedStates);
        rawData.add(france);
    }

    public List<BriefViewOfCountry> getBriefViewOfData() {

        List<BriefViewOfCountry> data = new ArrayList<BriefViewOfCountry>();
        for (int cursor = 0; cursor < rawData.size(); cursor++) {
            BriefViewOfCountry briefViewOfCountry = new BriefViewOfCountry();
            briefViewOfCountry.setId(rawData.get(cursor).getId());
            briefViewOfCountry.setName(rawData.get(cursor).getName());
            data.add(briefViewOfCountry);
        }

        return data;
    }

    public List<Country> getDetailedViewOfData() {
        return rawData;
    }

}
