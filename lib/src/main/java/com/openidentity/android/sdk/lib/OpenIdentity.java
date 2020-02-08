package com.openidentity.android.sdk.lib;

import android.content.Context;
import android.support.annotation.NonNull;

import java.net.URL;

public class OpenIdentity {
    private static OpenIdentity instance;

    @NonNull
    public static synchronized OpenIdentity getInstance(){
        if (null == instance) {
            synchronized (OpenIdentity.class) {
                if (null == instance) {
                    instance = new OpenIdentity();
                }
            }
        }
        return instance;
    }

    private OpenIdentity(){}

    @NonNull
    public OpenIdentity init (@NonNull Context context,
                              @NonNull String client_id,
                              @NonNull String discoveryEndpointUrl) {
        // Initialize whatever is required
        return instance;
    }
}
