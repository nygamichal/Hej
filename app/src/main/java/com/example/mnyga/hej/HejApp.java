package com.example.mnyga.hej;

import android.app.Application;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by mnyga on 21.10.2017.
 */

public class HejApp extends Application {


    FirebaseDatabase database;
    public static DatabaseReference databaseReference;


    @Override
    public void onCreate() {
        super.onCreate();
        database = FirebaseDatabase.getInstance();
        databaseReference = database.getReference("user");
        //databaseReference.setValue("Test","Hello World");

    }
}
