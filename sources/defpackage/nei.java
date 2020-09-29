package defpackage;

import io.reactivex.Observable;

/* renamed from: nei reason: default package */
public final class nei implements vua<Observable<ned>> {
    private final wlc<Observable<uyv>> a;
    private final wlc<Observable<uyy<uys>>> b;
    private final wlc<Observable<uyy<uyq>>> c;

    private nei(wlc<Observable<uyv>> wlc, wlc<Observable<uyy<uys>>> wlc2, wlc<Observable<uyy<uyq>>> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static nei a(wlc<Observable<uyv>> wlc, wlc<Observable<uyy<uys>>> wlc2, wlc<Observable<uyy<uyq>>> wlc3) {
        return new nei(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (Observable) vuf.a(CC.a((Observable) this.a.get(), (Observable) this.b.get(), (Observable) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
