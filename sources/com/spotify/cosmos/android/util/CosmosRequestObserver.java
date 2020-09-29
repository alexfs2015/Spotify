package com.spotify.cosmos.android.util;

import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;

public interface CosmosRequestObserver {
    public static final CosmosRequestObserver NO_OP = new CosmosRequestObserver() {
        public final void onError(String str, Throwable th) {
        }

        public final void onRequest(String str, Request request) {
        }

        public final void onResponse(String str, Response response) {
        }
    };

    void onError(String str, Throwable th);

    void onRequest(String str, Request request);

    void onResponse(String str, Response response);
}
