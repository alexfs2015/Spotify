package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: lty reason: default package */
public final class lty implements vua<ltx> {
    private final wlc<Picasso> a;
    private final wlc<heg> b;

    private lty(wlc<Picasso> wlc, wlc<heg> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static lty a(wlc<Picasso> wlc, wlc<heg> wlc2) {
        return new lty(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ltx(this.a, this.b);
    }
}
