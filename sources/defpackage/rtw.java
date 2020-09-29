package defpackage;

import io.reactivex.Scheduler;

/* renamed from: rtw reason: default package */
public final class rtw {
    final wlc<kxz> a;
    final wlc<rtn> b;
    final wlc<Scheduler> c;

    public rtw(wlc<kxz> wlc, wlc<rtn> wlc2, wlc<Scheduler> wlc3) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
    }

    static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
