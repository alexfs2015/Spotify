package defpackage;

import com.spotify.http.wg.WebgateTokenProvider;

/* renamed from: ghp reason: default package */
public final class ghp implements vua<gho> {
    private final wlc<WebgateTokenProvider> a;
    private final wlc<gbd> b;
    private final wlc<gib> c;
    private final wlc<ghi> d;
    private final wlc<ghi> e;
    private final wlc<gie> f;
    private final wlc<gid> g;
    private final wlc<gio> h;
    private final wlc<ghl> i;

    private ghp(wlc<WebgateTokenProvider> wlc, wlc<gbd> wlc2, wlc<gib> wlc3, wlc<ghi> wlc4, wlc<ghi> wlc5, wlc<gie> wlc6, wlc<gid> wlc7, wlc<gio> wlc8, wlc<ghl> wlc9) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
    }

    public static ghp a(wlc<WebgateTokenProvider> wlc, wlc<gbd> wlc2, wlc<gib> wlc3, wlc<ghi> wlc4, wlc<ghi> wlc5, wlc<gie> wlc6, wlc<gid> wlc7, wlc<gio> wlc8, wlc<ghl> wlc9) {
        ghp ghp = new ghp(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9);
        return ghp;
    }

    public final /* synthetic */ Object get() {
        gho gho = new gho(this.a, (gbd) this.b.get(), (gib) this.c.get(), (ghi) this.d.get(), (ghi) this.e.get(), (gie) this.f.get(), (gid) this.g.get(), (gio) this.h.get(), (ghl) this.i.get());
        return gho;
    }
}
