package com.spotify.mobile.android.cosmos.player.v2.queue;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.internal.AddToQueueParameters;
import com.spotify.mobile.android.cosmos.player.v2.internal.SetQueueParameters;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class RxQueueManager implements QueueManager {
    private static final String PLAYER_URI_ADD_TO_QUEUE = "sp://player/v2/main/add_to_queue";
    private static final String PLAYER_URI_QUEUE = "sp://player/v2/main/queue";
    private static final int TIMEOUT_5SECS = 5;
    /* access modifiers changed from: private */
    public final ObjectMapper mObjectMapper;
    private final PlayerQueueUtil mPlayerQueueUtil;
    private final gky<PlayerQueue> mRxPlayQueueResolver;
    private final RxResolver mRxResolver;

    public RxQueueManager(RxResolver rxResolver, gky<PlayerQueue> gky, ObjectMapper objectMapper, PlayerQueueUtil playerQueueUtil) {
        this.mRxResolver = rxResolver;
        this.mRxPlayQueueResolver = gky;
        this.mObjectMapper = objectMapper;
        this.mPlayerQueueUtil = playerQueueUtil;
    }

    public Observable<Response> setQueue(PlayerQueue playerQueue) {
        return setQueue(playerQueue, false);
    }

    public Observable<Response> setQueue(PlayerQueue playerQueue, boolean z) {
        return updateQueue(getQueueRequest(Request.PUT, PLAYER_URI_QUEUE, new SetQueueParameters(playerQueue, z)));
    }

    public Observable<Response> addToQueue(PlayerTrack playerTrack, boolean z) {
        return updateQueue(getQueueRequest(Request.POST, PLAYER_URI_ADD_TO_QUEUE, new AddToQueueParameters(playerTrack, z)));
    }

    public Observable<Response> addTracksToQueue(List<PlayerTrack> list) {
        if (list.size() == 1) {
            return addToQueue((PlayerTrack) list.get(0), false);
        }
        return getQueue().c(1).a((Function<? super T, ? extends ObservableSource<? extends R>>) new Function(list) {
            private final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return RxQueueManager.this.lambda$addTracksToQueue$0$RxQueueManager(this.f$1, (PlayerQueue) obj);
            }
        }, false);
    }

    public /* synthetic */ ObservableSource lambda$addTracksToQueue$0$RxQueueManager(List list, PlayerQueue playerQueue) {
        return setQueue(this.mPlayerQueueUtil.addNextTracks(playerQueue, list));
    }

    public Observable<PlayerQueue> getQueue() {
        return vun.b(this.mRxPlayQueueResolver.resolve(new Request(Request.SUB, PLAYER_URI_QUEUE)));
    }

    public /* synthetic */ ObservableSource lambda$updateQueue$1$RxQueueManager(Request request) {
        return this.mRxResolver.resolve(request);
    }

    /* access modifiers changed from: 0000 */
    public Observable<Response> updateQueue(Observable<Request> observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new Function() {
            public final Object apply(Object obj) {
                return RxQueueManager.this.lambda$updateQueue$1$RxQueueManager((Request) obj);
            }
        }, false).a(0).d().a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$RxQueueManager$HaICrvl_5cdgGQj6GO6mJhjYrI.INSTANCE, false).c(5, TimeUnit.SECONDS);
    }

    static /* synthetic */ ObservableSource lambda$updateQueue$2(Response response) {
        if (response.getStatus() >= 200 && response.getStatus() <= 299) {
            return Observable.b(response);
        }
        StringBuilder sb = new StringBuilder("Queue not updated. Status code: ");
        sb.append(response.getStatus());
        return Observable.a((Throwable) new RuntimeException(sb.toString()));
    }

    private Observable<Request> getQueueRequest(final String str, final String str2, final Object obj) {
        return Observable.b((Callable<? extends T>) new Callable<Request>() {
            public Request call() {
                return new Request(str, str2, null, RxQueueManager.this.mObjectMapper.writeValueAsBytes(obj));
            }
        });
    }
}
