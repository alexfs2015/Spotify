package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: rik reason: default package */
public final class rik implements vua<rij> {
    private final wlc<Context> a;
    private final wlc<Picasso> b;
    private final wlc<gxw> c;

    private rik(wlc<Context> wlc, wlc<Picasso> wlc2, wlc<gxw> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static rik a(wlc<Context> wlc, wlc<Picasso> wlc2, wlc<gxw> wlc3) {
        return new rik(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new rij((Context) this.a.get(), (Picasso) this.b.get(), (gxw) this.c.get());
    }
}
