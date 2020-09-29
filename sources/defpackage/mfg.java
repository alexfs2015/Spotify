package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: mfg reason: default package */
public final class mfg implements wig<mff> {
    private final wzi<gwp> a;
    private final wzi<gwr> b;
    private final wzi<gwm> c;
    private final wzi<a> d;

    private mfg(wzi<gwp> wzi, wzi<gwr> wzi2, wzi<gwm> wzi3, wzi<a> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static mfg a(wzi<gwp> wzi, wzi<gwr> wzi2, wzi<gwm> wzi3, wzi<a> wzi4) {
        return new mfg(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new mff((gwp) this.a.get(), (gwr) this.b.get(), (gwm) this.c.get(), (a) this.d.get());
    }
}
