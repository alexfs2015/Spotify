package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: qtt reason: default package */
public final class qtt implements vua<qts> {
    private final wlc<Context> a;
    private final wlc<Picasso> b;
    private final wlc<qzq> c;
    private final wlc<twz> d;
    private final wlc<qzs> e;
    private final wlc<qwo> f;

    private qtt(wlc<Context> wlc, wlc<Picasso> wlc2, wlc<qzq> wlc3, wlc<twz> wlc4, wlc<qzs> wlc5, wlc<qwo> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static qtt a(wlc<Context> wlc, wlc<Picasso> wlc2, wlc<qzq> wlc3, wlc<twz> wlc4, wlc<qzs> wlc5, wlc<qwo> wlc6) {
        qtt qtt = new qtt(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return qtt;
    }

    public final /* synthetic */ Object get() {
        qts qts = new qts((Context) this.a.get(), (Picasso) this.b.get(), (qzq) this.c.get(), (twz) this.d.get(), (qzs) this.e.get(), (qwo) this.f.get());
        return qts;
    }
}
