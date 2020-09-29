package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: iml reason: default package */
public final class iml extends ims {
    private Disposable c;
    private PlayerState d;
    private final Scheduler e;

    public iml(hpt hpt, a aVar, Scheduler scheduler) {
        super(hpt, aVar);
        this.e = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        this.d = playerState;
        a((Object) AppProtocol.PlayerState.playerStateFrom(playerState));
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.c = wit.b(this.b.d().a()).a(this.e).a((Consumer<? super T>) new $$Lambda$iml$mmvL3wT9mMnNw_U4P6j3QKNYRo<Object>(this), (Consumer<? super Throwable>) $$Lambda$iml$3zL0rjzqYsIHvyTpBybpICUxkxQ.INSTANCE);
    }

    public final void a(iln iln, int i) {
        a((Object) AppProtocol.PlayerState.playerStateFrom(this.d));
    }

    /* access modifiers changed from: protected */
    public final void b() {
        Disposable disposable = this.c;
        if (disposable != null && !disposable.b()) {
            this.c.bd_();
            this.c = null;
        }
    }
}
