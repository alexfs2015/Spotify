package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: hfu reason: default package */
public final class hfu implements wig<hft> {
    private final wzi<a> a;
    private final wzi<vjj> b;

    private hfu(wzi<a> wzi, wzi<vjj> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hfu a(wzi<a> wzi, wzi<vjj> wzi2) {
        return new hfu(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new hft((a) this.a.get(), (vjj) this.b.get());
    }
}
