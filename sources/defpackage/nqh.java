package defpackage;

import io.reactivex.Completable;

/* renamed from: nqh reason: default package */
public final class nqh implements wig<Completable> {
    private final wzi<npv> a;

    private nqh(wzi<npv> wzi) {
        this.a = wzi;
    }

    public static nqh a(wzi<npv> wzi) {
        return new nqh(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Completable) wil.a(((npv) this.a.get()).a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
