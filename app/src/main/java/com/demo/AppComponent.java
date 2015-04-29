package com.demo;

import com.demo.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(App app);
    void inject(MainActivity app);
}
