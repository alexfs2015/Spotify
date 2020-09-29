package defpackage;

import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: hia reason: default package */
public final class hia implements vua<Looper> {
    private static final hia a = new hia();

    public static hia a() {
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
        return (Looper) vuf.a(looper, "Cannot return null from a non-@Nullable @Provides method");
    }
}
