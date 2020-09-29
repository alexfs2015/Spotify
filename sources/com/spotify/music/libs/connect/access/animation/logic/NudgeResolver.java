package com.spotify.music.libs.connect.access.animation.logic;

import androidx.lifecycle.Lifecycle.Event;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;

public class NudgeResolver implements lg {
    public a a;
    private final Observable<Boolean> b;
    private final Flowable<PlayerState> c;
    private final Scheduler d;
    private final SerialDisposable e;
    private final SerialDisposable f;
    private Boolean g;
    private boolean h = true;

    public interface a {
        void onNudge();
    }

    public NudgeResolver(Observable<Boolean> observable, Flowable<PlayerState> flowable, Scheduler scheduler) {
        this.b = observable;
        this.c = flowable;
        this.d = scheduler;
        this.e = new SerialDisposable();
        this.f = new SerialDisposable();
    }

    /* access modifiers changed from: 0000 */
    @lp(a = Event.ON_CREATE)
    public void onCreate() {
        this.e.a(this.b.a(this.d).d((Consumer<? super T>) new Consumer() {
            public final void accept(Object obj) {
                NudgeResolver.this.a((Boolean) obj);
            }
        }));
    }

    @lp(a = Event.ON_START)
    public void onStart() {
        this.f.a(this.c.a(this.d).c((Consumer<? super T>) new Consumer() {
            public final void accept(Object obj) {
                NudgeResolver.this.a((PlayerState) obj);
            }
        }));
    }

    @lp(a = Event.ON_STOP)
    public void onStop() {
        this.f.a(Disposables.a());
    }

    /* access modifiers changed from: 0000 */
    @lp(a = Event.ON_DESTROY)
    public void onDestroy() {
        this.e.a(Disposables.a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        if (!bool.booleanValue()) {
            this.h = true;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        boolean isPaused = playerState.isPaused();
        Boolean bool = this.g;
        if (bool != null && bool.booleanValue() && !isPaused && this.h) {
            this.a.onNudge();
            this.h = false;
        }
        this.g = Boolean.valueOf(isPaused);
    }
}
