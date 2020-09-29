package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: phg reason: default package */
public final class phg implements wig<phf> {
    private final wzi<lon> a;
    private final wzi<xil> b;
    private final wzi<a> c;

    private phg(wzi<lon> wzi, wzi<xil> wzi2, wzi<a> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static phg a(wzi<lon> wzi, wzi<xil> wzi2, wzi<a> wzi3) {
        return new phg(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new phf((lon) this.a.get(), (xil) this.b.get(), (a) this.c.get());
    }
}
