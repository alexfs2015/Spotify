package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: ucv reason: default package */
public final class ucv implements vua<ucu> {
    private final wlc<jwv> a;
    private final wlc<Picasso> b;
    private final wlc<ubr> c;

    private ucv(wlc<jwv> wlc, wlc<Picasso> wlc2, wlc<ubr> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static ucv a(wlc<jwv> wlc, wlc<Picasso> wlc2, wlc<ubr> wlc3) {
        return new ucv(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new ucu((jwv) this.a.get(), (Picasso) this.b.get(), (ubr) this.c.get());
    }
}
