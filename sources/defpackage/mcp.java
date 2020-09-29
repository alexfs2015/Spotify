package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: mcp reason: default package */
public final class mcp implements wig<mco> {
    private final wzi<a> a;
    private final wzi<sgb> b;
    private final wzi<sso> c;
    private final wzi<rmf> d;

    private mcp(wzi<a> wzi, wzi<sgb> wzi2, wzi<sso> wzi3, wzi<rmf> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static mcp a(wzi<a> wzi, wzi<sgb> wzi2, wzi<sso> wzi3, wzi<rmf> wzi4) {
        return new mcp(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new mco((a) this.a.get(), (sgb) this.b.get(), (sso) this.c.get(), (rmf) this.d.get());
    }
}
