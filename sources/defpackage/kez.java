package defpackage;

import android.content.Context;

/* renamed from: kez reason: default package */
public final class kez implements vua<a> {
    private final wlc<Context> a;
    private final wlc<asm> b;

    public static a a(Context context, asm asm) {
        return (a) vuf.a(CC.a(context, asm), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get(), (asm) this.b.get());
    }
}
