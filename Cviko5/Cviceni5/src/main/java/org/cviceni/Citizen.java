package org.cviceni;
import java.io.Serializable;
public class Citizen implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name,surname,street,postcode,city;

    public Citizen(String[] arr) {
        System.out.println(arr.length);
        this.name = arr[0];
        this.surname = arr[1];
        this.street = arr[2];
        this.postcode = arr[3];
        this.city = arr[4];
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", street='" + street + '\'' +
                ", postcode='" + postcode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
