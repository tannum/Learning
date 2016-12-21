package com.bjl.tannum.learning;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener , MyAlertDialog.OnDialogDismissListener {


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
                MyAlertDialog.show(this, R.string.android_is_great, this);
                break;
        }
    }

    @Override
    public void onDismiss() {
        Toast.makeText(this, R.string.dialog_closed, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        Log.d("debug","on create menu");

        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;

    }
}
