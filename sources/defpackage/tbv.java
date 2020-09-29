package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: tbv reason: default package */
public final class tbv implements wig<tbu> {
    private final wzi<umw> a;
    private final wzi<a> b;

    private tbv(wzi<umw> wzi, wzi<a> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static tbv a(wzi<umw> wzi, wzi<a> wzi2) {
        return new tbv(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new tbu((umw) this.a.get(), (a) this.b.get());
    }
}
