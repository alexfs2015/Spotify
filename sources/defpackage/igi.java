package defpackage;

import com.spotify.cosmos.router.Response;

/* renamed from: igi reason: default package */
public final class igi implements vua<igh> {
    private final wlc<igj> a;
    private final wlc<jwc<Response>> b;
    private final wlc<igl> c;

    private igi(wlc<igj> wlc, wlc<jwc<Response>> wlc2, wlc<igl> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static igi a(wlc<igj> wlc, wlc<jwc<Response>> wlc2, wlc<igl> wlc3) {
        return new igi(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        igh igh = new igh((igj) this.a.get(), (jwc) this.b.get());
        igh.a = (igl) this.c.get();
        return igh;
    }
}
