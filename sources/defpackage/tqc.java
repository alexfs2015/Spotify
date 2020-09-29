package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: tqc reason: default package */
public final class tqc implements vua<tqb> {
    private final wlc<Picasso> a;
    private final wlc<tpr> b;

    private tqc(wlc<Picasso> wlc, wlc<tpr> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static tqc a(wlc<Picasso> wlc, wlc<tpr> wlc2) {
        return new tqc(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new tqb((Picasso) this.a.get(), (tpr) this.b.get());
    }
}
