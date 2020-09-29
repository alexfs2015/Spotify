package defpackage;

import android.os.Looper;

/* renamed from: ldk reason: default package */
public final class ldk implements wig<Looper> {
    private static final ldk a = new ldk();

    public static ldk a() {
        return a;
    }

    public static Looper b() {
        return (Looper) wil.a(Looper.getMainLooper(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}
