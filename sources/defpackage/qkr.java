package defpackage;

import androidx.fragment.app.Fragment;

/* renamed from: qkr reason: default package */
public final class qkr implements wig<qkq> {
    private final wzi<Fragment> a;

    private qkr(wzi<Fragment> wzi) {
        this.a = wzi;
    }

    public static qkr a(wzi<Fragment> wzi) {
        return new qkr(wzi);
    }

    public final /* synthetic */ Object get() {
        return new qkq((Fragment) this.a.get());
    }
}
