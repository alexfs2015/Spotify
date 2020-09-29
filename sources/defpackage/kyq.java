package defpackage;

import androidx.lifecycle.Lifecycle;

/* renamed from: kyq reason: default package */
public final class kyq implements vua<Lifecycle> {
    private static final kyq a = new kyq();

    public static kyq a() {
        return a;
    }

    public static Lifecycle b() {
        return (Lifecycle) vuf.a(CC.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}
