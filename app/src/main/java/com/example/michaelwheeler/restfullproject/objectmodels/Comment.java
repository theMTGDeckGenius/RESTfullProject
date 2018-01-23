package com.example.michaelwheeler.restfullproject.objectmodels;

import android.os.Parcel;
import android.os.Parcelable;

public class Comment implements Parcelable {

    public final String POST_ID = "postId";
    public final String ID = "id";
    public final String NAME = "name";
    public final String EMAIL = "email";
    public final String BODY = "body";
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;
    public final static Parcelable.Creator<Comment> CREATOR = new Creator<Comment>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Comment createFromParcel(Parcel in) {
            return new Comment(in);
        }

        public Comment[] newArray(int size) {
            return (new Comment[size]);
        }

    };

    protected Comment(Parcel in) {
        this.postId = ((int) in.readValue((int.class.getClassLoader())));
        this.id = ((int) in.readValue((int.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.email = ((String) in.readValue((String.class.getClassLoader())));
        this.body = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     */
    public Comment() {
    }

    /**
     * @param id
     * @param body
     * @param email
     * @param name
     * @param postId
     */
    public Comment(int postId, int id, String name, String email, String body) {
        super();
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public Comment withPostId(int postId) {
        this.postId = postId;
        return this;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Comment withId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Comment withName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Comment withEmail(String email) {
        this.email = email;
        return this;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Comment withBody(String body) {
        this.body = body;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(postId);
        dest.writeValue(id);
        dest.writeValue(name);
        dest.writeValue(email);
        dest.writeValue(body);
    }

    public int describeContents() {
        return 0;
    }

}
