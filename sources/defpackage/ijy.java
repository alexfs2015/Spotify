package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: ijy reason: default package */
public final class ijy extends ikf {
    private Disposable c;
    private PlayerState d;
    private final Scheduler e;

    public ijy(hne hne, a aVar, Scheduler scheduler) {
        super(hne, aVar);
        this.e = scheduler;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.c = vun.b(this.b.d().a()).a(this.e).a((Consumer<? super T>) new $$Lambda$ijy$aApfr0pN_sINXVIMQBzGGx8ZEO0<Object>(this), (Consumer<? super Throwable>) $$Lambda$ijy$hNStOI2RdmAZS52OavLFIaBWlQ.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        this.d = playerState;
        a((Object) AppProtocol.PlayerState.playerStateFrom(playerState));
    }

    /* access modifiers changed from: protected */
    public final void b() {
        Disposable disposable = this.c;
        if (disposable != null && !disposable.b()) {
            this.c.bf_();
            this.c = null;
        }
    }

    public final void a(ija ija, int i) {
        a((Object) AppProtocol.PlayerState.playerStateFrom(this.d));
    }
}
