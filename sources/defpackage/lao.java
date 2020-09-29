package defpackage;

import android.content.Context;

/* renamed from: lao reason: default package */
public final class lao implements wig<lal> {
    private final wzi<Context> a;
    private final wzi<sso> b;
    private final wzi<fqn> c;

    private lao(wzi<Context> wzi, wzi<sso> wzi2, wzi<fqn> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static lal a(Context context, sso sso, fqn fqn) {
        return (lal) wil.a(CC.a(context, sso, fqn), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static lao a(wzi<Context> wzi, wzi<sso> wzi2, wzi<fqn> wzi3) {
        return new lao(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get(), (sso) this.b.get(), (fqn) this.c.get());
    }
}
