package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: rhl reason: default package */
public final class rhl implements vua<rhk> {
    private final wlc<Context> a;
    private final wlc<Picasso> b;
    private final wlc<rhu> c;
    private final wlc<gxw> d;

    private rhl(wlc<Context> wlc, wlc<Picasso> wlc2, wlc<rhu> wlc3, wlc<gxw> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static rhl a(wlc<Context> wlc, wlc<Picasso> wlc2, wlc<rhu> wlc3, wlc<gxw> wlc4) {
        return new rhl(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new rhk((Context) this.a.get(), (Picasso) this.b.get(), (rhu) this.c.get(), (gxw) this.d.get());
    }
}
