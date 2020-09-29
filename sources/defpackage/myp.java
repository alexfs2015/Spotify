package defpackage;

import android.app.Activity;

/* renamed from: myp reason: default package */
public final class myp implements wig<gwr> {
    private final wzi<mxn> a;
    private final wzi<gwm> b;
    private final wzi<Activity> c;
    private final wzi<rok> d;

    private myp(wzi<mxn> wzi, wzi<gwm> wzi2, wzi<Activity> wzi3, wzi<rok> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static myp a(wzi<mxn> wzi, wzi<gwm> wzi2, wzi<Activity> wzi3, wzi<rok> wzi4) {
        return new myp(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return (gwr) wil.a(new nau((Activity) this.c.get(), (gwm) this.b.get(), (mxn) this.a.get(), (rok) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
