package com.elmunats.crudmaximo.utils;
import android.content.Context;
import android.content.SharedPreferences;

import com.elmunats.crudmaximo.base.BaseParam;

/**
 * Created by Muhammad Natsir on 05,March,2019
 * Jakarta, Indonesia.
 */
public class PrefManager {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Context context;

    int PRIVATE_MODE = 0;

    private static final String FIRST_LAUNCH = "firstLaunch";
    private static final String PREFERENCE_NAME = BaseParam.THIS_ID;

    public PrefManager(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(PREFERENCE_NAME, PRIVATE_MODE);
        editor = sharedPreferences.edit();
    }

    public void setFirstTimeLaunch(int isFirstTime) {
        editor.putInt(FIRST_LAUNCH, isFirstTime);
        editor.commit();
    }

    public int isFirstLaunch() {
        return sharedPreferences.getInt(FIRST_LAUNCH, 1);
    }
}
