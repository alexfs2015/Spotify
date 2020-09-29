package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: ibx reason: default package */
public final class ibx implements vua<ibw> {
    private final wlc<Picasso> a;
    private final wlc<ibr> b;

    private ibx(wlc<Picasso> wlc, wlc<ibr> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ibx a(wlc<Picasso> wlc, wlc<ibr> wlc2) {
        return new ibx(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ibw(vtz.b(this.a), (ibr) this.b.get());
    }
}
