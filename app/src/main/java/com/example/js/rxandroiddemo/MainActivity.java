package com.example.js.rxandroiddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import rx.Observable;
import rx.functions.Action1;

public class MainActivity extends AppCompatActivity {

    private static final String Tag = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] names = {"John", "Marry", "Tom"};
        Observable.from(names)
                .subscribe(new Action1<String>() {

                    @Override
                    public void call(String s) {
                        Log.d(Tag, s);
                    }
                });
    }
}
