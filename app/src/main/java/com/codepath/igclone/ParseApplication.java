package com.codepath.igclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("4EZEiHfGm2DyelN3jIktAeiXjEzkGdAIRBRFtyuh")
                .clientKey("ayNQ5Tm8bRkCh1H9LALChnYZygU1gkDt5XUeRnhs")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
