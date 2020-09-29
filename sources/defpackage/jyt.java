package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: jyt reason: default package */
public final class jyt implements vua<Handler> {
    private static final jyt a = new jyt();

    public static jyt a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Handler) vuf.a(new Handler(Looper.getMainLooper()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
