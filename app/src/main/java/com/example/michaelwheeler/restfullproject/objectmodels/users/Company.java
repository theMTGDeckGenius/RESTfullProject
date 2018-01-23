
package com.example.michaelwheeler.restfullproject.objectmodels.users;

import android.os.Parcel;
import android.os.Parcelable;

public class Company implements Parcelable {

    public final String NAME = "name";
    public final String BS = "bs";
    public final String CATCH_PHRASE = "catchPhrase";
    private String name;
    private String catchPhrase;
    private String bs;
    public final static Parcelable.Creator<Company> CREATOR = new Creator<Company>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Company createFromParcel(Parcel in) {
            return new Company(in);
        }

        public Company[] newArray(int size) {
            return (new Company[size]);
        }

    };

    protected Company(Parcel in) {
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.catchPhrase = ((String) in.readValue((String.class.getClassLoader())));
        this.bs = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     */
    public Company() {
    }

    /**
     * @param catchPhrase
     * @param name
     * @param bs
     */
    public Company(String name, String catchPhrase, String bs) {
        super();
        this.name = name;
        this.catchPhrase = catchPhrase;
        this.bs = bs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company withName(String name) {
        this.name = name;
        return this;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public Company withCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
        return this;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    public Company withBs(String bs) {
        this.bs = bs;
        return this;
    }


    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(name);
        dest.writeValue(catchPhrase);
        dest.writeValue(bs);
    }

    public int describeContents() {
        return 0;
    }

}
