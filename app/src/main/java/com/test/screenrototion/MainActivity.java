package com.test.screenrototion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getCanonicalName();
    private EditText editText;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Welcome "+editText.getText());
                button.setText("Logout");
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG , "onStart");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        textView.setText(savedInstanceState.getString("textview_text"));
        button.setText(savedInstanceState.getString("button_text"));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG , "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG , "onPause");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("textview_text",textView.getText().toString());
        outState.putString("button_text",button.getText().toString());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG , "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG , "onDestroy");
    }
}
