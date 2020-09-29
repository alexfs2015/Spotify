package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: tau reason: default package */
public final class tau implements a {
    private final url a;
    private final tcn b;
    private final ute c;
    private tav d;

    public tau(url url, tcn tcn, ute ute) {
        this.a = url;
        this.b = tcn;
        this.c = ute;
    }

    public final void a() {
        this.c.j();
        this.b.b();
    }

    public final void a(tav tav) {
        this.d = (tav) fay.a(tav);
        this.d.a((a) this);
        this.a.a((a<T>) new $$Lambda$tau$AVAtf93Z3cGOskN08VWHlz4H0U<T>(this));
    }

    /* access modifiers changed from: private */
    public void a(PlayerState playerState) {
        this.d.a(!(uhq.g(playerState.contextUri()) || uhq.f(playerState.contextUri())));
    }
}
