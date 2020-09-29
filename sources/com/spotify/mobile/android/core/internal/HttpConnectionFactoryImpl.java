package com.spotify.mobile.android.core.internal;

import com.spotify.core.http.HttpConnectionDelegate;
import com.spotify.core.http.HttpConnectionFactory;

public class HttpConnectionFactoryImpl implements HttpConnectionFactory {
    private final xah mHttpClient;

    public HttpConnectionFactoryImpl(xah xah) {
        this.mHttpClient = xah;
    }

    public HttpConnectionDelegate createDelegate() {
        return new HttpConnectionImpl(this.mHttpClient);
    }
}
