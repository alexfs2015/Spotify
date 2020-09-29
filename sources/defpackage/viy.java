package defpackage;

import android.content.Context;

/* renamed from: viy reason: default package */
public final class viy implements vua<vix> {
    private final wlc<viv> a;
    private final wlc<Context> b;

    private viy(wlc<viv> wlc, wlc<Context> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static viy a(wlc<viv> wlc, wlc<Context> wlc2) {
        return new viy(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new vix((viv) this.a.get(), (Context) this.b.get());
    }
}
