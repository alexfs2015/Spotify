package defpackage;

import androidx.lifecycle.Lifecycle;

/* renamed from: lbz reason: default package */
public final class lbz implements wig<Lifecycle> {
    private static final lbz a = new lbz();

    public static lbz a() {
        return a;
    }

    public static Lifecycle b() {
        return (Lifecycle) wil.a(CC.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}
