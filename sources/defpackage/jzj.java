package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: jzj reason: default package */
public final class jzj implements vua<Handler> {
    private static final jzj a = new jzj();

    public static jzj a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Handler) vuf.a(new Handler(Looper.getMainLooper()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
