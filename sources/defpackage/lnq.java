package defpackage;

import io.reactivex.Observable;

/* renamed from: lnq reason: default package */
public final class lnq implements wig<Observable<lbg>> {
    private final wzi<lbi> a;

    private lnq(wzi<lbi> wzi) {
        this.a = wzi;
    }

    public static Observable<lbg> a(lbi lbi) {
        return (Observable) wil.a(lbi.a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public static lnq a(wzi<lbi> wzi) {
        return new lnq(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((lbi) this.a.get());
    }
}
