package defpackage;

import android.content.Context;

/* renamed from: vwd reason: default package */
public final class vwd implements wig<vwc> {
    private final wzi<vwa> a;
    private final wzi<Context> b;

    private vwd(wzi<vwa> wzi, wzi<Context> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static vwd a(wzi<vwa> wzi, wzi<Context> wzi2) {
        return new vwd(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new vwc((vwa) this.a.get(), (Context) this.b.get());
    }
}
