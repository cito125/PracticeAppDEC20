package com.example.andresarango.practicetestdec20.model;

import java.util.List;

/**
 * Created by andresarango on 12/20/16.
 */

public class HouseListings {
    List<House> houses;
    public List<House> getHouses() {
        return houses;
    }


    public static class House {
        String style;
        String price;
        String location;

        public String getStyle() {
            return style;
        }

        public String getPrice() {
            return price;
        }

        public String getLocation() {
            return location;
        }


    }
}
