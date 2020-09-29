package defpackage;

import io.reactivex.Flowable;

/* renamed from: uhf reason: default package */
public final class uhf implements vua<uhe> {
    private final wlc<Flowable<fpt>> a;

    private uhf(wlc<Flowable<fpt>> wlc) {
        this.a = wlc;
    }

    public static uhf a(wlc<Flowable<fpt>> wlc) {
        return new uhf(wlc);
    }

    public final /* synthetic */ Object get() {
        return new uhe((Flowable) this.a.get());
    }
}
