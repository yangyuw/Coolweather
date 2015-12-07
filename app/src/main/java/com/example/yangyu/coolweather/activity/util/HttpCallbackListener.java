package com.example.yangyu.coolweather.activity.util;

/**
 * Created by yangyu on 15/12/8.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
