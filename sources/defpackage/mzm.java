package defpackage;

import android.view.View;

/* renamed from: mzm reason: default package */
public final class mzm implements vua<View> {
    private final wlc<mzz> a;

    private mzm(wlc<mzz> wlc) {
        this.a = wlc;
    }

    public static mzm a(wlc<mzz> wlc) {
        return new mzm(wlc);
    }

    public final /* synthetic */ Object get() {
        return (View) vuf.a(((mzz) this.a.get()).b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
