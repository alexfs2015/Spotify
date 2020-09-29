package com.comscore.android.vce;

import android.app.Activity;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.Field;
import java.util.Map;

class t {
    final k a;
    final s b;
    private final String c = "Reflex";

    t(s sVar, k kVar) {
        this.b = sVar;
        this.a = kVar;
    }

    static boolean a(String str, Object obj, Class... clsArr) {
        try {
            if (obj.getClass().getMethod(str, clsArr) != null) {
                return true;
            }
        } catch (NoSuchMethodException unused) {
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public Activity a() {
        try {
            Class cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            if (invoke != null) {
                Field declaredField = cls.getDeclaredField("mActivities");
                declaredField.setAccessible(true);
                Map map = (Map) declaredField.get(invoke);
                if (map != null && map.size() > 0) {
                    Field field = null;
                    for (Object next : map.values()) {
                        if (field == null) {
                            field = next.getClass().getDeclaredField("paused");
                            field.setAccessible(true);
                        }
                        if (!field.getBoolean(next)) {
                            Field declaredField2 = next.getClass().getDeclaredField("activity");
                            declaredField2.setAccessible(true);
                            Activity activity = (Activity) declaredField2.get(next);
                            if (activity != null && this.a.d(activity)) {
                                return activity;
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public WebViewClient a(WebView webView) {
        Object obj;
        try {
            Class cls = webView.getClass();
            while (true) {
                if (cls.getCanonicalName().equals("android.webkit.WebView")) {
                    break;
                }
                cls = cls.getSuperclass();
                if (cls == null) {
                    cls = webView.getClass();
                    break;
                }
            }
            String str = "mCallbackProxy";
            String str2 = "mWebViewClient";
            if (this.a.i()) {
                if (!this.a.h()) {
                    Field declaredField = cls.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(webView);
                    Field declaredField2 = obj2.getClass().getDeclaredField(str2);
                    declaredField2.setAccessible(true);
                    obj = declaredField2.get(obj2);
                    return (WebViewClient) obj;
                }
            }
            String str3 = "mProvider";
            if (this.a.h()) {
                if (!this.a.g()) {
                    Field declaredField3 = cls.getDeclaredField(str3);
                    declaredField3.setAccessible(true);
                    Object obj3 = declaredField3.get(webView);
                    Field declaredField4 = obj3.getClass().getDeclaredField(str);
                    declaredField4.setAccessible(true);
                    Object obj4 = declaredField4.get(obj3);
                    Field declaredField5 = obj4.getClass().getDeclaredField(str2);
                    declaredField5.setAccessible(true);
                    obj = declaredField5.get(obj4);
                    return (WebViewClient) obj;
                }
            }
            if (!this.a.g()) {
                return null;
            }
            Field declaredField6 = cls.getDeclaredField(str3);
            declaredField6.setAccessible(true);
            Object obj5 = declaredField6.get(webView);
            Field declaredField7 = obj5.getClass().getDeclaredField("mContentsClientAdapter");
            declaredField7.setAccessible(true);
            Object obj6 = declaredField7.get(obj5);
            Field declaredField8 = obj6.getClass().getDeclaredField(str2);
            declaredField8.setAccessible(true);
            WebViewClient webViewClient = (WebViewClient) declaredField8.get(obj6);
            if (webViewClient == null || !webViewClient.getClass().getSimpleName().equals("NullWebViewClient")) {
                return webViewClient;
            }
            return null;
        } catch (NoSuchFieldException e) {
            throw e;
        } catch (IllegalAccessException e2) {
            throw e2;
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(WebView webView, ak akVar) {
        String str;
        String str2;
        Class cls = webView.getClass();
        while (true) {
            str = "mWebViewThread";
            if (!cls.getCanonicalName().equals("android.webkit.WebView")) {
                if (akVar.d()) {
                    try {
                        cls.getDeclaredMethod("setWebViewClient", new Class[]{WebViewClient.class});
                        akVar.c();
                    } catch (NoSuchMethodException unused) {
                    }
                }
                if (akVar.f()) {
                    try {
                        if (!this.a.i() || this.a.h()) {
                            if (this.a.h()) {
                                str2 = "mProvider";
                            }
                            akVar.e();
                        } else {
                            str2 = "mCallbackProxy";
                        }
                        cls.getDeclaredField(str2);
                        akVar.e();
                    } catch (NoSuchFieldException unused2) {
                    }
                }
                if (this.a.g() && akVar.h()) {
                    try {
                        cls.getDeclaredField(str);
                        akVar.g();
                    } catch (NoSuchFieldException unused3) {
                    }
                }
                cls = cls.getSuperclass();
                if (cls == null) {
                    cls = webView.getClass();
                    break;
                }
            } else {
                break;
            }
        }
        if (!akVar.d() && this.a.g() && akVar.h()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                if (declaredField.getType() == Looper.class) {
                    Looper looper = (Looper) declaredField.get(webView);
                    if (looper != null && looper != Looper.getMainLooper()) {
                        akVar.i();
                    }
                }
            } catch (Exception unused4) {
            }
        }
    }
}
