
package com.example.michaelwheeler.restfullproject.objectmodels.users;

import android.os.Parcel;
import android.os.Parcelable;

public class Address implements Parcelable {

    public final String STREET = "street";
    public final String SUITE = "suite";
    public final String CITY = "city";
    public final String ZIPCODE = "zipcode";
    public final String GEO = "geo";
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;
    public final static Parcelable.Creator<Address> CREATOR = new Creator<Address>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Address createFromParcel(Parcel in) {
            return new Address(in);
        }

        public Address[] newArray(int size) {
            return (new Address[size]);
        }

    };

    protected Address(Parcel in) {
        this.street = ((String) in.readValue((String.class.getClassLoader())));
        this.suite = ((String) in.readValue((String.class.getClassLoader())));
        this.city = ((String) in.readValue((String.class.getClassLoader())));
        this.zipcode = ((String) in.readValue((String.class.getClassLoader())));
        this.geo = ((Geo) in.readValue((Geo.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     */
    public Address() {
    }

    /**
     * @param geo
     * @param zipcode
     * @param street
     * @param suite
     * @param city
     */
    public Address(String street, String suite, String city, String zipcode, Geo geo) {
        super();
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = geo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Address withStreet(String street) {
        this.street = street;
        return this;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public Address withSuite(String suite) {
        this.suite = suite;
        return this;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address withCity(String city) {
        this.city = city;
        return this;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Address withZipcode(String zipcode) {
        this.zipcode = zipcode;
        return this;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public Address withGeo(Geo geo) {
        this.geo = geo;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(street);
        dest.writeValue(suite);
        dest.writeValue(city);
        dest.writeValue(zipcode);
        dest.writeValue(geo);
    }

    public int describeContents() {
        return 0;
    }

}
