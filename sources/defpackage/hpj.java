package defpackage;

import io.reactivex.Observable;

/* renamed from: hpj reason: default package */
public final class hpj implements vua<hpi> {
    private final wlc<Observable<uyy<uyq>>> a;
    private final wlc<Observable<uyy<uys>>> b;
    private final wlc<Observable<uyv>> c;
    private final wlc<hpb> d;

    private hpj(wlc<Observable<uyy<uyq>>> wlc, wlc<Observable<uyy<uys>>> wlc2, wlc<Observable<uyv>> wlc3, wlc<hpb> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static hpj a(wlc<Observable<uyy<uyq>>> wlc, wlc<Observable<uyy<uys>>> wlc2, wlc<Observable<uyv>> wlc3, wlc<hpb> wlc4) {
        return new hpj(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new hpi((Observable) this.a.get(), (Observable) this.b.get(), (Observable) this.c.get(), (hpb) this.d.get());
    }
}
