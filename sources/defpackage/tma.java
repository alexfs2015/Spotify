package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: tma reason: default package */
public final class tma implements vua<tlz> {
    private final wlc<Picasso> a;
    private final wlc<tmb> b;

    private tma(wlc<Picasso> wlc, wlc<tmb> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static tma a(wlc<Picasso> wlc, wlc<tmb> wlc2) {
        return new tma(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new tlz((Picasso) this.a.get(), (tmb) this.b.get());
    }
}
