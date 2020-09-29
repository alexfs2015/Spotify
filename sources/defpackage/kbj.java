package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: kbj reason: default package */
public final class kbj implements wig<Handler> {
    private static final kbj a = new kbj();

    public static kbj a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Handler) wil.a(new Handler(Looper.getMainLooper()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
