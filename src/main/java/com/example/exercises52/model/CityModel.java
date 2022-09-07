package com.example.exercises52.model;

public class CityModel {

    public CityModel(){

    }
    private String cityName;
    private int cityPopulation;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityPopulation() {
        return cityPopulation;
    }

    public void setCityPopulation(int cityPopulation) {
        this.cityPopulation = cityPopulation;
    }

    public CityModel(String cityName, int cityPopulation) {
        this.cityName = cityName;
        this.cityPopulation = cityPopulation;
    }

    @Override
    public String toString() {
        return "CityModel{" +
                "cityName='" + cityName + '\'' +
                ", cityPopulation='" + cityPopulation + '\'' +
                '}';
    }
}
