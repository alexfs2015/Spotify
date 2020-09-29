package defpackage;

import io.reactivex.Observable;

/* renamed from: hgj reason: default package */
public final class hgj implements wig<hgi> {
    private final wzi<Observable<Boolean>> a;
    private final wzi<hgt> b;

    private hgj(wzi<Observable<Boolean>> wzi, wzi<hgt> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hgj a(wzi<Observable<Boolean>> wzi, wzi<hgt> wzi2) {
        return new hgj(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new hgi((Observable) this.a.get(), (hgt) this.b.get());
    }
}
