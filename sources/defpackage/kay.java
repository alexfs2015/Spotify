package defpackage;

import android.os.Looper;

/* renamed from: kay reason: default package */
public final class kay implements wig<Looper> {
    private static final kay a = new kay();

    public static kay a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Looper) wil.a(Looper.getMainLooper(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
