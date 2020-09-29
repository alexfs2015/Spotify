package defpackage;

import android.content.Context;
import io.reactivex.Scheduler;

/* renamed from: ijp reason: default package */
public final class ijp {
    public final wlc<Context> a;
    public final wlc<iix> b;
    public final wlc<ijf> c;
    public final wlc<Scheduler> d;
    public final wlc<Scheduler> e;
    public final wlc<Scheduler> f;
    public final wlc<ksw> g;
    public final wlc<ijq> h;
    public final wlc<ueb> i;

    public ijp(wlc<Context> wlc, wlc<iix> wlc2, wlc<ijf> wlc3, wlc<Scheduler> wlc4, wlc<Scheduler> wlc5, wlc<Scheduler> wlc6, wlc<ksw> wlc7, wlc<ijq> wlc8, wlc<ueb> wlc9) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
        this.f = (wlc) a(wlc6, 6);
        this.g = (wlc) a(wlc7, 7);
        this.h = (wlc) a(wlc8, 8);
        this.i = (wlc) a(wlc9, 9);
    }

    public static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i2);
        throw new NullPointerException(sb.toString());
    }
}
