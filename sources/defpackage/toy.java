package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: toy reason: default package */
public final class toy implements vua<tox> {
    private final wlc<Context> a;
    private final wlc<Picasso> b;
    private final wlc<rxo> c;

    private toy(wlc<Context> wlc, wlc<Picasso> wlc2, wlc<rxo> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static toy a(wlc<Context> wlc, wlc<Picasso> wlc2, wlc<rxo> wlc3) {
        return new toy(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new tox((Context) this.a.get(), (Picasso) this.b.get(), (rxo) this.c.get());
    }
}
