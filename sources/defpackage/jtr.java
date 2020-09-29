package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Looper;

/* renamed from: jtr reason: default package */
public final class jtr {
    public static Context a(Context context) {
        fbp.a(fbp.a(context) instanceof Application, (Object) "Not an application context.");
        return context;
    }

    public static void a(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void b(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }
}
