package defpackage;

import io.reactivex.Observable;

/* renamed from: hdr reason: default package */
public final class hdr implements vua<Observable<Boolean>> {
    private final wlc<hvl> a;

    private hdr(wlc<hvl> wlc) {
        this.a = wlc;
    }

    public static hdr a(wlc<hvl> wlc) {
        return new hdr(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Observable) vuf.a(CC.a((hvl) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
