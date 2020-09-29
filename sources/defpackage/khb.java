package defpackage;

import android.content.Context;

/* renamed from: khb reason: default package */
public final class khb implements wig<a> {
    private final wzi<Context> a;
    private final wzi<atd> b;

    public static a a(Context context, atd atd) {
        return (a) wil.a(CC.a(context, atd), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get(), (atd) this.b.get());
    }
}
