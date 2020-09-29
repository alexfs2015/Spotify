package defpackage;

import androidx.fragment.app.Fragment;

/* renamed from: kym reason: default package */
public final class kym implements vua<fpt> {
    private final wlc<Fragment> a;

    private kym(wlc<Fragment> wlc) {
        this.a = wlc;
    }

    public static kym a(wlc<Fragment> wlc) {
        return new kym(wlc);
    }

    public final /* synthetic */ Object get() {
        return (fpt) vuf.a(fpu.a((Fragment) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
