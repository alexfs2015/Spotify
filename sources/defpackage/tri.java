package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: tri reason: default package */
public final class tri implements wig<trh> {
    private final wzi<a> a;
    private final wzi<fqn> b;
    private final wzi<trf> c;
    private final wzi<vco> d;
    private final wzi<vcs> e;

    private tri(wzi<a> wzi, wzi<fqn> wzi2, wzi<trf> wzi3, wzi<vco> wzi4, wzi<vcs> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static tri a(wzi<a> wzi, wzi<fqn> wzi2, wzi<trf> wzi3, wzi<vco> wzi4, wzi<vcs> wzi5) {
        tri tri = new tri(wzi, wzi2, wzi3, wzi4, wzi5);
        return tri;
    }

    public final /* synthetic */ Object get() {
        trh trh = new trh((a) this.a.get(), (fqn) this.b.get(), (trf) this.c.get(), (vco) this.d.get(), (vcs) this.e.get());
        return trh;
    }
}
