package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: tue reason: default package */
public final class tue implements vua<tud> {
    private final wlc<Context> a;
    private final wlc<Picasso> b;

    private tue(wlc<Context> wlc, wlc<Picasso> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static tue a(wlc<Context> wlc, wlc<Picasso> wlc2) {
        return new tue(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new tud((Context) this.a.get(), (Picasso) this.b.get());
    }
}
