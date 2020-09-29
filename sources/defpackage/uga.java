package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: uga reason: default package */
public final class uga implements wig<ufz> {
    private final wzi<lon> a;
    private final wzi<a> b;

    private uga(wzi<lon> wzi, wzi<a> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static uga a(wzi<lon> wzi, wzi<a> wzi2) {
        return new uga(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ufz((lon) this.a.get(), (a) this.b.get());
    }
}
