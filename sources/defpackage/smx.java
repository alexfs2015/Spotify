package defpackage;

import io.reactivex.ObservableTransformer;

/* renamed from: smx reason: default package */
public final class smx implements wig<smw> {
    private final wzi<slm> a;
    private final wzi<ObservableTransformer<h, slk>> b;

    private smx(wzi<slm> wzi, wzi<ObservableTransformer<h, slk>> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static smx a(wzi<slm> wzi, wzi<ObservableTransformer<h, slk>> wzi2) {
        return new smx(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new smw((slm) this.a.get(), (ObservableTransformer) this.b.get());
    }
}
