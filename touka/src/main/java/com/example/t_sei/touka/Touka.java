package com.example.t_sei.touka;

import android.util.Log;

/**
 * Created by t-sei on 16/03/24.
 */
public class Touka {
    static String taishio() {
        if ( BuildConfig.DEBUG){
            Log.d("OSA", "hosomen saiko");
        }
        return "ochaduke mo aruyo";
    }
}
