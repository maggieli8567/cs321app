package com.example.mag.cs321app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import com.firebase.client.Firebase;


public class MainActivity extends AppCompatActivity {

    private EditText mValueField;
    private Button mAddBtn;

    // add reference to Firebase
    private Firebase mRootRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create an object
        mRootRef = new Firebase("https://cs321app.firebaseio.com/Users");

        mValueField = (EditText) findViewById(R.id.valueField);
        mAddBtn = (Button) findViewById(R.id.addBtn);

        mAddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = mValueField.getText().toString();

                Firebase childRef = mRootRef.child("Name");

                childRef.setValue(value);
            }
        });


    }
}
