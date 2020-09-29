package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: loo reason: default package */
public final class loo implements wig<lon> {
    private final wzi<lok> a;
    private final wzi<los> b;
    private final wzi<hhc> c;
    private final wzi<a> d;

    private loo(wzi<lok> wzi, wzi<los> wzi2, wzi<hhc> wzi3, wzi<a> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static loo a(wzi<lok> wzi, wzi<los> wzi2, wzi<hhc> wzi3, wzi<a> wzi4) {
        return new loo(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new lon((lok) this.a.get(), (los) this.b.get(), (hhc) this.c.get(), (a) this.d.get());
    }
}
