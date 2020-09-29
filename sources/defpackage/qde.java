package defpackage;

import android.content.Context;
import com.spotify.cosmos.android.RxResolver;

/* renamed from: qde reason: default package */
public final class qde implements vua<lmj> {
    private final wlc<Context> a;
    private final wlc<jro> b;
    private final wlc<RxResolver> c;
    private final wlc<wug> d;

    private qde(wlc<Context> wlc, wlc<jro> wlc2, wlc<RxResolver> wlc3, wlc<wug> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static qde a(wlc<Context> wlc, wlc<jro> wlc2, wlc<RxResolver> wlc3, wlc<wug> wlc4) {
        return new qde(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        Context context = (Context) this.a.get();
        wug wug = (wug) this.d.get();
        lmj lmj = new lmj(new lmh(context, new lme(), (jro) this.b.get()), new lmf(), new lmc(context), new lmd((RxResolver) this.c.get()), wug);
        return (lmj) vuf.a(lmj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
