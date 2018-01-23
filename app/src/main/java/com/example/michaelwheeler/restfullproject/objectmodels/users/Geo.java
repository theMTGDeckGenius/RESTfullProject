
package com.example.michaelwheeler.restfullproject.objectmodels.users;

import android.os.Parcel;
import android.os.Parcelable;

public class Geo implements Parcelable {

    public final String LAT = "lat";
    public final String LNG = "lng";
    private String lat;
    private String lng;
    public final static Parcelable.Creator<Geo> CREATOR = new Creator<Geo>() {

        @SuppressWarnings({"unchecked"})
        public Geo createFromParcel(Parcel in) {
            return new Geo(in);
        }

        public Geo[] newArray(int size) {
            return (new Geo[size]);
        }

    };

    protected Geo(Parcel in) {
        this.lat = ((String) in.readValue((String.class.getClassLoader())));
        this.lng = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     */
    public Geo() {
    }

    /**
     * @param lng
     * @param lat
     */
    public Geo(String lat, String lng) {
        super();
        this.lat = lat;
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public Geo withLat(String lat) {
        this.lat = lat;
        return this;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public Geo withLng(String lng) {
        this.lng = lng;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(lat);
        dest.writeValue(lng);
    }

    public int describeContents() {
        return 0;
    }

}
