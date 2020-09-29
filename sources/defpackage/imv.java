package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackElapsed;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;

/* renamed from: imv reason: default package */
public final class imv extends ims {
    private Disposable c = Disposables.b();
    private long d = -1;
    private final Scheduler e;

    public imv(hpt hpt, a aVar, Scheduler scheduler) {
        super(hpt, aVar);
        this.e = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        if (this.d != playerState.currentPlaybackPosition()) {
            this.d = playerState.currentPlaybackPosition();
            a((Object) new TrackElapsed(playerState));
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.c = wit.b(this.b.d().a()).a(this.e).a((Consumer<? super T>) new $$Lambda$imv$p158iy9iXK5F5jn8EZIAhqg5eAc<Object>(this), (Consumer<? super Throwable>) $$Lambda$imv$G7T_mRFmqwpx0d05qTYPmCl4o.INSTANCE);
    }

    public final void a(iln iln, int i) {
        a((Object) new TrackElapsed(this.b.d().b()));
    }

    /* access modifiers changed from: protected */
    public final void b() {
        if (!this.c.b()) {
            this.c.bd_();
        }
    }
}
