package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: nsw reason: default package */
public final class nsw implements wig<nsv> {
    private final wzi<a> a;
    private final wzi<sgb> b;
    private final wzi<sso> c;
    private final wzi<rmf> d;

    private nsw(wzi<a> wzi, wzi<sgb> wzi2, wzi<sso> wzi3, wzi<rmf> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static nsw a(wzi<a> wzi, wzi<sgb> wzi2, wzi<sso> wzi3, wzi<rmf> wzi4) {
        return new nsw(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new nsv((a) this.a.get(), (sgb) this.b.get(), (sso) this.c.get(), (rmf) this.d.get());
    }
}
