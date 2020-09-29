package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: rjd reason: default package */
public final class rjd implements wig<rjc> {
    private final wzi<a> a;
    private final wzi<rmf> b;
    private final wzi<a> c;
    private final wzi<sgb> d;

    private rjd(wzi<a> wzi, wzi<rmf> wzi2, wzi<a> wzi3, wzi<sgb> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static rjd a(wzi<a> wzi, wzi<rmf> wzi2, wzi<a> wzi3, wzi<sgb> wzi4) {
        return new rjd(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new rjc(this.a, this.b, this.c, this.d);
    }
}
