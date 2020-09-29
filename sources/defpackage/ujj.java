package defpackage;

import android.content.Context;

/* renamed from: ujj reason: default package */
public final class ujj implements vua<uji> {
    private final wlc<Context> a;
    private final wlc<jsi> b;
    private final wlc<ujq> c;
    private final wlc<ujn> d;

    private ujj(wlc<Context> wlc, wlc<jsi> wlc2, wlc<ujq> wlc3, wlc<ujn> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static ujj a(wlc<Context> wlc, wlc<jsi> wlc2, wlc<ujq> wlc3, wlc<ujn> wlc4) {
        return new ujj(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new uji((Context) this.a.get(), (jsi) this.b.get(), (ujq) this.c.get(), (ujn) this.d.get());
    }
}
