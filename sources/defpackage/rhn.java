package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: rhn reason: default package */
public final class rhn implements vua<rhm> {
    private final wlc<Context> a;
    private final wlc<Picasso> b;
    private final wlc<rhu> c;
    private final wlc<gxw> d;

    private rhn(wlc<Context> wlc, wlc<Picasso> wlc2, wlc<rhu> wlc3, wlc<gxw> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static rhn a(wlc<Context> wlc, wlc<Picasso> wlc2, wlc<rhu> wlc3, wlc<gxw> wlc4) {
        return new rhn(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new rhm((Context) this.a.get(), (Picasso) this.b.get(), (rhu) this.c.get(), (gxw) this.d.get());
    }
}
