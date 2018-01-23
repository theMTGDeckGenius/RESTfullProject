
package com.example.michaelwheeler.restfullproject.objectmodels;

import android.os.Parcel;
import android.os.Parcelable;

public class Album implements Parcelable {

    public final String USERR_ID = "userId";
    public final String ID = "id";
    public final String TITLE = "title";
    private int userId;
    private int id;
    private String title;
    public final static Parcelable.Creator<Album> CREATOR = new Creator<Album>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Album createFromParcel(Parcel in) {
            return new Album(in);
        }

        public Album[] newArray(int size) {
            return (new Album[size]);
        }

    };

    protected Album(Parcel in) {
        this.userId = ((int) in.readValue((int.class.getClassLoader())));
        this.id = ((int) in.readValue((int.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     */
    public Album() {
    }

    /**
     * @param id
     * @param title
     * @param userId
     */
    public Album(int userId, int id, String title) {
        super();
        this.userId = userId;
        this.id = id;
        this.title = title;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Album withUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Album withId(int id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Album withTitle(String title) {
        this.title = title;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(userId);
        dest.writeValue(id);
        dest.writeValue(title);
    }

    public int describeContents() {
        return 0;
    }

}
