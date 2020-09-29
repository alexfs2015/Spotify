package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: ifo reason: default package */
public final class ifo implements vua<ifn> {
    private final wlc<iff> a;
    private final wlc<ife> b;
    private final wlc<Picasso> c;

    private ifo(wlc<iff> wlc, wlc<ife> wlc2, wlc<Picasso> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static ifo a(wlc<iff> wlc, wlc<ife> wlc2, wlc<Picasso> wlc3) {
        return new ifo(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new ifn((iff) this.a.get(), (ife) this.b.get(), (Picasso) this.c.get());
    }
}
