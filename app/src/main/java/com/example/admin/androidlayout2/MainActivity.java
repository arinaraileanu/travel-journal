package com.example.admin.androidlayout2;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showDatePickerDialog(View v) {
        Button button = (Button) findViewById(v.getId());
        DialogFragment newFragment = new DatePickerFragment();
        ((DatePickerFragment) newFragment).setButton(button);
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }
}
