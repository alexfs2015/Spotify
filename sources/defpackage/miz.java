package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: miz reason: default package */
public final class miz implements wig<miy> {
    private final wzi<a> a;

    private miz(wzi<a> wzi) {
        this.a = wzi;
    }

    public static miz a(wzi<a> wzi) {
        return new miz(wzi);
    }

    public final /* synthetic */ Object get() {
        return new miy((a) this.a.get());
    }
}
