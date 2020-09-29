package defpackage;

import android.content.Context;

/* renamed from: ujo reason: default package */
public final class ujo implements wig<aqq> {
    private final wzi<ujb> a;
    private final wzi<Context> b;

    private ujo(wzi<ujb> wzi, wzi<Context> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ujo a(wzi<ujb> wzi, wzi<Context> wzi2) {
        return new ujo(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return ((ujb) this.a.get()).create(new aqp((Context) this.b.get()), new bbr());
    }
}
