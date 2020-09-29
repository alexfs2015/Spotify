package defpackage;

import android.os.Looper;

/* renamed from: jyy reason: default package */
public final class jyy implements vua<Looper> {
    private static final jyy a = new jyy();

    public static jyy a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Looper) vuf.a(Looper.getMainLooper(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
