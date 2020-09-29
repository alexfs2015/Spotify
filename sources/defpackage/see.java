package defpackage;

import io.reactivex.Flowable;

/* renamed from: see reason: default package */
public final class see implements vua<sed> {
    private final wlc<Flowable<sgc>> a;
    private final wlc<Flowable<sgc>> b;

    private see(wlc<Flowable<sgc>> wlc, wlc<Flowable<sgc>> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static see a(wlc<Flowable<sgc>> wlc, wlc<Flowable<sgc>> wlc2) {
        return new see(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new sed(this.a, this.b);
    }
}
