package defpackage;

import android.view.View.OnLongClickListener;

/* renamed from: tkw reason: default package */
public final class tkw implements vua<tkv> {
    private final wlc<tkz> a;
    private final wlc<OnLongClickListener> b;
    private final wlc<tlg> c;

    private tkw(wlc<tkz> wlc, wlc<OnLongClickListener> wlc2, wlc<tlg> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static tkw a(wlc<tkz> wlc, wlc<OnLongClickListener> wlc2, wlc<tlg> wlc3) {
        return new tkw(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new tkv((tkz) this.a.get(), (OnLongClickListener) this.b.get(), (tlg) this.c.get());
    }
}
