package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: rxu reason: default package */
public final class rxu implements vua<rxt> {
    private final wlc<Picasso> a;
    private final wlc<Context> b;

    private rxu(wlc<Picasso> wlc, wlc<Context> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rxu a(wlc<Picasso> wlc, wlc<Context> wlc2) {
        return new rxu(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new rxt((Picasso) this.a.get(), (Context) this.b.get());
    }
}
