package defpackage;

import io.reactivex.functions.Function;

/* renamed from: sft reason: default package */
public final class sft implements vua<sfs> {
    private final wlc<sbf> a;
    private final wlc<Function<rzz, gzz>> b;

    private sft(wlc<sbf> wlc, wlc<Function<rzz, gzz>> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static sft a(wlc<sbf> wlc, wlc<Function<rzz, gzz>> wlc2) {
        return new sft(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new sfs((sbf) this.a.get(), (Function) this.b.get());
    }
}
