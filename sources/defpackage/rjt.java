package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: rjt reason: default package */
public final class rjt implements vua<rjs> {
    private final wlc<Picasso> a;
    private final wlc<Context> b;

    private rjt(wlc<Picasso> wlc, wlc<Context> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rjt a(wlc<Picasso> wlc, wlc<Context> wlc2) {
        return new rjt(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new rjs((Picasso) this.a.get(), (Context) this.b.get());
    }
}
