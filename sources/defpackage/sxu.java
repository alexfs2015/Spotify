package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: sxu reason: default package */
public final class sxu implements a, b {
    private final kug a;
    private final spi b;
    private final kuq c;
    private final urn d;
    private final uri e;
    private sxv f;
    private kup g;

    public sxu(spi spi, kug kug, kuq kuq, urn urn, uri uri) {
        this.b = (spi) fay.a(spi);
        this.a = (kug) fay.a(kug);
        this.c = (kuq) fay.a(kuq);
        this.d = (urn) fay.a(urn);
        this.e = uri;
    }

    public final void a(sxv sxv, tal tal) {
        this.f = (sxv) fay.a(sxv);
        this.f.a((a) this);
        this.d.a((a<T>) new $$Lambda$sxu$WEjrNlWXEbXpckaxI_S82hwJtQY<T>(this));
        this.e.a((a<T>) new $$Lambda$sxu$9MqMKfkWLM9bx7DASUgGlf6U7o<T>(this));
        tal.a((b) this);
    }

    /* access modifiers changed from: private */
    public void a(urh urh) {
        this.f.a(urh.b());
    }

    public final void a() {
        this.f.b();
    }

    public final void b() {
        if (this.g != null) {
            this.f.a();
        } else {
            this.f.b();
        }
    }

    public final void c() {
        kup kup = this.g;
        if (kup != null) {
            this.b.a(kup.g());
        }
    }

    /* access modifiers changed from: private */
    public void a(PlayerTrack playerTrack) {
        this.g = this.a.a(playerTrack) ? kuq.a(playerTrack) : null;
        kup kup = this.g;
        if (kup != null) {
            this.f.b(kup.f());
            this.f.a(this.g.h());
        }
    }
}
