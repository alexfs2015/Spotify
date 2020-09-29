package defpackage;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: fd reason: default package */
public final class fd {

    /* renamed from: fd$a */
    static class a {
        private static Method a;
        private static boolean b;
        private static Method c;
        private static boolean d;

        public static IBinder a(Bundle bundle, String str) {
            if (!b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                b = true;
            }
            Method method2 = a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    a = null;
                }
            }
            return null;
        }

        public static void a(Bundle bundle, String str, IBinder iBinder) {
            if (!d) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    c = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                d = true;
            }
            Method method2 = c;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, new Object[]{str, iBinder});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    c = null;
                }
            }
        }
    }

    public static IBinder a(Bundle bundle, String str) {
        return VERSION.SDK_INT >= 18 ? bundle.getBinder(str) : a.a(bundle, str);
    }

    public static void a(Bundle bundle, String str, IBinder iBinder) {
        if (VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            a.a(bundle, str, iBinder);
        }
    }
}
