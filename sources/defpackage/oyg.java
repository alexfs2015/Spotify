package defpackage;

import android.content.Context;

/* renamed from: oyg reason: default package */
public final class oyg implements vua<oyf> {
    private final wlc<Context> a;
    private final wlc<oxz> b;
    private final wlc<oyc> c;
    private final wlc<Boolean> d;
    private final wlc<Boolean> e;
    private final wlc<Boolean> f;

    private oyg(wlc<Context> wlc, wlc<oxz> wlc2, wlc<oyc> wlc3, wlc<Boolean> wlc4, wlc<Boolean> wlc5, wlc<Boolean> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static oyg a(wlc<Context> wlc, wlc<oxz> wlc2, wlc<oyc> wlc3, wlc<Boolean> wlc4, wlc<Boolean> wlc5, wlc<Boolean> wlc6) {
        oyg oyg = new oyg(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return oyg;
    }

    public final /* synthetic */ Object get() {
        oyf oyf = new oyf((Context) this.a.get(), (oxz) this.b.get(), (oyc) this.c.get(), ((Boolean) this.d.get()).booleanValue(), ((Boolean) this.e.get()).booleanValue(), ((Boolean) this.f.get()).booleanValue());
        return oyf;
    }
}
