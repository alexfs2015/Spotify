package defpackage;

import io.reactivex.Observable;

/* renamed from: hrh reason: default package */
public final class hrh implements wig<hrg> {
    private final wzi<Observable<vlb<vkt>>> a;
    private final wzi<Observable<vlb<vkv>>> b;
    private final wzi<Observable<vky>> c;
    private final wzi<hrc> d;

    private hrh(wzi<Observable<vlb<vkt>>> wzi, wzi<Observable<vlb<vkv>>> wzi2, wzi<Observable<vky>> wzi3, wzi<hrc> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static hrh a(wzi<Observable<vlb<vkt>>> wzi, wzi<Observable<vlb<vkv>>> wzi2, wzi<Observable<vky>> wzi3, wzi<hrc> wzi4) {
        return new hrh(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new hrg((Observable) this.a.get(), (Observable) this.b.get(), (Observable) this.c.get(), (hrc) this.d.get());
    }
}
