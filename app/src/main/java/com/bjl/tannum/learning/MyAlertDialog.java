package com.bjl.tannum.learning;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by tannum on 12/20/2016 AD.
 */

//public class MyAlertDialog implements View.OnClickListener ,DialogInterface.OnDismissListener{
public class MyAlertDialog {
    private Context context = null;
//    private Dialog dialog = null;
//    private Button buttonOk = null;
//    private TextView tvMessage = null;
    private OnDialogDismissListener dialogDismissListener = null;

    public MyAlertDialog(Context context) {

        this.context = context;
    }




    public static void show(Context context, int resourceId) {
        show(context, context.getString(resourceId), true, null);
    }

    public static void show(Context context, CharSequence message) {
        show(context, message, true, null);
    }
    public static void show(Context context, int resourceId
            , final OnDialogDismissListener listener) {
        show(context, context.getString(resourceId), true, listener);
    }

    public static void show(Context context, CharSequence message
            , OnDialogDismissListener listener) {
        show(context, message, true, listener);
    }

    public static void show(Context context, int resourceId
            , boolean cancelable) {
        show(context, context.getString(resourceId), cancelable, null);
    }

    public static void show(Context context, CharSequence message
            , boolean cancelable) {
        show(context, message, cancelable, null);
    }

    public static void show(Context context, int resourceId
            , boolean cancelable, OnDialogDismissListener listener) {
        show(context, context.getString(resourceId), cancelable, listener);
    }

    public static void show(Context context, CharSequence message, boolean cancelable, final OnDialogDismissListener listener){
        final Dialog dialog = new Dialog(context);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.layout_dialog);
        dialog.setCancelable(cancelable);
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialogInterface) {
                if(listener != null){
                    listener.onDismiss();
                }
            }
        });


        Button buttonOk = (Button) dialog.findViewById(R.id.button_ok);
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        TextView tvMessage = (TextView) dialog.findViewById(R.id.tv_message);
        tvMessage.setText(message);

        dialog.show();
    }

    public interface OnDialogDismissListener {
        public void onDismiss();
    }

}
