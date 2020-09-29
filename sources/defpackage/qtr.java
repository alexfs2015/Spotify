package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: qtr reason: default package */
public final class qtr implements vua<qtq> {
    private final wlc<qzo> a;
    private final wlc<Picasso> b;
    private final wlc<qzq> c;

    private qtr(wlc<qzo> wlc, wlc<Picasso> wlc2, wlc<qzq> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static qtr a(wlc<qzo> wlc, wlc<Picasso> wlc2, wlc<qzq> wlc3) {
        return new qtr(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new qtq((qzo) this.a.get(), (Picasso) this.b.get(), (qzq) this.c.get());
    }
}
