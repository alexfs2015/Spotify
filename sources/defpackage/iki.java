package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackElapsed;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;

/* renamed from: iki reason: default package */
public final class iki extends ikf {
    private Disposable c = Disposables.b();
    private long d = -1;
    private final Scheduler e;

    public iki(hne hne, a aVar, Scheduler scheduler) {
        super(hne, aVar);
        this.e = scheduler;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.c = vun.b(this.b.d().a()).a(this.e).a((Consumer<? super T>) new $$Lambda$iki$mlR1H6HBfNtZuVxUT5vwwXq2Yo<Object>(this), (Consumer<? super Throwable>) $$Lambda$iki$8S2Vf3LZgs7MjVpddpLUVJB2Q.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        if (this.d != playerState.currentPlaybackPosition()) {
            this.d = playerState.currentPlaybackPosition();
            a((Object) new TrackElapsed(playerState));
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        if (!this.c.b()) {
            this.c.bf_();
        }
    }

    public final void a(ija ija, int i) {
        a((Object) new TrackElapsed(this.b.d().b()));
    }
}
