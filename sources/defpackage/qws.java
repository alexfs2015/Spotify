package defpackage;

import android.content.res.Resources;

/* renamed from: qws reason: default package */
public final class qws implements vua<qwr> {
    private final wlc<qsr> a;
    private final wlc<Resources> b;

    private qws(wlc<qsr> wlc, wlc<Resources> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qws a(wlc<qsr> wlc, wlc<Resources> wlc2) {
        return new qws(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new qwr((qsr) this.a.get(), (Resources) this.b.get());
    }
}
