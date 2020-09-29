package com.spotify.cosmos.router;

import io.reactivex.Observable;

public interface RxRouter {
    Observable<Response> resolve(Request request);
}
