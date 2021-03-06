package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aik reason: default package */
final class aik implements ahr {
    final aia a;

    aik(aia aia) {
        this.a = aia;
    }

    public final boolean a() {
        Class a2 = a("com.google.android.gms.measurement.AppMeasurement");
        String str = "CrashlyticsCore";
        if (a2 == null) {
            vuu.a().d(str, "Firebase Analytics is not present; you will not see automatic logging of events before a crash occurs.");
            return false;
        }
        Object a3 = a(a2);
        if (a3 != null) {
            return a(a2, a3, "registerOnMeasurementEventListener");
        }
        vuu.a().d(str, "Could not create an instance of Firebase Analytics.");
        return false;
    }

    private Class<?> a(String str) {
        try {
            return this.a.h.getClassLoader().loadClass(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private Object a(Class<?> cls) {
        try {
            return cls.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(cls, new Object[]{this.a.h});
        } catch (Exception e) {
            vuu.a().a("CrashlyticsCore", "Could not get instance of com.google.android.gms.measurement.AppMeasurement", (Throwable) e);
            return null;
        }
    }

    private boolean a(Class<?> cls, Object obj, String str) {
        Class a2 = a("com.google.android.gms.measurement.AppMeasurement$OnEventListener");
        String str2 = "CrashlyticsCore";
        if (a2 == null) {
            vuu.a().a(str2, "Could not get class com.google.android.gms.measurement.AppMeasurement$OnEventListener");
            return false;
        }
        try {
            cls.getDeclaredMethod(str, new Class[]{a2}).invoke(obj, new Object[]{Proxy.newProxyInstance(this.a.h.getClassLoader(), new Class[]{a2}, new InvocationHandler() {
                public final Object invoke(Object obj, Method method, Object[] objArr) {
                    if (objArr.length == 4) {
                        String str = objArr[0];
                        String str2 = objArr[1];
                        Bundle bundle = objArr[2];
                        if (str != null && !str.equals("crash")) {
                            aia aia = aik.this.a;
                            try {
                                StringBuilder sb = new StringBuilder("$A$:");
                                sb.append(aik.a(str2, bundle));
                                aia.a(sb.toString());
                            } catch (JSONException unused) {
                                vvc a2 = vuu.a();
                                StringBuilder sb2 = new StringBuilder("Unable to serialize Firebase Analytics event; ");
                                sb2.append(str2);
                                a2.d("CrashlyticsCore", sb2.toString());
                            }
                        }
                        return null;
                    }
                    throw new RuntimeException("Unexpected AppMeasurement.OnEventListener signature");
                }
            })});
            return true;
        } catch (NoSuchMethodException e) {
            vvc a3 = vuu.a();
            StringBuilder sb = new StringBuilder("Expected method missing: ");
            sb.append(str);
            a3.b(str2, sb.toString(), e);
            return false;
        } catch (InvocationTargetException e2) {
            vvc a4 = vuu.a();
            StringBuilder sb2 = new StringBuilder("Cannot invoke method: ");
            sb2.append(str);
            a4.b(str2, sb2.toString(), e2);
            return false;
        } catch (IllegalAccessException e3) {
            vvc a5 = vuu.a();
            StringBuilder sb3 = new StringBuilder("Cannot access method: ");
            sb3.append(str);
            a5.b(str2, sb3.toString(), e3);
            return false;
        }
    }

    static String a(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }
}
