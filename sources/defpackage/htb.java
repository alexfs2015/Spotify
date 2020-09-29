package defpackage;

import io.reactivex.Observable;

/* renamed from: htb reason: default package */
public final class htb implements vua<hta> {
    private final wlc<Observable<uyv>> a;
    private final wlc<Observable<uyy<uyq>>> b;
    private final wlc<Observable<uyy<uys>>> c;

    private htb(wlc<Observable<uyv>> wlc, wlc<Observable<uyy<uyq>>> wlc2, wlc<Observable<uyy<uys>>> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static htb a(wlc<Observable<uyv>> wlc, wlc<Observable<uyy<uyq>>> wlc2, wlc<Observable<uyy<uys>>> wlc3) {
        return new htb(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new hta((Observable) this.a.get(), (Observable) this.b.get(), (Observable) this.c.get());
    }
}
