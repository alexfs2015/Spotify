package defpackage;

import io.reactivex.Observable;

/* renamed from: lxb reason: default package */
public final class lxb implements vua<Observable<lym>> {
    private final wlc<hed> a;

    private lxb(wlc<hed> wlc) {
        this.a = wlc;
    }

    public static lxb a(wlc<hed> wlc) {
        return new lxb(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Observable) vuf.a(CC.a((hed) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
