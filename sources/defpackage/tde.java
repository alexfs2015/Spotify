package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: tde reason: default package */
public final class tde implements wig<tdd> {
    private final wzi<a> a;

    private tde(wzi<a> wzi) {
        this.a = wzi;
    }

    public static tde a(wzi<a> wzi) {
        return new tde(wzi);
    }

    public final /* synthetic */ Object get() {
        return new tdd((a) this.a.get());
    }
}
