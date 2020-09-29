package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;

/* renamed from: agu reason: default package */
public final class agu implements agz {
    private final Method a;
    private final Object b;

    public static agz a(Context context) {
        Class b2 = b(context);
        if (b2 == null) {
            return null;
        }
        Object a2 = a(context, b2);
        if (a2 == null) {
            return null;
        }
        Method a3 = a(b2);
        if (a3 == null) {
            return null;
        }
        return new agu(a2, a3);
    }

    private static Class b(Context context) {
        try {
            return context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement");
        } catch (Exception unused) {
            return null;
        }
    }

    private static Object a(Context context, Class cls) {
        try {
            return cls.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(cls, new Object[]{context});
        } catch (Exception unused) {
            return null;
        }
    }

    private static Method a(Class cls) {
        try {
            return cls.getDeclaredMethod("logEventInternal", new Class[]{String.class, String.class, Bundle.class});
        } catch (Exception unused) {
            return null;
        }
    }

    private agu(Object obj, Method method) {
        this.b = obj;
        this.a = method;
    }

    public final void a(String str, Bundle bundle) {
        a("fab", str, bundle);
    }

    public final void a(String str, String str2, Bundle bundle) {
        try {
            this.a.invoke(this.b, new Object[]{str, str2, bundle});
        } catch (Exception unused) {
        }
    }
}
