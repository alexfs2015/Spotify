package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: piz reason: default package */
public final class piz implements wig<piy> {
    private final wzi<a> a;
    private final wzi<sgb> b;
    private final wzi<sso> c;
    private final wzi<rmf> d;

    private piz(wzi<a> wzi, wzi<sgb> wzi2, wzi<sso> wzi3, wzi<rmf> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static piz a(wzi<a> wzi, wzi<sgb> wzi2, wzi<sso> wzi3, wzi<rmf> wzi4) {
        return new piz(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new piy((a) this.a.get(), (sgb) this.b.get(), (sso) this.c.get(), (rmf) this.d.get());
    }
}
