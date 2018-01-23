package com.example.michaelwheeler.restfullproject.restcalls;

import android.util.JsonReader;

import java.io.IOException;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;


/**
 * Created by Michael Wheeler on 1/22/2018.
 */

public class GetCalls {

    public enum endPoints{
        posts("posts"),
        comments("comments"),
        albums("albums"),
        photos("photos"),
        todos("todos"),
        users("users");

        private final String endPoint;

        endPoints(String fileName){
            this.endPoint = fileName;
        }
        public String getEndpoint(){
            return endPoint;
        }
    }

    /**
     * Stub method to visualize flow as real calls are crafted
     *
     * @throws IOException
     */
    public static void getInfo() throws IOException {
        // Create URL
        URL urlEndpoint = new URL("https://jsonplaceholder.typicode.com/");

        // Create connection
        HttpsURLConnection myConnection = (HttpsURLConnection) urlEndpoint.openConnection();
        myConnection.setRequestProperty("User-Agent", "my-rest-app-v0.1");
        myConnection.setRequestProperty("Accept", "application/vnd.github.v3+json");
        myConnection.setRequestProperty("Contact-Me", "hathibelagal@example.com");

        //Get is default
//        myConnection.setRequestMethod("GET");
        if (myConnection.getResponseCode() == 200) {
            // Success
            // Further processing here
        } else {
            // Error handling code goes here
        }

        InputStream responseBody = myConnection.getInputStream();
        InputStreamReader responseBodyReader = new InputStreamReader(responseBody, "UTF-8");
        JsonReader jsonReader = new JsonReader(responseBodyReader);

        jsonReader.beginObject(); // Start processing the JSON object
        while (jsonReader.hasNext()) { // Loop through all keys
            String key = jsonReader.nextName(); // Fetch the next key
            if (key.equals("organization_url")) { // Check if desired key
                // Fetch the value as a String
                String value = jsonReader.nextString();

                // Do something with the value
                // ...

                break; // Break out of the loop
            } else {
                jsonReader.skipValue(); // Skip values of other keys
            }
        }
        jsonReader.close();
        myConnection.disconnect();
    }


}
