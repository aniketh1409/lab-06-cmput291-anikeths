package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable {
    private String city;
    private String province;

    /**
     * This constructs a City object with the given city name and province name.
     * @param city the name of the city
     * @param province the name of the province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    /**
     * This returns the name of the city.
     * @return city name
     */
    String getCityName(){
        return this.city;
    }
    /**
     * This returns the name of the province.
     * @return province name
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * Compares this city with another city by their city names.
     * @param o the object to compare with (must be a City)
     * @return a negative integer, zero, or a positive integer as this city's
     *         name is less than, equal to, or greater than the specified city's name.
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

    /**
     * This checks if two City objects are equal based on city and province names.
     * @param o the object to compare with
     * @return true if both cities have the same name and province
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City c = (City) o;
        return this.city.equals(c.city) && this.province.equals(c.province);
    }

    /**
     * This returns a hash code for the City object.
     * @return the hash code based on city and province
     */
    @Override
    public int hashCode() {
        return city.hashCode() + province.hashCode();
    }
}


