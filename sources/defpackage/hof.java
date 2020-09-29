package defpackage;

import io.reactivex.Observable;

/* renamed from: hof reason: default package */
public final class hof implements wig<Observable<Boolean>> {
    private final wzi<hob> a;

    private hof(wzi<hob> wzi) {
        this.a = wzi;
    }

    public static hof a(wzi<hob> wzi) {
        return new hof(wzi);
    }

    public static Observable<Boolean> a(Object obj) {
        return (Observable) wil.a(CC.a((hob) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a(this.a.get());
    }
}
