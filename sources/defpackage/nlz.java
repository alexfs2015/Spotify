package defpackage;

import io.reactivex.Single;

/* renamed from: nlz reason: default package */
public final class nlz implements wig<Single<Boolean>> {
    private final wzi<nly> a;

    private nlz(wzi<nly> wzi) {
        this.a = wzi;
    }

    public static nlz a(wzi<nly> wzi) {
        return new nlz(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Single) wil.a(((nly) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
