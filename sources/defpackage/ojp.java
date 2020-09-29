package defpackage;

import io.reactivex.Completable;

/* renamed from: ojp reason: default package */
public final class ojp implements vua<Completable> {
    private final wlc<oeu> a;

    private ojp(wlc<oeu> wlc) {
        this.a = wlc;
    }

    public static ojp a(wlc<oeu> wlc) {
        return new ojp(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Completable) vuf.a(((oeu) this.a.get()).b, "Cannot return null from a non-@Nullable @Provides method");
    }
}
