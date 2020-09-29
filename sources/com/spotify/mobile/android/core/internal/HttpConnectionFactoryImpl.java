package com.spotify.mobile.android.core.internal;

import com.spotify.core.http.HttpConnectionDelegate;
import com.spotify.core.http.HttpConnectionFactory;

public class HttpConnectionFactoryImpl implements HttpConnectionFactory {
    private final wmb mHttpClient;

    public HttpConnectionFactoryImpl(wmb wmb) {
        this.mHttpClient = wmb;
    }

    public HttpConnectionDelegate createDelegate() {
        return new HttpConnectionImpl(this.mHttpClient);
    }
}
