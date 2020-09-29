package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: skk reason: default package */
public final class skk {
    Disposable a;
    private final Flowable<PlayerState> b;

    public skk(Flowable<PlayerState> flowable) {
        this.b = flowable;
    }

    public final void a(skj skj) {
        this.a = this.b.a((Consumer<? super T>) new $$Lambda$skk$kADVzVzUj0hU42FNcYrT5_l0Le8<Object>(skj), (Consumer<? super Throwable>) $$Lambda$skk$15jqHalYrvf5CIGWx3RbxI8OK8.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static void a(Throwable th) {
        Logger.b(th, "error subscribing to playerstate", new Object[0]);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(skj skj, PlayerState playerState) {
        if (playerState.contextUri().equals(skj.c()) && playerState.isPlaying() && !playerState.isPaused()) {
            skj.e();
        } else {
            skj.d();
        }
    }
}
