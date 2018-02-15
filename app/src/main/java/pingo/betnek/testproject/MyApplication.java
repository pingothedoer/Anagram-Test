package pingo.betnek.testproject;

import android.app.Application;
import android.content.Context;

/**
 * Created by M. Ali Ansari
 * on 15/02/2018.
 */

public class MyApplication extends Application {


    /**
     * Get app context anywhere
     *
     * @return Application Context
     */
    public static Context getContext() {
        return getInstance().getApplicationContext();
    }


    private static MyApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }

    public static synchronized MyApplication getInstance() {
        return application;
    }


}
