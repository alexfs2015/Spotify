package defpackage;

import io.reactivex.Observable;

/* renamed from: njx reason: default package */
public final class njx implements wig<Observable<njs>> {
    private final wzi<Observable<vky>> a;
    private final wzi<Observable<vlb<vkv>>> b;
    private final wzi<Observable<vlb<vkt>>> c;

    private njx(wzi<Observable<vky>> wzi, wzi<Observable<vlb<vkv>>> wzi2, wzi<Observable<vlb<vkt>>> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static njx a(wzi<Observable<vky>> wzi, wzi<Observable<vlb<vkv>>> wzi2, wzi<Observable<vlb<vkt>>> wzi3) {
        return new njx(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (Observable) wil.a(CC.a((Observable) this.a.get(), (Observable) this.b.get(), (Observable) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
