package com.bjl.tannum.learning;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button buttonAlert = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAlert = (Button)findViewById(R.id.button_alert);
        buttonAlert.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_alert:
                MyAlertDialog dialog = new MyAlertDialog(this);
                dialog.setMessage("Android is Great!");
                dialog.show();
                break;
        }
    }
}
