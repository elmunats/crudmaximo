package com.elmunats.crudmaximo.base;

import android.app.Application;
import android.content.Context;

import org.jetbrains.annotations.NotNull;

import com.elmunats.crudmaximo.BuildConfig;

import io.objectbox.BoxStore;
import io.objectbox.android.AndroidObjectBrowser;
import timber.log.Timber;

/**
 * Created by Reja on 19,January,2019
 * Jakarta, Indonesia.
 */
public class BaseApplication extends Application {
    private static BaseApplication baseApplication;
    private static Context context;

    private BoxStore boxStore;

    /**
     * Base Application Configuration
     */
    @Override
    public void onCreate() {
        super.onCreate();
        baseApplication = this;
        context = getApplicationContext();
        boxStore = MyObjectBox.builder().androidContext(this).build();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree() {
                @Override
                protected String createStackElementTag(@NotNull StackTraceElement element) {
                    return super.createStackElementTag(element) + " >> " + element.getLineNumber();
                }
            });
            Timber.d("Started..: %s ObjectBox version: %s", true, BoxStore.getVersion() + " (" + BoxStore.getVersionNative() + ")");

            boolean started = new AndroidObjectBrowser(boxStore).start(this);
            Timber.d("ObjectBox browser: %s ,box store: %s", started, boxStore);
        } else {
            Timber.plant(new BaseLogger());
        }
    }

    public static BaseApplication getBaseApplication() {
        return baseApplication;
    }

    public static void setBaseApplication(BaseApplication baseApplication) {
        BaseApplication.baseApplication = baseApplication;
    }

    public static Context getContext() {
        return context;
    }

    public static void setContext(Context context) {
        BaseApplication.context = context;
    }

    public BoxStore getBoxStore() {
        return boxStore;
    }

    public void setBoxStore(BoxStore boxStore) {
        this.boxStore = boxStore;
    }

}
