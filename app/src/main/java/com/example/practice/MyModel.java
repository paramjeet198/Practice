package com.example.practice;

import java.util.ArrayList;

public class MyModel {
    public String name;
    public ArrayList<String> domains;
    public String country;
    public String alpha_two_code;
    public ArrayList<String> web_pages;
    public Object state_province;


    public MyModel(String name, ArrayList<String> domains, String country, String alpha_two_code, ArrayList<String> web_pages, Object state_province) {
        this.name = name;
        this.domains = domains;
        this.country = country;
        this.alpha_two_code = alpha_two_code;
        this.web_pages = web_pages;
        this.state_province = state_province;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getDomains() {
        return domains;
    }

    public void setDomains(ArrayList<String> domains) {
        this.domains = domains;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAlpha_two_code() {
        return alpha_two_code;
    }

    public void setAlpha_two_code(String alpha_two_code) {
        this.alpha_two_code = alpha_two_code;
    }

    public ArrayList<String> getWeb_pages() {
        return web_pages;
    }

    public void setWeb_pages(ArrayList<String> web_pages) {
        this.web_pages = web_pages;
    }

    public Object getState_province() {
        return state_province;
    }

    public void setState_province(Object state_province) {
        this.state_province = state_province;
    }


    @Override
    public String toString() {
        return "MyModel{" +
                "name='" + name + '\'' +
                ", domains=" + domains +
                ", country='" + country + '\'' +
                ", alpha_two_code='" + alpha_two_code + '\'' +
                ", web_pages=" + web_pages +
                ", state_province=" + state_province +
                '}';
    }
}
