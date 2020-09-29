package defpackage;

import android.os.Handler;

/* renamed from: iis reason: default package */
public final class iis implements wig<Handler> {
    private static final iis a = new iis();

    public static iis a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Handler) wil.a(new Handler(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
