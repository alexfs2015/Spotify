package defpackage;

import com.spotify.http.wg.WebgateTokenProvider;

/* renamed from: gja reason: default package */
public final class gja implements wig<giz> {
    private final wzi<WebgateTokenProvider> a;
    private final wzi<gcb> b;
    private final wzi<gjm> c;
    private final wzi<git> d;
    private final wzi<git> e;
    private final wzi<gjp> f;
    private final wzi<gjo> g;
    private final wzi<gjz> h;
    private final wzi<giw> i;

    private gja(wzi<WebgateTokenProvider> wzi, wzi<gcb> wzi2, wzi<gjm> wzi3, wzi<git> wzi4, wzi<git> wzi5, wzi<gjp> wzi6, wzi<gjo> wzi7, wzi<gjz> wzi8, wzi<giw> wzi9) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
        this.i = wzi9;
    }

    public static gja a(wzi<WebgateTokenProvider> wzi, wzi<gcb> wzi2, wzi<gjm> wzi3, wzi<git> wzi4, wzi<git> wzi5, wzi<gjp> wzi6, wzi<gjo> wzi7, wzi<gjz> wzi8, wzi<giw> wzi9) {
        gja gja = new gja(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9);
        return gja;
    }

    public final /* synthetic */ Object get() {
        giz giz = new giz(this.a, (gcb) this.b.get(), (gjm) this.c.get(), (git) this.d.get(), (git) this.e.get(), (gjp) this.f.get(), (gjo) this.g.get(), (gjz) this.h.get(), (giw) this.i.get());
        return giz;
    }
}
