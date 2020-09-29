package defpackage;

import android.os.Looper;

/* renamed from: kbn reason: default package */
public final class kbn implements wig<Looper> {
    private static final kbn a = new kbn();

    public static kbn a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Looper) wil.a(Looper.getMainLooper(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
