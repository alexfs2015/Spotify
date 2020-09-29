package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: qfx reason: default package */
public final class qfx implements vua<qfw> {
    private final wlc<hvl> a;
    private final wlc<RxResolver> b;

    private qfx(wlc<hvl> wlc, wlc<RxResolver> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qfx a(wlc<hvl> wlc, wlc<RxResolver> wlc2) {
        return new qfx(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new qfw((hvl) this.a.get(), (RxResolver) this.b.get());
    }
}
