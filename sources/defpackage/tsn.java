package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: tsn reason: default package */
public final class tsn implements vua<a> {
    private final wlc<Picasso> a;
    private final wlc<Context> b;
    private final wlc<tsi> c;

    private tsn(wlc<Picasso> wlc, wlc<Context> wlc2, wlc<tsi> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static tsn a(wlc<Picasso> wlc, wlc<Context> wlc2, wlc<tsi> wlc3) {
        return new tsn(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new a((Picasso) this.a.get(), (Context) this.b.get(), (tsi) this.c.get());
    }
}
