package defpackage;

import io.reactivex.Observable;

/* renamed from: hgn reason: default package */
public final class hgn implements wig<Observable<Boolean>> {
    private final wzi<hxx> a;

    private hgn(wzi<hxx> wzi) {
        this.a = wzi;
    }

    public static hgn a(wzi<hxx> wzi) {
        return new hgn(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Observable) wil.a(CC.a((hxx) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
