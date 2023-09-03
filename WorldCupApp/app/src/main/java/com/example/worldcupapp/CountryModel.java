package com.example.worldcupapp;

public class CountryModel {
    private int flag_img;
    private String country_name, cup_win_count;

    public CountryModel(int flag_img, String country_name, String cup_win_count) {
        this.flag_img = flag_img;
        this.country_name = country_name;
        this.cup_win_count = cup_win_count;
    }

    public int getFlag_img() {
        return flag_img;
    }

    public String getCountry_name() {
        return country_name;
    }

    public String getCup_win_count() {
        return cup_win_count;
    }
}
