package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        // Register your parse models
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("MugaxDN7RWHeemX8bpzP6GnnwEXdBYt7NQ8oQn6k")
                .clientKey("U6gRLJBRucExZZJju25H9lAQX5HduvokjMEALfVj")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
