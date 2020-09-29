package com.moat.analytics.mobile;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.moat.analytics.mobile.base.exception.a;
import java.util.LinkedHashMap;
import java.util.Map;

class af implements NativeDisplayTracker {
    private WebView a;
    private be b;
    private final String c;
    private final ap d;
    private boolean e;

    public af(View view, String str, a aVar, ap apVar) {
        apVar.b();
        this.c = str;
        this.a = new WebView(view.getContext());
        WebSettings settings = this.a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        settings.setDatabaseEnabled(false);
        settings.setDomStorageEnabled(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setSaveFormData(false);
        if (VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(1);
        }
        this.d = apVar;
        bf bfVar = new bf(view, this.a, true, aVar, apVar);
        this.b = bfVar;
        this.e = false;
    }

    private static String a(int i, int i2, String str, String str2) {
        StringBuilder sb = new StringBuilder("<!DOCTYPE html>\n<html>\n<head lang=\"en\">\n    <meta charset=\"UTF-8\">\n    <title></title>\n</head>\n<body style=\"margin:0;padding:0;\">\n<div id=\"mianahwvc\" style=\"width:");
        sb.append(i);
        sb.append("px;height:");
        sb.append(i2);
        sb.append("px;\">\n    <script src=\"https://z.moatads.com/");
        sb.append(str);
        sb.append("/moatad.js#");
        sb.append(str2);
        sb.append("\" type=\"text/javascript\"></script>\n</div>\n");
        sb.append("</body>\n</html>");
        return sb.toString();
    }

    private static String a(Map<String, String> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < 8; i++) {
            StringBuilder sb = new StringBuilder("moatClientLevel");
            sb.append(i);
            String sb2 = sb.toString();
            if (map.containsKey(sb2)) {
                linkedHashMap.put(sb2, map.get(sb2));
            }
        }
        for (int i2 = 0; i2 < 8; i2++) {
            StringBuilder sb3 = new StringBuilder("moatClientSlicer");
            sb3.append(i2);
            String sb4 = sb3.toString();
            if (map.containsKey(sb4)) {
                linkedHashMap.put(sb4, map.get(sb4));
            }
        }
        for (String str : map.keySet()) {
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, (String) map.get(str));
            }
        }
        StringBuilder sb5 = new StringBuilder();
        for (String str2 : linkedHashMap.keySet()) {
            if (sb5.length() > 0) {
                sb5.append("&");
            }
            String str3 = (String) linkedHashMap.get(str2);
            sb5.append(str2);
            sb5.append('=');
            sb5.append(str3);
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(sb5);
        return sb6.toString();
    }

    private void a() {
        if (!this.e) {
            a("Shutting down.");
            this.a.destroy();
            this.a = null;
            this.b = null;
            this.e = true;
        }
    }

    private void a(String str) {
        if (this.d.b()) {
            String.format("id = %s, message = %s", new Object[]{Integer.valueOf(hashCode()), str});
        }
    }

    public void stopTracking() {
        a("Called stopTracking.");
        a();
    }

    public boolean track(Map<String, String> map) {
        boolean z = false;
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    z = this.b.b();
                    if (z) {
                        Rect c2 = this.b.c();
                        int width = c2.width();
                        int height = c2.height();
                        String a2 = a(map);
                        StringBuilder sb = new StringBuilder("Parsed ad ids = ");
                        sb.append(a2);
                        a(sb.toString());
                        this.a.loadData(a(width, height, this.c, a2), "text/html", "utf-8");
                    }
                    StringBuilder sb2 = new StringBuilder("Attempt to start tracking ad was ");
                    sb2.append(z ? "" : "un");
                    sb2.append("successful.");
                    a(sb2.toString());
                    return z;
                }
            } catch (Exception e2) {
                a.a(e2);
            }
        }
        a("adIdMap is null or empty. Shutting down.");
        a();
        return false;
    }
}
