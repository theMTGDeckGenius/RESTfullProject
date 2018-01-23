package com.example.michaelwheeler.restfullproject.objectmodels;

import android.os.Parcel;
import android.os.Parcelable;

public class Todo implements Parcelable {

    public final String USER_ID = "userId";
    public final String ID = "id";
    public final String TITLE = "title";
    public final String COMPLEATED = "completed";
    private int userId;
    private int id;
    private String title;
    private boolean completed;

    public final static Parcelable.Creator<Todo> CREATOR = new Creator<Todo>() {
        @SuppressWarnings({
                "unchecked"
        })
        public Todo createFromParcel(Parcel in) {
            return new Todo(in);
        }

        public Todo[] newArray(int size) {
            return (new Todo[size]);
        }

    };

    protected Todo(Parcel in) {
        this.userId = ((int) in.readValue((int.class.getClassLoader())));
        this.id = ((int) in.readValue((int.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.completed = ((boolean) in.readValue((boolean.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     */
    public Todo() {
    }

    /**
     * @param id
     * @param title
     * @param userId
     * @param completed
     */
    public Todo(int userId, int id, String title, boolean completed) {
        super();
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Todo withUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Todo withId(int id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Todo withTitle(String title) {
        this.title = title;
        return this;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Todo withCompleted(boolean completed) {
        this.completed = completed;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(userId);
        dest.writeValue(id);
        dest.writeValue(title);
        dest.writeValue(completed);
    }

    public int describeContents() {
        return 0;
    }

}
