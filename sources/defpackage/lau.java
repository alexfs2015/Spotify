package defpackage;

import android.content.Context;

/* renamed from: lau reason: default package */
public final class lau implements wig<lar> {
    private final wzi<Context> a;
    private final wzi<sso> b;
    private final wzi<fqn> c;

    private lau(wzi<Context> wzi, wzi<sso> wzi2, wzi<fqn> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static lar a(Context context, sso sso, fqn fqn) {
        return (lar) wil.a(CC.a(context, sso, fqn), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static lau a(wzi<Context> wzi, wzi<sso> wzi2, wzi<fqn> wzi3) {
        return new lau(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get(), (sso) this.b.get(), (fqn) this.c.get());
    }
}
