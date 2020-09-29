package defpackage;

import android.content.res.Resources;

/* renamed from: qcg reason: default package */
public final class qcg implements vua<qcf> {
    private final wlc<Resources> a;

    private qcg(wlc<Resources> wlc) {
        this.a = wlc;
    }

    public static qcg a(wlc<Resources> wlc) {
        return new qcg(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qcf((Resources) this.a.get());
    }
}
