package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: tqa reason: default package */
public final class tqa implements vua<tpz> {
    private final wlc<Picasso> a;
    private final wlc<tpr> b;

    private tqa(wlc<Picasso> wlc, wlc<tpr> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static tqa a(wlc<Picasso> wlc, wlc<tpr> wlc2) {
        return new tqa(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new tpz((Picasso) this.a.get(), (tpr) this.b.get());
    }
}
