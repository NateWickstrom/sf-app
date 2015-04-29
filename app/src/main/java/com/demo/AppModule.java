package com.demo;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public final class AppModule {

    private final Application app;

    public AppModule(Application application) {
        this.app = application;
    }

    @Provides @Singleton
    Application provideApplication() {
        return app;
    }

}
