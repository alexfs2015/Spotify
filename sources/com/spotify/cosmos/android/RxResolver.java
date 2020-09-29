package com.spotify.cosmos.android;

import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import java.util.List;

public interface RxResolver {
    Observable<Response> resolve(Request request);

    Observable<Response> resolve(Request request, Scheduler scheduler);

    Completable resolveCompletable(Request request);

    Completable resolveCompletable(Request request, Scheduler scheduler);

    List<vie> unsubscribeAndReturnLeaks();
}
