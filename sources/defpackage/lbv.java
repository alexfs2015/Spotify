package defpackage;

import androidx.fragment.app.Fragment;

/* renamed from: lbv reason: default package */
public final class lbv implements wig<fqn> {
    private final wzi<Fragment> a;

    private lbv(wzi<Fragment> wzi) {
        this.a = wzi;
    }

    public static lbv a(wzi<Fragment> wzi) {
        return new lbv(wzi);
    }

    public final /* synthetic */ Object get() {
        return (fqn) wil.a(fqo.a((Fragment) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
