package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;

/* renamed from: qyu reason: default package */
public final class qyu implements vua<qyt> {
    private final wlc<qzc> a;
    private final wlc<CollectionStateProvider> b;
    private final wlc<sih> c;
    private final wlc<qxq> d;
    private final wlc<kxz> e;

    private qyu(wlc<qzc> wlc, wlc<CollectionStateProvider> wlc2, wlc<sih> wlc3, wlc<qxq> wlc4, wlc<kxz> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static qyu a(wlc<qzc> wlc, wlc<CollectionStateProvider> wlc2, wlc<sih> wlc3, wlc<qxq> wlc4, wlc<kxz> wlc5) {
        qyu qyu = new qyu(wlc, wlc2, wlc3, wlc4, wlc5);
        return qyu;
    }

    public final /* synthetic */ Object get() {
        qyt qyt = new qyt(this.a, this.b, this.c, this.d, this.e);
        return qyt;
    }
}
