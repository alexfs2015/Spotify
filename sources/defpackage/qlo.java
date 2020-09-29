package defpackage;

import androidx.fragment.app.Fragment;

/* renamed from: qlo reason: default package */
public final class qlo implements wig<qln> {
    private final wzi<lbr> a;
    private final wzi<Fragment> b;

    private qlo(wzi<lbr> wzi, wzi<Fragment> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qlo a(wzi<lbr> wzi, wzi<Fragment> wzi2) {
        return new qlo(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new qln((lbr) this.a.get(), (Fragment) this.b.get());
    }
}
