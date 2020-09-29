package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: nfm reason: default package */
public final class nfm implements vua<vsd> {
    private final wlc<Picasso> a;
    private final wlc<Context> b;

    private nfm(wlc<Picasso> wlc, wlc<Context> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static nfm a(wlc<Picasso> wlc, wlc<Context> wlc2) {
        return new nfm(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (vsd) vuf.a(new vsd(new vso((Picasso) this.a.get()), (Context) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
