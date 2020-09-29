package defpackage;

import io.reactivex.Observable;

/* renamed from: mbc reason: default package */
public final class mbc implements wig<Observable<mcn>> {
    private final wzi<hgz> a;

    private mbc(wzi<hgz> wzi) {
        this.a = wzi;
    }

    public static mbc a(wzi<hgz> wzi) {
        return new mbc(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Observable) wil.a(CC.a((hgz) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
