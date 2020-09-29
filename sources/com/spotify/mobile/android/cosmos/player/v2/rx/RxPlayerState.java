package com.spotify.mobile.android.cosmos.player.v2.rx;

import com.google.common.collect.Lists;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RxPlayerState {
    private final Map<ho<Integer, Integer>, PlayerState> mLatestPlayerStates = new ConcurrentHashMap();
    private final Map<ho<Integer, Integer>, ShutdownableObservable> mObservables = new HashMap();
    private final PlayerStateResolver mPlayerStateResolver;

    static class ShutdownableObservable {
        public final Observable<PlayerState> observable;
        public final wlc<List<vie>> shutdown;

        ShutdownableObservable(Observable<PlayerState> observable2, wlc<List<vie>> wlc) {
            this.observable = observable2;
            this.shutdown = wlc;
        }
    }

    public RxPlayerState(PlayerStateResolver playerStateResolver) {
        this.mPlayerStateResolver = playerStateResolver;
    }

    public Observable<PlayerState> getPlayerState() {
        return getPlayerState(2, 2);
    }

    public Observable<PlayerState> getPlayerState(int i, int i2) {
        return getCachedObservableByKey(i, i2);
    }

    public synchronized List<vie> unsubscribeAndReturnLeaks() {
        ArrayList a;
        a = Lists.a();
        for (ShutdownableObservable shutdownableObservable : this.mObservables.values()) {
            a.addAll((Collection) shutdownableObservable.shutdown.get());
        }
        return a;
    }

    /* access modifiers changed from: 0000 */
    public PlayerState getMostRecentPlayerState() {
        Map<ho<Integer, Integer>, PlayerState> map = this.mLatestPlayerStates;
        Integer valueOf = Integer.valueOf(2);
        return (PlayerState) map.get(ho.a(valueOf, valueOf));
    }

    private synchronized Observable<PlayerState> getCachedObservableByKey(int i, int i2) {
        ShutdownableObservable shutdownableObservable;
        ho a = ho.a(Integer.valueOf(i), Integer.valueOf(i2));
        ShutdownableObservable shutdownableObservable2 = (ShutdownableObservable) this.mObservables.get(a);
        if (shutdownableObservable2 == null) {
            vhz vhz = new vhz(RxPlayerState.class.getSimpleName(), createAndCacheObservablePlayerState(i, i2).a(1).a());
            Observable a2 = Observable.a((ObservableOnSubscribe<T>) vhz);
            vhz.getClass();
            shutdownableObservable = new ShutdownableObservable(a2, new wlc() {
                public final Object get() {
                    return vhz.this.a();
                }
            });
            this.mObservables.put(a, shutdownableObservable);
        } else {
            shutdownableObservable = shutdownableObservable2;
        }
        return shutdownableObservable.observable;
    }

    private Observable<PlayerState> createAndCacheObservablePlayerState(int i, int i2) {
        return this.mPlayerStateResolver.createPlayerStateObservable(Request.SUB, i, i2).b(cachePlayerStateAction(i, i2));
    }

    private Consumer<PlayerState> cachePlayerStateAction(int i, int i2) {
        return new Consumer(ho.a(Integer.valueOf(i), Integer.valueOf(i2))) {
            private final /* synthetic */ ho f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                RxPlayerState.this.lambda$cachePlayerStateAction$0$RxPlayerState(this.f$1, (PlayerState) obj);
            }
        };
    }

    public /* synthetic */ void lambda$cachePlayerStateAction$0$RxPlayerState(ho hoVar, PlayerState playerState) {
        this.mLatestPlayerStates.put(hoVar, playerState);
    }
}
