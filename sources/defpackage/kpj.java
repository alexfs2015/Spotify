package defpackage;

import android.app.Activity;

/* renamed from: kpj reason: default package */
public final class kpj implements wig<kpi> {
    private final wzi<Activity> a;
    private final wzi<szl> b;

    private kpj(wzi<Activity> wzi, wzi<szl> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static kpj a(wzi<Activity> wzi, wzi<szl> wzi2) {
        return new kpj(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new kpi((Activity) this.a.get(), (szl) this.b.get());
    }
}
