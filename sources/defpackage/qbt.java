package defpackage;

import androidx.fragment.app.Fragment;

/* renamed from: qbt reason: default package */
public final class qbt implements vua<qbs> {
    private final wlc<Fragment> a;

    private qbt(wlc<Fragment> wlc) {
        this.a = wlc;
    }

    public static qbt a(wlc<Fragment> wlc) {
        return new qbt(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qbs((Fragment) this.a.get());
    }
}
