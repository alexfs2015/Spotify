package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: tlb reason: default package */
public final class tlb implements a {
    private final vcq a;
    private final tmu b;
    private final vej c;
    private tlc d;

    public tlb(vcq vcq, tmu tmu, vej vej) {
        this.a = vcq;
        this.b = tmu;
        this.c = vej;
    }

    /* access modifiers changed from: private */
    public void a(PlayerState playerState) {
        this.d.a(!(ute.f(playerState.contextUri()) || ute.e(playerState.contextUri())));
    }

    public final void a() {
        this.c.j();
        this.b.b();
    }

    public final void a(tlc tlc) {
        this.d = (tlc) fbp.a(tlc);
        this.d.a((a) this);
        this.a.a((a<T>) new $$Lambda$tlb$bypEKbEkAUdqHHF_KbWIv8r5kws<T>(this));
    }
}
