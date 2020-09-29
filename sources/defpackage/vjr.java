package defpackage;

import android.content.Context;
import java.util.Random;

/* renamed from: vjr reason: default package */
public final class vjr implements vua<vjo> {
    private final wlc<Context> a;
    private final wlc<Random> b;
    private final wlc<jrp> c;

    private vjr(wlc<Context> wlc, wlc<Random> wlc2, wlc<jrp> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static vjr a(wlc<Context> wlc, wlc<Random> wlc2, wlc<jrp> wlc3) {
        return new vjr(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new vjo((Context) this.a.get(), (Random) this.b.get(), (jrp) this.c.get());
    }
}
