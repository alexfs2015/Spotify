package defpackage;

import android.os.Handler;

/* renamed from: itn reason: default package */
public final class itn implements wig<Handler> {
    private static final itn a = new itn();

    public static itn a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Handler) wil.a(new Handler(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
