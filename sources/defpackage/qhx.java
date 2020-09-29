package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: qhx reason: default package */
public final class qhx implements wig<qhw> {
    private final wzi<a> a;
    private final wzi<sgb> b;
    private final wzi<rmf> c;
    private final wzi<sso> d;

    private qhx(wzi<a> wzi, wzi<sgb> wzi2, wzi<rmf> wzi3, wzi<sso> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static qhx a(wzi<a> wzi, wzi<sgb> wzi2, wzi<rmf> wzi3, wzi<sso> wzi4) {
        return new qhx(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new qhw((a) this.a.get(), (sgb) this.b.get(), (rmf) this.c.get(), (sso) this.d.get());
    }
}
