package com.spotify.cosmos.android;

import com.spotify.cosmos.router.Request;

public interface FireAndForgetResolver {
    void dispose();

    void reset();

    void resolve(Request request);

    void resolve(Request request, ResolverCallbackReceiver resolverCallbackReceiver);
}
