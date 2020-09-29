package com.comscore.android.vce;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.widget.ScrollView;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.UUID;

class k {
    static final String a = "Droid";
    final p b;
    w c;
    t d;
    WebViewReferences e;

    class a {
        public ScrollView scrollView;

        a() {
        }
    }

    k(p pVar) {
        this.b = pVar;
    }

    private Runnable d(final WebView webView) {
        return new Runnable() {
            public void run() {
                try {
                    k.this.e.setStatus(Integer.valueOf(webView.hashCode()), k.this.isWebViewAliveWarningMessage(webView));
                } catch (Exception unused) {
                }
            }
        };
    }

    /* access modifiers changed from: 0000 */
    public int a(int i) {
        return Math.round(((float) i) / this.c.i());
    }

    /* access modifiers changed from: 0000 */
    public int a(Context context) {
        if (f()) {
            return !j().acceptCookie() ? 1 : 2;
        }
        CookieSyncManager.createInstance(context);
        return !j().acceptCookie() ? 1 : 0;
    }

    /* access modifiers changed from: 0000 */
    public int a(View view, View view2, int[][] iArr, boolean z, int i) {
        ae b2 = b();
        View view3 = null;
        int i2 = 0;
        if (z && iArr.length == 5) {
            View a2 = !a(iArr[0], b2, i) ? a(view, iArr[0][0], iArr[0][1]) : null;
            View a3 = !a(iArr[1], b2, i) ? a(view, iArr[1][0], iArr[1][1]) : null;
            View a4 = !a(iArr[2], b2, i) ? a(view, iArr[2][0], iArr[2][1]) : null;
            View a5 = !a(iArr[3], b2, i) ? a(view, iArr[3][0], iArr[3][1]) : null;
            if (!a(iArr[4], b2, i)) {
                view3 = a(view, iArr[4][0], iArr[4][1]);
            }
            if (a2 != null && a(view2, a2)) {
                i2 = 1;
            }
            if (a3 != null && a(view2, a3)) {
                i2++;
            }
            if (a4 != null && a(view2, a4)) {
                i2++;
            }
            if (a5 != null && a(view2, a5)) {
                i2++;
            }
            return (view3 == null || !a(view2, view3)) ? i2 : i2 + 1;
        } else if (iArr.length != 1) {
            return 0;
        } else {
            if (!a(iArr[0], b2, i)) {
                view3 = a(view, iArr[0][0], iArr[0][1]);
            }
            return (view3 == null || !a(view2, view3)) ? 0 : 1;
        }
    }

    /* access modifiers changed from: 0000 */
    public int a(Object obj) {
        try {
            Method declaredMethod = Class.forName("androidx.viewpager.widget.ViewPager").getDeclaredMethod("getCurrentItem", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(obj, new Object[0])).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* access modifiers changed from: 0000 */
    public View a(Activity activity) {
        View b2 = b(activity);
        if (b2 != null) {
            return b2.getRootView();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public View a(View view, int i, int i2) {
        int i3;
        if (!(view instanceof ViewGroup)) {
            return view;
        }
        int[] b2 = b(view);
        boolean z = false;
        int i4 = i - b2[0];
        int i5 = i2 - b2[1];
        if (a((Object) view, "androidx.viewpager.widget.ViewPager")) {
            i3 = b().a() * a((Object) view);
            z = true;
        } else {
            i3 = 0;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (!(childAt instanceof ViewStub) && childAt.getVisibility() == 0) {
                Rect rect = new Rect();
                childAt.getHitRect(rect);
                if (z) {
                    int width = rect.width();
                    rect.left -= i3;
                    rect.right = rect.left + width;
                }
                if (rect.contains(i4, i5)) {
                    return a(childAt, i, i2);
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: 0000 */
    public ak a(WebView webView) {
        ak akVar = new ak(this.b);
        try {
            akVar.a(this.d.a(webView));
            this.d.a(webView, akVar);
        } catch (Exception unused) {
            akVar.b();
        }
        return akVar;
    }

    /* access modifiers changed from: 0000 */
    public HashSet<WebView> a(View view, String[] strArr, String[] strArr2) {
        HashSet<WebView> hashSet = new HashSet<>();
        a(hashSet, view, strArr, strArr2);
        return hashSet;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        WebViewReferences webViewReferences = this.e;
        if (webViewReferences != null) {
            webViewReferences.dispose();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(View view, View view2, a aVar) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount && aVar.scrollView == null; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (!(childAt instanceof ScrollView)) {
                    if (childAt instanceof ViewGroup) {
                        if (childAt instanceof ViewStub) {
                        }
                    }
                } else if (a(childAt, view2)) {
                    aVar.scrollView = (ScrollView) childAt;
                    return;
                }
                a(childAt, view2, aVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(WebViewReferences webViewReferences) {
        this.e = webViewReferences;
    }

    /* access modifiers changed from: 0000 */
    public void a(t tVar) {
        this.d = tVar;
    }

    /* access modifiers changed from: 0000 */
    public void a(w wVar) {
        this.c = wVar;
    }

    /* access modifiers changed from: 0000 */
    public void a(Integer num) {
        WebViewReferences webViewReferences = this.e;
        if (webViewReferences != null) {
            webViewReferences.disposeReference(num);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(HashSet<WebView> hashSet, View view, String[] strArr, String[] strArr2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof WebView) {
                    WebView webView = (WebView) childAt;
                    if (strArr2 != null) {
                        if (!a(childAt, strArr2)) {
                        }
                    } else if (strArr != null && !b(childAt, strArr)) {
                    }
                    hashSet.add(webView);
                } else if ((childAt instanceof ViewGroup) && !(childAt instanceof ViewStub)) {
                    a(hashSet, childAt, strArr, strArr2);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Activity activity, String str) {
        return activity.getLocalClassName().contains(str);
    }

    /* access modifiers changed from: 0000 */
    public boolean a(View view) {
        return g() ? !view.isAttachedToWindow() : view.getHandler() == null;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(View view, View view2) {
        if (view != null && view2 != null) {
            if (view2 != view) {
                while (!view2.getClass().getName().contains("PhoneWindow$DecorView")) {
                    if (view2 != view) {
                        if (view2.getParent() == null || !(view2.getParent() instanceof View)) {
                            break;
                        }
                        view2 = (View) view2.getParent();
                    } else {
                        return true;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(View view, String[] strArr) {
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            try {
                if (Class.forName(strArr[i]).isInstance(view)) {
                    return true;
                }
                i++;
            } catch (ClassNotFoundException unused) {
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Object obj, String str) {
        try {
            return Class.forName(str).isInstance(obj);
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(int[] iArr, ae aeVar, int i) {
        return iArr[0] > aeVar.a() || iArr[0] < 0 || iArr[1] > aeVar.b() || iArr[1] < i;
    }

    /* access modifiers changed from: 0000 */
    public float[] a(Activity activity, View view) {
        float f;
        View a2 = a(activity);
        float f2 = 1.0f;
        if (a2 != null) {
            View view2 = (View) view.getParent();
            f = 1.0f;
            while (view2 != a2 && view2 != null) {
                f2 *= view2.getScaleX();
                f *= view2.getScaleY();
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
                view2 = (View) view2.getParent();
            }
        } else {
            f = 1.0f;
        }
        return new float[]{f2, f};
    }

    /* access modifiers changed from: 0000 */
    public View b(Activity activity) {
        if (activity != null) {
            Window window = activity.getWindow();
            if (window != null) {
                return window.peekDecorView();
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public WebView b(Context context) {
        WebView webView = new WebView(context);
        webView.getSettings().setJavaScriptEnabled(true);
        return webView;
    }

    /* access modifiers changed from: 0000 */
    public ScrollView b(View view, View view2) {
        a aVar = new a();
        a(view, view2, aVar);
        return aVar.scrollView;
    }

    /* access modifiers changed from: 0000 */
    public ae b() {
        return this.c.g();
    }

    /* access modifiers changed from: 0000 */
    public String b(Object obj) {
        return obj == null ? "" : obj.getClass().getName();
    }

    /* access modifiers changed from: 0000 */
    public boolean b(View view, String[] strArr) {
        for (String str : strArr) {
            String str2 = "WebView";
            if (str.equals(str2)) {
                return true;
            }
            for (Class cls = view.getClass(); !cls.getSimpleName().equals(str2); cls = cls.getSuperclass()) {
                if (cls.getSimpleName().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public boolean b(WebView webView) {
        return j().acceptThirdPartyCookies(webView);
    }

    /* access modifiers changed from: 0000 */
    public int[] b(View view) {
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    /* access modifiers changed from: 0000 */
    public View c(Activity activity) {
        View b2 = b(activity);
        if (b2 != null) {
            return b2.findViewById(16908290);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public ae c() {
        return this.c.h();
    }

    /* access modifiers changed from: 0000 */
    public ae c(View view) {
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        ae aeVar = new ae(iArr[0], iArr[1], view.getWidth(), view.getHeight(), view.getAlpha());
        return aeVar;
    }

    /* access modifiers changed from: 0000 */
    public void c(WebView webView) {
        j().setAcceptThirdPartyCookies(webView, true);
    }

    /* access modifiers changed from: 0000 */
    public int d() {
        return this.c.j().b();
    }

    /* access modifiers changed from: 0000 */
    public String d(View view) {
        String str;
        String str2 = "__";
        if (!a(view) && view.getParent() != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                StringBuilder sb = new StringBuilder(str2);
                sb.append(parent.getClass().getName());
                str = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(view.getClass().getName());
                sb2.append(str2);
                sb2.append(view.getClass().getSuperclass().getName());
                sb2.append(str);
                return sb2.toString();
            }
        }
        str = "";
        StringBuilder sb22 = new StringBuilder();
        sb22.append(view.getClass().getName());
        sb22.append(str2);
        sb22.append(view.getClass().getSuperclass().getName());
        sb22.append(str);
        return sb22.toString();
    }

    /* access modifiers changed from: 0000 */
    public boolean d(Activity activity) {
        View b2 = b(activity);
        if (b2 != null) {
            return b2.hasWindowFocus();
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public int e() {
        return this.c.l().b();
    }

    /* access modifiers changed from: 0000 */
    public String e(View view) {
        return Integer.toString(view.hashCode());
    }

    /* access modifiers changed from: 0000 */
    public boolean f() {
        return VERSION.SDK_INT >= 21;
    }

    /* access modifiers changed from: 0000 */
    public boolean g() {
        return VERSION.SDK_INT >= 19;
    }

    /* access modifiers changed from: 0000 */
    public boolean h() {
        return VERSION.SDK_INT >= 16;
    }

    /* access modifiers changed from: 0000 */
    public boolean i() {
        return VERSION.SDK_INT >= 15;
    }

    public boolean isWebViewAlive(WebView webView, s sVar) {
        Integer valueOf = Integer.valueOf(webView.hashCode());
        Boolean status = this.e.getStatus(valueOf);
        if (status != null && !status.booleanValue()) {
            return status.booleanValue();
        }
        if (ad.a()) {
            Boolean valueOf2 = Boolean.valueOf(isWebViewAliveWarningMessage(webView));
            this.e.setStatus(valueOf, valueOf2.booleanValue());
            return valueOf2.booleanValue();
        }
        sVar.b(d(webView));
        return true;
    }

    public boolean isWebViewAliveWarningMessage(WebView webView) {
        boolean z;
        boolean z2 = (webView == null || webView.getSettings() == null) ? false : true;
        try {
            if (webView.getUrl().length() > 0) {
                z = true;
                return !z2 && z;
            }
        } catch (Exception unused) {
        }
        z = false;
        if (!z2) {
        }
    }

    /* access modifiers changed from: 0000 */
    public CookieManager j() {
        return CookieManager.getInstance();
    }

    /* access modifiers changed from: 0000 */
    public String k() {
        return UUID.randomUUID().toString();
    }

    /* access modifiers changed from: 0000 */
    public long l() {
        return System.currentTimeMillis();
    }

    /* access modifiers changed from: 0000 */
    public Activity m() {
        return this.d.a();
    }
}
