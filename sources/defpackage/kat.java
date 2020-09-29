package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: kat reason: default package */
public final class kat implements wig<Handler> {
    private static final kat a = new kat();

    public static kat a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Handler) wil.a(new Handler(Looper.getMainLooper()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
