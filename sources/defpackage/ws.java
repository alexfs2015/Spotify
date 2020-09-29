package defpackage;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: ws reason: default package */
public final class ws {
    private static Object a(Class cls, String str, Object obj, Class[] clsArr, Object... objArr) {
        Method method = cls.getMethod(str, clsArr);
        if (method == null) {
            return null;
        }
        return method.invoke(obj, objArr);
    }

    public static Object a(Object obj, String str, Class[] clsArr, Object... objArr) {
        return a(obj.getClass(), str, obj, clsArr, objArr);
    }

    public static Object a(String str, String str2, Class[] clsArr, Object... objArr) {
        return a(Class.forName(str), str2, null, clsArr, objArr);
    }

    public static Object a(String str, Class[] clsArr, Object... objArr) {
        try {
            return Class.forName(str).getConstructor(clsArr).newInstance(objArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(Context context) {
        try {
            return (String) a(c(context), "getId", (Class[]) null, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Map<String, String> a(Context context, wf wfVar) {
        try {
            Object a = a("com.adjust.sdk.imei.Util", "getImeiParameters", new Class[]{Context.class, wf.class}, context, wfVar);
            Class<Map> cls = Map.class;
            if (a != null && cls.isInstance(a)) {
                return (Map) a;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static Boolean b(Context context) {
        try {
            boolean z = false;
            Boolean bool = (Boolean) a(c(context), "isLimitAdTrackingEnabled", (Class[]) null, new Object[0]);
            if (bool == null) {
                return null;
            }
            if (!bool.booleanValue()) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Object c(Context context) {
        return a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[]{Context.class}, context);
    }
}
