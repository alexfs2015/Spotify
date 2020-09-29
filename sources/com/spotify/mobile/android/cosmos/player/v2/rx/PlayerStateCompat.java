package com.spotify.mobile.android.cosmos.player.v2.rx;

import android.os.Looper;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;

public class PlayerStateCompat {
    private static final Consumer<Throwable> DEFAULT_ERROR_HANDLER = $$Lambda$PlayerStateCompat$dkWnESrV3JMoDtI4Z1HPXFSZ02I.INSTANCE;
    private final Scheduler mComputationScheduler;
    private final Map<PlayerStateObserver, Disposable> mPlayerStateObservers = new HashMap();
    private final RxPlayerState mRxPlayerState;

    public PlayerStateCompat(RxPlayerState rxPlayerState, Scheduler scheduler) {
        this.mRxPlayerState = rxPlayerState;
        this.mComputationScheduler = scheduler;
    }

    public void fetch(PlayerStateObserver playerStateObserver, int i, int i2) {
        Observable a = this.mRxPlayerState.getPlayerState(i, i2).c(1).a(callingThreadScheduler());
        playerStateObserver.getClass();
        a.a((Consumer<? super T>) new Consumer() {
            public final void accept(Object obj) {
                PlayerStateObserver.this.onPlayerStateReceived((PlayerState) obj);
            }
        }, DEFAULT_ERROR_HANDLER);
    }

    public void subscribe(PlayerStateObserver playerStateObserver, int i, int i2) {
        synchronized (this.mPlayerStateObservers) {
            if (!this.mPlayerStateObservers.containsKey(playerStateObserver)) {
                Observable a = this.mRxPlayerState.getPlayerState(i, i2).a(callingThreadScheduler());
                playerStateObserver.getClass();
                this.mPlayerStateObservers.put(playerStateObserver, a.a((Consumer<? super T>) new Consumer() {
                    public final void accept(Object obj) {
                        PlayerStateObserver.this.onPlayerStateReceived((PlayerState) obj);
                    }
                }, (Consumer<? super Throwable>) new Consumer(playerStateObserver) {
                    private final /* synthetic */ PlayerStateObserver f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void accept(Object obj) {
                        PlayerStateCompat.this.lambda$subscribe$1$PlayerStateCompat(this.f$1, (Throwable) obj);
                    }
                }));
            }
        }
    }

    public /* synthetic */ void lambda$subscribe$1$PlayerStateCompat(PlayerStateObserver playerStateObserver, Throwable th) {
        Assertion.a(String.format("Leaked PlayerStateObserver: %s", new Object[]{playerStateObserver.getClass().getName()}), th);
        unsubscribe(playerStateObserver);
    }

    public void unsubscribe(PlayerStateObserver playerStateObserver) {
        synchronized (this.mPlayerStateObservers) {
            Disposable disposable = (Disposable) this.mPlayerStateObservers.remove(playerStateObserver);
            if (disposable != null) {
                disposable.bf_();
            }
        }
    }

    public PlayerState getMostRecentPlayerState() {
        return this.mRxPlayerState.getMostRecentPlayerState();
    }

    private Scheduler callingThreadScheduler() {
        Looper myLooper = Looper.myLooper();
        return myLooper == null ? this.mComputationScheduler : AndroidSchedulers.a(myLooper);
    }

    static /* synthetic */ void lambda$static$0(Throwable th) {
        if (a.a) {
            Logger.e("Failed to update: %s", th.getMessage());
            return;
        }
        Logger.e(th, "Failed to update", new Object[0]);
    }
}
