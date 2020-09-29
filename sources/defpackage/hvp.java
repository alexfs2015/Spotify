package defpackage;

import io.reactivex.Observable;

/* renamed from: hvp reason: default package */
public final class hvp implements wig<hvo> {
    private final wzi<Observable<vky>> a;
    private final wzi<Observable<vlb<vkt>>> b;
    private final wzi<Observable<vlb<vkv>>> c;

    private hvp(wzi<Observable<vky>> wzi, wzi<Observable<vlb<vkt>>> wzi2, wzi<Observable<vlb<vkv>>> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static hvp a(wzi<Observable<vky>> wzi, wzi<Observable<vlb<vkt>>> wzi2, wzi<Observable<vlb<vkv>>> wzi3) {
        return new hvp(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new hvo((Observable) this.a.get(), (Observable) this.b.get(), (Observable) this.c.get());
    }
}
