package defpackage;

import android.os.Handler;

/* renamed from: ire reason: default package */
public final class ire implements vua<Handler> {
    private static final ire a = new ire();

    public static ire a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Handler) vuf.a(new Handler(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
