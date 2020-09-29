package defpackage;

import io.reactivex.Observable;

/* renamed from: kyz reason: default package */
public final class kyz implements vua<Observable<Boolean>> {
    private final wlc<kyx> a;

    public static Observable<Boolean> a(Object obj) {
        return (Observable) vuf.a(CC.a((kyx) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a(this.a.get());
    }
}
