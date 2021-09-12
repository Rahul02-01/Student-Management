package com.rahuljdbc;

class details
{
    // Variables declaration
    private int id;
    private String name,city,ph_num;

    // Getters and Setters for the variables
    public String getPh_num() {
        return ph_num;
    }

    public void setPh_num(String ph_num) {
        this.ph_num = ph_num;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // These are the constructors
    details(int id,String name,String city,String ph_num) {

        this.id = id;
        this.name = name;
        this.city = city;
        this.ph_num = ph_num;

    }
    details(String name,String city,String ph_num){

        this.name = name;
        this.city = city;
        this.ph_num = ph_num;

    }

    @Override
    public String toString() {
        return "details{" +
                "\nid=" + id +
                ", \nph_num=" + ph_num +
                ", \nname='" + name + '\'' +
                ", \ncity='" + city + '\'' +
                '}';
    }
}
