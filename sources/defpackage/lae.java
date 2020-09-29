package defpackage;

import android.content.Context;

/* renamed from: lae reason: default package */
public final class lae implements vua<vhl> {
    private final wlc<Context> a;
    private final wlc<gho> b;
    private final wlc<gdy> c;

    private lae(wlc<Context> wlc, wlc<gho> wlc2, wlc<gdy> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static lae a(wlc<Context> wlc, wlc<gho> wlc2, wlc<gdy> wlc3) {
        return new lae(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        Context context = (Context) this.a.get();
        gdy gdy = (gdy) this.c.get();
        return (vhl) vuf.a(new vhl(context.getApplicationContext(), ((gho) this.b.get()).b, gdy), "Cannot return null from a non-@Nullable @Provides method");
    }
}
