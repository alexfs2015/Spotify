package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: lbx reason: default package */
public final class lbx implements wig<vgw> {
    private final wzi<a> a;
    private final wzi<vhj> b;

    private lbx(wzi<a> wzi, wzi<vhj> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static lbx a(wzi<a> wzi, wzi<vhj> wzi2) {
        return new lbx(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        a aVar = (a) this.a.get();
        vgw b2 = ((vhj) this.b.get()).b();
        aVar.a(new vgx(b2));
        return (vgw) wil.a(b2, "Cannot return null from a non-@Nullable @Provides method");
    }
}
