package defpackage;

import io.reactivex.Observable;

/* renamed from: qaz reason: default package */
public final class qaz implements vua<Observable<sfa>> {
    private final wlc<String> a;
    private final wlc<hed> b;

    private qaz(wlc<String> wlc, wlc<hed> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qaz a(wlc<String> wlc, wlc<hed> wlc2) {
        return new qaz(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (Observable) vuf.a(CC.a((String) this.a.get(), (hed) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
