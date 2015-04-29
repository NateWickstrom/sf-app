package com.demo;

import android.app.Application;
import android.content.Context;

import timber.log.Timber;


public class App extends Application {

    private AppComponent component;

    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        } else {
            // TODO Crashlytics.start(this);
            // TODO Timber.plant(new CrashlyticsTree());
        }

        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .appModule(new AppModule(this))
                .build();
    }

    public static AppComponent getComponent(Context context) {
        return ((App) context.getApplicationContext()).component;
    }
}