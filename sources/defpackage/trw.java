package defpackage;

import io.reactivex.Flowable;

/* renamed from: trw reason: default package */
public final class trw implements wig<Flowable<Boolean>> {
    private final wzi<tsf> a;

    private trw(wzi<tsf> wzi) {
        this.a = wzi;
    }

    public static trw a(wzi<tsf> wzi) {
        return new trw(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(((tsf) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
