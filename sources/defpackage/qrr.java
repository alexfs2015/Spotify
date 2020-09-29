package defpackage;

import androidx.fragment.app.Fragment;

/* renamed from: qrr reason: default package */
public final class qrr implements vua<kf> {
    private final wlc<Fragment> a;

    private qrr(wlc<Fragment> wlc) {
        this.a = wlc;
    }

    public static qrr a(wlc<Fragment> wlc) {
        return new qrr(wlc);
    }

    public final /* synthetic */ Object get() {
        return (kf) vuf.a(((Fragment) this.a.get()).t(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
