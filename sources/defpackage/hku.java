package defpackage;

import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: hku reason: default package */
public final class hku implements wig<Looper> {
    private static final hku a = new hku();

    public static hku a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        Looper looper;
        if (a.a) {
            looper = Looper.getMainLooper();
        } else {
            HandlerThread handlerThread = new HandlerThread("backgroundUpdater");
            handlerThread.start();
            looper = handlerThread.getLooper();
        }
        return (Looper) wil.a(looper, "Cannot return null from a non-@Nullable @Provides method");
    }
}
