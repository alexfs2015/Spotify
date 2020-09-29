package defpackage;

import io.reactivex.Scheduler;

/* renamed from: rtx reason: default package */
public final class rtx implements vua<rtw> {
    private final wlc<kxz> a;
    private final wlc<rtn> b;
    private final wlc<Scheduler> c;

    private rtx(wlc<kxz> wlc, wlc<rtn> wlc2, wlc<Scheduler> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static rtx a(wlc<kxz> wlc, wlc<rtn> wlc2, wlc<Scheduler> wlc3) {
        return new rtx(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new rtw(this.a, this.b, this.c);
    }
}
