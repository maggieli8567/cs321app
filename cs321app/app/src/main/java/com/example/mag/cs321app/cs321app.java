package com.example.mag.cs321app;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Mag on 4/17/17.
 */

public class cs321app extends Application {

    @Override
    public void onCreate()  {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
