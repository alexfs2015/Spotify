package defpackage;

import android.content.Context;

/* renamed from: ncf reason: default package */
public final class ncf implements wig<ndo> {
    private final wzi<Context> a;
    private final wzi<Integer> b;
    private final wzi<Integer> c;

    private ncf(wzi<Context> wzi, wzi<Integer> wzi2, wzi<Integer> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static ncf a(wzi<Context> wzi, wzi<Integer> wzi2, wzi<Integer> wzi3) {
        return new ncf(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        Context context = (Context) this.a.get();
        int intValue = ((Integer) this.b.get()).intValue();
        return (ndo) wil.a(jvi.c(context) ? new ndw(intValue, ((Integer) this.c.get()).intValue()) : new ndv(intValue), "Cannot return null from a non-@Nullable @Provides method");
    }
}
