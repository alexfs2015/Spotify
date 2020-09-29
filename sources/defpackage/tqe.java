package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: tqe reason: default package */
public final class tqe implements vua<tqd> {
    private final wlc<Picasso> a;
    private final wlc<tpr> b;

    private tqe(wlc<Picasso> wlc, wlc<tpr> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static tqe a(wlc<Picasso> wlc, wlc<tpr> wlc2) {
        return new tqe(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new tqd((Picasso) this.a.get(), (tpr) this.b.get());
    }
}
