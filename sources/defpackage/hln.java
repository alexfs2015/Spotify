package defpackage;

import io.reactivex.Observable;

/* renamed from: hln reason: default package */
public final class hln implements vua<Observable<Boolean>> {
    private final wlc<hlj> a;

    private hln(wlc<hlj> wlc) {
        this.a = wlc;
    }

    public static hln a(wlc<hlj> wlc) {
        return new hln(wlc);
    }

    public static Observable<Boolean> a(Object obj) {
        return (Observable) vuf.a(CC.a((hlj) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a(this.a.get());
    }
}
