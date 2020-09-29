package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: rhp reason: default package */
public final class rhp implements vua<rho> {
    private final wlc<rhu> a;
    private final wlc<Picasso> b;

    private rhp(wlc<rhu> wlc, wlc<Picasso> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rhp a(wlc<rhu> wlc, wlc<Picasso> wlc2) {
        return new rhp(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new rho((rhu) this.a.get(), (Picasso) this.b.get());
    }
}
