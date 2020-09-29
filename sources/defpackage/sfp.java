package defpackage;

import io.reactivex.functions.Function;

/* renamed from: sfp reason: default package */
public final class sfp implements vua<sfo> {
    private final wlc<sbf> a;
    private final wlc<Function<rzv, gzz>> b;

    private sfp(wlc<sbf> wlc, wlc<Function<rzv, gzz>> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static sfp a(wlc<sbf> wlc, wlc<Function<rzv, gzz>> wlc2) {
        return new sfp(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new sfo((sbf) this.a.get(), (Function) this.b.get());
    }
}
