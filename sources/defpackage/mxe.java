package defpackage;

import android.content.Context;

/* renamed from: mxe reason: default package */
public final class mxe implements vua<myn> {
    private final wlc<Context> a;
    private final wlc<Integer> b;
    private final wlc<Integer> c;

    private mxe(wlc<Context> wlc, wlc<Integer> wlc2, wlc<Integer> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static mxe a(wlc<Context> wlc, wlc<Integer> wlc2, wlc<Integer> wlc3) {
        return new mxe(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        Context context = (Context) this.a.get();
        int intValue = ((Integer) this.b.get()).intValue();
        return (myn) vuf.a(jtc.c(context) ? new myv(intValue, ((Integer) this.c.get()).intValue()) : new myu(intValue), "Cannot return null from a non-@Nullable @Provides method");
    }
}
