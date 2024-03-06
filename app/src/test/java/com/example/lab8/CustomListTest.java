package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus one
     */
    @Test
    public void addCityTest() {
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }

    @Test
    public void hasCityTest() {
        list = MockCityList();
        City edmontonCity = new City("Edmonton", "Alberta");
        assertFalse(list.hasCity(edmontonCity));
    }

    @Test
    public void deleteCityTest() {
        list = MockCityList();
        City edmontonCity = new City("Edmonton", "Alberta");
        list.addCity(edmontonCity);
        assertEquals(list.getCount(), 1);
        list.deleteCity(edmontonCity);
        assertEquals(list.getCount(), 0);
    }

    @Test
    public void countCitiesTest() {
        list = MockCityList();
        City edmontonCity = new City("Edmonton", "Alberta");
        City torontoCity = new City("Toronto", "Ontario");
        list.addCity(edmontonCity);
        list.addCity(torontoCity);
        assertEquals(list.countCities(), 2);
    }


}
