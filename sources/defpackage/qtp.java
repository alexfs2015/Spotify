package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: qtp reason: default package */
public final class qtp implements vua<qto> {
    private final wlc<qsr> a;
    private final wlc<Context> b;
    private final wlc<Picasso> c;
    private final wlc<qzq> d;
    private final wlc<qzs> e;

    private qtp(wlc<qsr> wlc, wlc<Context> wlc2, wlc<Picasso> wlc3, wlc<qzq> wlc4, wlc<qzs> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static qtp a(wlc<qsr> wlc, wlc<Context> wlc2, wlc<Picasso> wlc3, wlc<qzq> wlc4, wlc<qzs> wlc5) {
        qtp qtp = new qtp(wlc, wlc2, wlc3, wlc4, wlc5);
        return qtp;
    }

    public final /* synthetic */ Object get() {
        qto qto = new qto((qsr) this.a.get(), (Context) this.b.get(), (Picasso) this.c.get(), (qzq) this.d.get(), (qzs) this.e.get());
        return qto;
    }
}
