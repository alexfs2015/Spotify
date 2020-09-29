package defpackage;

import android.os.Looper;

/* renamed from: jzn reason: default package */
public final class jzn implements vua<Looper> {
    private static final jzn a = new jzn();

    public static jzn a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Looper) vuf.a(Looper.getMainLooper(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
