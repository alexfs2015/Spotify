package defpackage;

import android.content.Context;

/* renamed from: led reason: default package */
public final class led implements wig<String> {
    private final wzi<Context> a;

    private led(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static String a(Context context) {
        return (String) wil.a(context.getClass().getSimpleName(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static led a(wzi<Context> wzi) {
        return new led(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get());
    }
}
