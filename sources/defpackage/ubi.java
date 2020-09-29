package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: ubi reason: default package */
public final class ubi implements wig<ubh> {
    private final wzi<twu> a;
    private final wzi<twp> b;
    private final wzi<iqz> c;
    private final wzi<xil> d;
    private final wzi<a> e;
    private final wzi<tww> f;

    private ubi(wzi<twu> wzi, wzi<twp> wzi2, wzi<iqz> wzi3, wzi<xil> wzi4, wzi<a> wzi5, wzi<tww> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static ubi a(wzi<twu> wzi, wzi<twp> wzi2, wzi<iqz> wzi3, wzi<xil> wzi4, wzi<a> wzi5, wzi<tww> wzi6) {
        ubi ubi = new ubi(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return ubi;
    }

    public final /* synthetic */ Object get() {
        ubh ubh = new ubh((twu) this.a.get(), (twp) this.b.get(), (iqz) this.c.get(), (xil) this.d.get(), (a) this.e.get(), (tww) this.f.get());
        return ubh;
    }
}
