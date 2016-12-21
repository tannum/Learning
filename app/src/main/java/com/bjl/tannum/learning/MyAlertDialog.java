package com.bjl.tannum.learning;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by tannum on 12/20/2016 AD.
 */

public class MyAlertDialog implements View.OnClickListener{

    private Context context = null;
    private Dialog dialog = null;
    private Button buttonOk = null;
    private TextView tvMessage = null;

    public MyAlertDialog(Context context) {

        this.context = context;
        dialog = new Dialog(context);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.layout_dialog);
        dialog.setCancelable(false);

        buttonOk = (Button)dialog.findViewById(R.id.button_ok);
        buttonOk.setOnClickListener(this);

        tvMessage = (TextView)dialog.findViewById(R.id.tv_message);
    }


    public void setMessage(int resourceId){
        setMessage(context.getString(resourceId));
    }
    public void setMessage(CharSequence message){
        tvMessage.setText(message);
    }

    public void show(){

        dialog.show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_ok:
                dialog.dismiss();
                break;
        }
    }
}
