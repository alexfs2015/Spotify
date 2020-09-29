package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: rhr reason: default package */
public final class rhr implements vua<rhq> {
    private final wlc<Context> a;
    private final wlc<Picasso> b;
    private final wlc<rhu> c;
    private final wlc<gxw> d;

    private rhr(wlc<Context> wlc, wlc<Picasso> wlc2, wlc<rhu> wlc3, wlc<gxw> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static rhr a(wlc<Context> wlc, wlc<Picasso> wlc2, wlc<rhu> wlc3, wlc<gxw> wlc4) {
        return new rhr(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new rhq((Context) this.a.get(), (Picasso) this.b.get(), (rhu) this.c.get(), (gxw) this.d.get());
    }
}
