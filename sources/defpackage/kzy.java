package defpackage;

import android.os.Looper;

/* renamed from: kzy reason: default package */
public final class kzy implements vua<Looper> {
    private static final kzy a = new kzy();

    public static kzy a() {
        return a;
    }

    public static Looper b() {
        return (Looper) vuf.a(Looper.getMainLooper(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}
