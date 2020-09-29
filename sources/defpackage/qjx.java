package defpackage;

import io.reactivex.Observable;

/* renamed from: qjx reason: default package */
public final class qjx implements wig<Observable<sph>> {
    private final wzi<String> a;
    private final wzi<hgz> b;

    private qjx(wzi<String> wzi, wzi<hgz> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qjx a(wzi<String> wzi, wzi<hgz> wzi2) {
        return new qjx(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (Observable) wil.a(CC.a((String) this.a.get(), (hgz) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
