package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Looper;

/* renamed from: jrh reason: default package */
public final class jrh {
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

    public static Context a(Context context) {
        fay.a(fay.a(context) instanceof Application, (Object) "Not an application context.");
        return context;
    }
}
