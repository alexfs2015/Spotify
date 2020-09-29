package com.moat.analytics.mobile;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.View;
import android.webkit.WebView;
import com.moat.analytics.mobile.base.functional.a;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class bf implements be, q {
    private View a;
    private final WebView b;
    private boolean c;
    private final p d;
    private final a e;
    private final ap f;
    private a<String> g;

    bf(View view, WebView webView, boolean z, a aVar, ap apVar) {
        this(view, webView, z, new C0090r(webView.getContext(), apVar), aVar, apVar);
    }

    bf(View view, WebView webView, boolean z, p pVar, a aVar, ap apVar) {
        com.moat.analytics.mobile.base.asserts.a.a(view);
        com.moat.analytics.mobile.base.asserts.a.a(webView);
        com.moat.analytics.mobile.base.asserts.a.a(aVar);
        com.moat.analytics.mobile.base.asserts.a.a(pVar);
        apVar.b();
        this.e = aVar;
        this.a = view;
        this.b = webView;
        this.c = z;
        this.d = pVar;
        this.f = apVar;
        this.g = a.a();
    }

    private static String a(Rect rect) {
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right - rect.left;
        int i4 = rect.bottom - rect.top;
        StringBuilder sb = new StringBuilder("{\"");
        sb.append("x\"");
        String str = ":";
        sb.append(str);
        sb.append(i);
        sb.append(',');
        sb.append('\"');
        sb.append("y\"");
        sb.append(str);
        sb.append(i2);
        sb.append(',');
        sb.append('\"');
        sb.append("w\"");
        sb.append(str);
        sb.append(i3);
        sb.append(',');
        sb.append('\"');
        sb.append("h\"");
        sb.append(str);
        sb.append(i4);
        sb.append('}');
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sb);
        return sb2.toString();
    }

    private static String a(Map<String, String> map, boolean z) {
        StringBuilder sb = new StringBuilder("{");
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (sb.length() > 1) {
                sb.append(',');
            }
            sb.append('\"');
            sb.append(str);
            sb.append('\"');
            sb.append(':');
            if (!z) {
                sb.append(str2);
            } else {
                sb.append('\"');
                sb.append(str2);
                sb.append('\"');
            }
        }
        sb.append("}");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sb);
        return sb2.toString();
    }

    private void a(Map<String, String> map, String str, Rect rect) {
        map.put(str, a(b(rect)));
    }

    private Rect b(Rect rect) {
        float f2 = h().density;
        if (f2 == 0.0f) {
            return rect;
        }
        return new Rect(Math.round(((float) rect.left) / f2), Math.round(((float) rect.top) / f2), Math.round(((float) rect.right) / f2), Math.round(((float) rect.bottom) / f2));
    }

    private Rect c(Rect rect) {
        Rect i = i();
        this.a.getGlobalVisibleRect(i);
        i.left = Math.min(Math.max(0, i.left), rect.right);
        i.right = Math.min(Math.max(0, i.right), rect.right);
        i.top = Math.min(Math.max(0, i.top), rect.bottom);
        i.bottom = Math.min(Math.max(0, i.bottom), rect.bottom);
        return i;
    }

    private String e() {
        if (this.g.c()) {
            return (String) this.g.b();
        }
        String str = "_unknown_";
        try {
            Context context = this.b.getContext();
            str = context.getPackageManager().getApplicationLabel(context.getApplicationContext().getApplicationInfo()).toString();
            this.g = a.a(str);
        } catch (Exception e2) {
            com.moat.analytics.mobile.base.exception.a.a(e2);
        }
        return str;
    }

    private boolean f() {
        return this.a.isShown() && !this.e.a();
    }

    private Rect g() {
        DisplayMetrics h = h();
        return new Rect(0, 0, h.widthPixels, h.heightPixels);
    }

    private DisplayMetrics h() {
        return this.a.getContext().getResources().getDisplayMetrics();
    }

    private Rect i() {
        return new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public bd a(String str) {
        String str2;
        String[] split = str.split(":");
        if (split.length != 2) {
            return bd.a;
        }
        String str3 = split[0];
        int i = 1;
        String str4 = split[1];
        if (str3.equals("gvr")) {
            HashMap hashMap = new HashMap();
            try {
                Rect g2 = g();
                Rect c2 = c(g2);
                Rect c3 = c();
                a(hashMap, "screen", g2);
                a(hashMap, "visible", c2);
                a(hashMap, "maybe", c2);
                a(hashMap, "view", c3);
                if (!f()) {
                    i = 0;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                hashMap.put("inFocus", sb.toString());
                DisplayMetrics h = h();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(h.density);
                hashMap.put("dr", sb2.toString());
                str2 = a(hashMap, false);
            } catch (Exception unused) {
                str2 = "{}";
            }
            return new bd(str2, str4);
        } else if (!str3.equals("gmd")) {
            return bd.a;
        } else {
            Map d2 = d();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("ar", d2.get("versionHash"));
            hashMap2.put("lw", d2.get("appName"));
            hashMap2.put("lu", d2.get("namespace"));
            hashMap2.put("sv", d2.get("version"));
            hashMap2.put("ma", d2.get("isNative"));
            hashMap2.put("av", d2.get("deviceOS"));
            return new bd(a(hashMap2, true), str4);
        }
    }

    public String a() {
        try {
            return a(d(), true);
        } catch (Exception unused) {
            return "{}";
        }
    }

    public void a(View view) {
        String str;
        if (this.f.b()) {
            StringBuilder sb = new StringBuilder("changing view to ");
            if (view != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(view.getClass().getSimpleName());
                sb2.append("@");
                sb2.append(view.hashCode());
                str = sb2.toString();
            } else {
                str = "null";
            }
            sb.append(str);
        }
        this.a = view;
    }

    public boolean b() {
        this.f.b();
        boolean a2 = this.d.a("moat-bridge", this.b, this);
        if (this.f.b()) {
            StringBuilder sb = new StringBuilder("Bridge ");
            sb.append(a2 ? "" : "not ");
            sb.append("installed.");
        }
        return a2;
    }

    public Rect c() {
        int[] iArr = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.a.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, this.a.getWidth() + i, this.a.getHeight() + i2);
    }

    public Map<String, String> d() {
        HashMap hashMap = new HashMap();
        String e2 = e();
        String num = Integer.toString(VERSION.SDK_INT);
        String str = this.c ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY;
        hashMap.put("versionHash", "d6f30235ac4e8b6fcea19ae1f45844a3723e6894");
        hashMap.put("appName", e2);
        hashMap.put("namespace", "SPOT");
        hashMap.put("version", "1.7.4");
        hashMap.put("deviceOS", num);
        hashMap.put("isNative", str);
        return hashMap;
    }
}
