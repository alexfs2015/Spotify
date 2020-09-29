package defpackage;

import android.content.Context;

/* renamed from: qso reason: default package */
public final class qso {
    public final wlc<Context> a;
    public final wlc<qrk> b;
    public final wlc<qsi> c;
    public final wlc<qsd> d;
    public final wlc<qsa> e;
    public final wlc<qsk> f;
    public final wlc<qri> g;

    public qso(wlc<Context> wlc, wlc<qrk> wlc2, wlc<qsi> wlc3, wlc<qsd> wlc4, wlc<qsa> wlc5, wlc<qsk> wlc6, wlc<qri> wlc7) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
        this.f = (wlc) a(wlc6, 6);
        this.g = (wlc) a(wlc7, 7);
    }

    public static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
