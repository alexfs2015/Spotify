package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: sur reason: default package */
public final class sur {
    Disposable a;
    private final Flowable<PlayerState> b;

    public sur(Flowable<PlayerState> flowable) {
        this.b = flowable;
    }

    /* access modifiers changed from: private */
    public static void a(Throwable th) {
        Logger.b(th, "error subscribing to playerstate", new Object[0]);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(suq suq, PlayerState playerState) {
        if (playerState.contextUri().equals(suq.c()) && playerState.isPlaying() && !playerState.isPaused()) {
            suq.e();
        } else {
            suq.d();
        }
    }

    public final void a(suq suq) {
        this.a = this.b.a((Consumer<? super T>) new $$Lambda$sur$8wTLTaNSAINMuiOCH9xV01MzHr8<Object>(suq), (Consumer<? super Throwable>) $$Lambda$sur$87YBESI0XpjmHeTAJIIbO5CJDQg.INSTANCE);
    }
}
