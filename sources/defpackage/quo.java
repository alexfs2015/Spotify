package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: quo reason: default package */
public final class quo implements wig<qun> {
    private final wzi<a> a;
    private final wzi<quk> b;

    private quo(wzi<a> wzi, wzi<quk> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static quo a(wzi<a> wzi, wzi<quk> wzi2) {
        return new quo(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new qun((a) this.a.get(), (quk) this.b.get());
    }
}
