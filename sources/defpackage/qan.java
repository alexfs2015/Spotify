package defpackage;

import io.reactivex.functions.Function;

/* renamed from: qan reason: default package */
public final class qan implements vua<qam> {
    private final wlc<Function<rzz, gzz>> a;
    private final wlc<qag> b;
    private final wlc<ryy> c;
    private final wlc<rzh> d;
    private final wlc<sdi> e;
    private final wlc<sgx> f;

    private qan(wlc<Function<rzz, gzz>> wlc, wlc<qag> wlc2, wlc<ryy> wlc3, wlc<rzh> wlc4, wlc<sdi> wlc5, wlc<sgx> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static qan a(wlc<Function<rzz, gzz>> wlc, wlc<qag> wlc2, wlc<ryy> wlc3, wlc<rzh> wlc4, wlc<sdi> wlc5, wlc<sgx> wlc6) {
        qan qan = new qan(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return qan;
    }

    public final /* synthetic */ Object get() {
        qam qam = new qam((Function) this.a.get(), (qag) this.b.get(), (ryy) this.c.get(), (rzh) this.d.get(), (sdi) this.e.get(), (sgx) this.f.get());
        return qam;
    }
}
