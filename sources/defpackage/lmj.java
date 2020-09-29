package defpackage;

import io.reactivex.Observable;

/* renamed from: lmj reason: default package */
public final class lmj implements wig<Observable<gcl>> {
    private final wzi<hgz> a;

    private lmj(wzi<hgz> wzi) {
        this.a = wzi;
    }

    public static lmj a(wzi<hgz> wzi) {
        return new lmj(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Observable) wil.a(CC.a((hgz) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
