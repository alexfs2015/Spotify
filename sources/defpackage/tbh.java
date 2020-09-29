package defpackage;

import android.view.Window;

/* renamed from: tbh reason: default package */
public final class tbh implements vua<tbg> {
    private final wlc<Window> a;

    private tbh(wlc<Window> wlc) {
        this.a = wlc;
    }

    public static tbh a(wlc<Window> wlc) {
        return new tbh(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tbg((Window) this.a.get());
    }
}
