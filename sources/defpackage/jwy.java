package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: jwy reason: default package */
public final class jwy implements vua<jwv> {
    private final wlc<Context> a;
    private final wlc<Picasso> b;

    private jwy(wlc<Context> wlc, wlc<Picasso> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static jwy a(wlc<Context> wlc, wlc<Picasso> wlc2) {
        return new jwy(wlc, wlc2);
    }

    public static jwv a(Context context, Picasso picasso) {
        return new jwv(context, picasso);
    }

    public final /* synthetic */ Object get() {
        return new jwv((Context) this.a.get(), (Picasso) this.b.get());
    }
}
