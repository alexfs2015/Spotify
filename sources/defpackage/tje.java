package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: tje reason: default package */
public final class tje {
    Disposable a;
    private final Flowable<PlayerState> b;

    public tje(Flowable<PlayerState> flowable) {
        this.b = flowable;
    }

    public final void a(tjd tjd) {
        this.a = this.b.a((Consumer<? super T>) new $$Lambda$tje$bvz2rbqgiTB4mQfp380U4L1yQs<Object>(tjd), (Consumer<? super Throwable>) $$Lambda$tje$8avvZrefvgctRMkvWS_sFaTvMo4.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static void a(Throwable th) {
        Logger.b(th, "error subscribing to playerstate", new Object[0]);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(tjd tjd, PlayerState playerState) {
        if (playerState.contextUri().equals(tjd.c()) && playerState.isPlaying() && !playerState.isPaused()) {
            tjd.e();
        } else {
            tjd.d();
        }
    }
}
