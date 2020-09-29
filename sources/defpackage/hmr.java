package defpackage;

import io.reactivex.Scheduler;

/* renamed from: hmr reason: default package */
public final class hmr {
    public final wlc<idw> a;
    public final wlc<ifi> b;
    public final wlc<ieb> c;
    public final wlc<idz> d;
    public final wlc<ids> e;
    public final wlc<Scheduler> f;

    public hmr(wlc<idw> wlc, wlc<ifi> wlc2, wlc<ieb> wlc3, wlc<idz> wlc4, wlc<ids> wlc5, wlc<Scheduler> wlc6) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
        this.f = (wlc) a(wlc6, 6);
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
