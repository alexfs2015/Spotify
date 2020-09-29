package defpackage;

import android.content.Context;

/* renamed from: ldq reason: default package */
public final class ldq implements wig<vuq> {
    private final wzi<Context> a;
    private final wzi<giz> b;
    private final wzi<gfj> c;

    private ldq(wzi<Context> wzi, wzi<giz> wzi2, wzi<gfj> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static ldq a(wzi<Context> wzi, wzi<giz> wzi2, wzi<gfj> wzi3) {
        return new ldq(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        Context context = (Context) this.a.get();
        gfj gfj = (gfj) this.c.get();
        return (vuq) wil.a(new vuq(context.getApplicationContext(), ((giz) this.b.get()).b, gfj), "Cannot return null from a non-@Nullable @Provides method");
    }
}
