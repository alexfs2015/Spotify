package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: ttw reason: default package */
public final class ttw {
    Disposable a;
    private final Flowable<PlayerState> b;

    public ttw(Flowable<PlayerState> flowable) {
        this.b = flowable;
    }

    /* access modifiers changed from: private */
    public static void a(Throwable th) {
        Logger.b(th, "error subscribing to playerstate", new Object[0]);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(ttv ttv, PlayerState playerState) {
        if (playerState.contextUri().equals(ttv.c()) && playerState.isPlaying() && !playerState.isPaused()) {
            ttv.e();
        } else {
            ttv.d();
        }
    }

    public final void a(ttv ttv) {
        this.a = this.b.a((Consumer<? super T>) new $$Lambda$ttw$U0FNNPugjadox5cRcy9YRVYhjs<Object>(ttv), (Consumer<? super Throwable>) $$Lambda$ttw$0quKuBHeyTRwIsLFOeRXEV091Y.INSTANCE);
    }
}
