package defpackage;

import io.reactivex.ObservableTransformer;

/* renamed from: scq reason: default package */
public final class scq implements vua<scp> {
    private final wlc<sbf> a;
    private final wlc<ObservableTransformer<h, sbd>> b;

    private scq(wlc<sbf> wlc, wlc<ObservableTransformer<h, sbd>> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static scq a(wlc<sbf> wlc, wlc<ObservableTransformer<h, sbd>> wlc2) {
        return new scq(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new scp((sbf) this.a.get(), (ObservableTransformer) this.b.get());
    }
}
