package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: hbd reason: default package */
public final class hbd implements wig<hbc> {
    private final wzi<lon> a;
    private final wzi<a> b;

    private hbd(wzi<lon> wzi, wzi<a> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hbd a(wzi<lon> wzi, wzi<a> wzi2) {
        return new hbd(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new hbc((lon) this.a.get(), (a) this.b.get());
    }
}
