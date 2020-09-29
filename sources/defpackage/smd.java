package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.ads.model.Ad;

/* renamed from: smd reason: default package */
public final class smd implements a, b {
    public final ieg a;
    public ief b;
    public ier c;

    public smd(ieg ieg) {
        this.a = ieg;
    }

    public final void b() {
        ief ief = this.b;
        ief.e.g = ief.g;
        ief.f.a = Optional.b(ief.c);
    }

    public final void a(Ad ad) {
        this.b.a(ad);
    }

    public final boolean a() {
        return this.c.a.f();
    }
}
