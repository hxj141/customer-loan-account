/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerloanaccount;

/**
 *
 * @author thonkpad
 */
public class Address {
    private String street;
    private String city;
    private String state;
    private String zipcode;

    public Address(String street, String city, String state, String zipcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipcode() {
        return zipcode;
    }
    
    public String toString() {
       String addressInfo = String.format("Property Address: %n\t%s%n\t%s, %s %s%n", this.getStreet(), this.getCity(), this.getState(), this.getZipcode());
       return addressInfo;
   }
}
