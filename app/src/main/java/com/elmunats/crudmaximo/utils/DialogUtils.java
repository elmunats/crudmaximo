package com.elmunats.crudmaximo.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import timber.log.Timber;

/**
 * Created by Muhammad Sulistiyo on 25,February,2019
 * Jakarta, Indonesia.
 */
public class DialogUtils {

    public interface DialogUtilsListener{
        void onPositiveButton();
        void onNegativeButton();
    }

    private Context context;
    private int title;
    private int message;
    private Integer positiveButtonLabel;
    private Integer negativeButtonLabel;
    private DialogUtilsListener listener;
    private boolean positiveButton;
    private boolean negativeButton;
    private boolean canceable;
    private AlertDialog.Builder builder;

    public DialogUtils(Context context){
        this.context = context;
        if(builder == null){
            builder = new AlertDialog.Builder(context);
        }
    }

    public void show(){
        Timber.d("DialogUtils.show()");
        builder.show();
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public int getTitle() {
        return title;
    }

    public DialogUtils setTitle(int title) {
        this.title = title;
        builder.setTitle(title);
        return this;
    }

    public int getMessage() {
        return message;
    }

    public DialogUtils setMessage(int message) {
        this.message = message;
        builder.setMessage(message);
        return this;
    }

    public int getPositiveButtonLabel() {
        return positiveButtonLabel;
    }

    public DialogUtils setPositiveButtonLabel(Integer positiveButtonLabel) {
        this.positiveButtonLabel = positiveButtonLabel;

        if(positiveButtonLabel == null){
            builder.setPositiveButton(null, null);
            positiveButton = false;
        }else{
            builder.setPositiveButton(positiveButtonLabel, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    if(positiveButton && listener != null){
                        listener.onPositiveButton();
                    };
                }
            });
            positiveButton = true;
        }

        return this;
    }

    public int getNegativeButtonLabel() {
        return negativeButtonLabel;
    }

    public DialogUtils setNegativeButtonLabel(Integer negativeButtonLabel) {
        this.negativeButtonLabel = negativeButtonLabel;

        if(negativeButtonLabel == null){
            builder.setNegativeButton(null, null);
            negativeButton = false;
        }else{
            builder.setNegativeButton(negativeButtonLabel, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    if(negativeButton && listener != null){
                        listener.onNegativeButton();
                    };
                }
            });
            negativeButton = true;
        }

        return this;
    }

    public DialogUtilsListener getListener() {
        return listener;
    }

    public DialogUtils setListener(DialogUtilsListener listener) {
        this.listener = listener;
        return this;
    }

    public boolean isPositiveButton() {
        return positiveButton;
    }

    public boolean isNegativeButton() {
        return negativeButton;
    }

    public boolean isCanceable() {
        return canceable;
    }

    public DialogUtils setCanceable(boolean canceable) {
        this.canceable = canceable;
        builder.setCancelable(false);
        return this;
    }

    public AlertDialog.Builder getBuilder() {
        return builder;
    }
}
