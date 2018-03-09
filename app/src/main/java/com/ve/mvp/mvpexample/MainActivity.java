package com.ve.mvp.mvpexample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MainContract.MainView {

    Toast mToast;
    MainContract.MainPresenter mainPresenter;
    EditText mEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initToast();
        mainPresenter = new MainPresenter(this);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPresenter.setValue(mEditText.getText().toString().trim());
            }
        });

        findViewById(R.id.show).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPresenter.show();
            }
        });

    }

    private void initToast() {
        mToast = Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT);
        mEditText = (EditText) findViewById(R.id.edittext);
    }

    @Override
    public void displayToast(String val) {

        mToast.setText(val);
        mToast.show();
    }
}
