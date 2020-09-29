package com.comscore.android.vce;

import android.app.Activity;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.regex.Pattern;

class aa extends x {
    private static final Pattern A = Pattern.compile("\\[CVM_AD_WIDTH\\]", 2);
    private static final Pattern B = Pattern.compile("\\[CVM_AD_HEIGHT\\]", 2);
    private static final Pattern C = Pattern.compile("\\[CVM_AD_X\\]", 2);
    private static final Pattern D = Pattern.compile("\\[CVM_AD_Y\\]", 2);
    private static final Pattern E = Pattern.compile("\\[CVM_SC_WIDTH\\]", 2);
    private static final Pattern F = Pattern.compile("\\[CVM_SC_HEIGHT\\]", 2);
    private static final Pattern G = Pattern.compile("\\[CVM_EV_TIME\\]", 2);
    private static final Pattern H = Pattern.compile("\\[CVM_VIDEO_EVENT\\]", 2);
    private static final String I = "cvce://vce_m=";
    static final String k = "gross";
    static final String l = "measurable";
    private static final Pattern v = Pattern.compile("^(http(s)?:)?//[^?/#]*scorecardresearch\\.com", 2);
    private static final Pattern w = Pattern.compile("^[^?#]+[?#][^?#]*\\bcvm=1\\b", 2);
    private static final Pattern x = Pattern.compile("\\[CVM_AD_EVENT\\]", 2);
    private static final Pattern y = Pattern.compile("\\[CVM_AD_VI\\]", 2);
    private static final Pattern z = Pattern.compile("\\[CVM_AD_FOCUS\\]", 2);
    private WebViewClient J;
    /* access modifiers changed from: private */
    public WebView K;
    private boolean L;
    private long M;
    private long N;
    private boolean O;
    private ScheduledFuture P;
    private long Q;
    private long R;
    ArrayList<String> m;
    final String n;
    String o;
    String p;
    boolean q;
    boolean r;
    boolean s;
    final ac t;
    private String u = "NativeTrack";

    class a {
        a() {
        }

        @JavascriptInterface
        public void wvFailed() {
            aa.this.i.a((Runnable) new Runnable() {
                public void run() {
                    try {
                        aa.this.V();
                    } catch (Exception unused) {
                    }
                }
            });
        }

        @JavascriptInterface
        public void wvReady() {
            aa.this.i.a((Runnable) new Runnable() {
                public void run() {
                    try {
                        aa.this.U();
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    class b extends WebViewClient {
        b() {
        }

        public void onPageFinished(WebView webView, String str) {
            aa.this.X();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return aa.this.b(str);
        }
    }

    aa(p pVar, y yVar, k kVar, a aVar, l lVar, s sVar, i iVar, Activity activity, View view, ac acVar) {
        super(pVar, yVar, kVar, aVar, lVar, sVar, iVar, activity, view);
        this.t = acVar;
        this.m = new ArrayList<>();
        this.n = this.f.e(view);
        this.o = Ad.DEFAULT_SKIPPABLE_AD_DELAY;
        this.O = false;
        this.q = true;
        this.s = false;
        this.r = false;
        this.Q = 0;
        this.R = 0;
        this.M = 0;
        this.N = 0;
        this.L = false;
    }

    private void ap() {
        this.o = Ad.DEFAULT_SKIPPABLE_AD_DELAY;
        this.O = false;
        this.q = true;
        this.s = false;
        this.r = false;
        this.Q = 0;
        this.R = 0;
        this.M = 0;
        this.N = 0;
        this.L = false;
        ArrayList<String> arrayList = this.m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.J = null;
        al();
    }

    /* access modifiers changed from: 0000 */
    public void P() {
        K();
    }

    /* access modifiers changed from: 0000 */
    public void T() {
        WebView b2 = this.f.b(this.i.c());
        a(new ah<>(b2));
        if (this.f.f()) {
            this.f.c(b2);
        }
        b2.addJavascriptInterface(new a(), "VCEJSObj");
        this.J = new b();
        b2.setWebViewClient(this.J);
        this.K = b2;
        if (e()) {
            ah();
        }
    }

    /* access modifiers changed from: 0000 */
    public void U() {
        Z();
    }

    /* access modifiers changed from: 0000 */
    public void V() {
        ab();
    }

    /* access modifiers changed from: 0000 */
    public boolean W() {
        return this.r;
    }

    /* access modifiers changed from: 0000 */
    public void X() {
        this.M = this.f.l();
        this.N = this.M;
        long j = 5000 - (this.R - this.Q);
        if (j < 1) {
            ab();
            return;
        }
        if (j > 5000) {
            j = 5000;
        }
        if (j < 250) {
            j = 250;
        }
        StringBuilder sb = new StringBuilder("(function() {\n        var w = window, ti = Date.now(),\n                maxtime = ");
        sb.append(j);
        sb.append(",\n                bridge = 'VCEJSObj");
        sb.append("';\n        function _check_() {\n                if (w.ns_ && w.ns_.mvce && w.ns_.mvce.R === true) {\n                        w[bridge].wvReady();\n                } else {\n                        (Date.now() - ti) >= maxtime ? w[bridge].wvFailed() : setTimeout(_check_, 250);\n                }\n        };\n        if (w[bridge]) _check_();\n})();");
        String sb2 = sb.toString();
        WebView webView = this.K;
        StringBuilder sb3 = new StringBuilder("javascript:");
        sb3.append(sb2);
        webView.loadUrl(sb3.toString());
    }

    /* access modifiers changed from: 0000 */
    public void Y() {
        q();
    }

    /* access modifiers changed from: 0000 */
    public void Z() {
        this.N = this.f.l();
        aa();
    }

    /* access modifiers changed from: 0000 */
    public String a(String str, y yVar) {
        return a(str, yVar, k);
    }

    /* access modifiers changed from: 0000 */
    public final String a(String str, y yVar, String str2) {
        return a(str, yVar, str2, (String) null);
    }

    /* access modifiers changed from: 0000 */
    public final String a(String str, y yVar, String str2, String str3) {
        if (str2 != null) {
            str = x.matcher(str).replaceAll(str2);
        }
        String replaceAll = G.matcher(D.matcher(C.matcher(F.matcher(E.matcher(B.matcher(A.matcher(z.matcher(y.matcher(str).replaceAll(yVar.y())).replaceAll(String.valueOf(yVar.s()))).replaceAll(String.valueOf(yVar.k()))).replaceAll(String.valueOf(yVar.l()))).replaceAll(String.valueOf(yVar.m()))).replaceAll(String.valueOf(yVar.n()))).replaceAll(String.valueOf(yVar.f()))).replaceAll(String.valueOf(yVar.g()))).replaceAll(String.valueOf(this.f.l()));
        return str3 != null ? H.matcher(replaceAll).replaceAll(str3) : replaceAll;
    }

    /* access modifiers changed from: 0000 */
    public void a(int i, String str) {
        this.p = str;
        a(i);
        if (!this.L) {
            this.L = true;
            this.i.b(new Runnable() {
                public void run() {
                    try {
                        aa.this.T();
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(WebView webView) {
        try {
            if (this.f.isWebViewAliveWarningMessage(webView)) {
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("about:blank");
                webView.destroy();
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, WebView webView, HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
        try {
            a(hashMap, hashMap2);
            String format = String.format("ns_.mvce_m('%s', '%s');", new Object[]{ad.b(str), ad.a((Map<?, ?>) hashMap).toString()});
            a aVar = this.g;
            StringBuilder sb = new StringBuilder();
            sb.append(this.u);
            sb.append("-init-vce-js");
            aVar.b(webView, format, sb.toString());
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, String str2, String str3, WebView webView, HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
        a(hashMap, hashMap2);
        String format = String.format("ns_.mvce.Tr('%s','%s','%s','%s');", new Object[]{str3, str, ad.b(str2), ad.a((Map<?, ?>) hashMap).toString()});
        a aVar = this.g;
        StringBuilder sb = new StringBuilder();
        sb.append(this.u);
        sb.append("-fire-video-event");
        aVar.b(webView, format, sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void a(HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
        if (hashMap != null && hashMap2 != null) {
            for (String str : hashMap2.keySet()) {
                hashMap.put(str, hashMap2.get(str));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z2, HashMap<String, String> hashMap) {
        af();
        am();
        b(z2, hashMap);
    }

    /* access modifiers changed from: 0000 */
    public void aa() {
        a(false, null);
    }

    /* access modifiers changed from: 0000 */
    public void ab() {
        this.s = true;
        this.r = true;
        this.N = this.f.l();
        ac();
    }

    /* access modifiers changed from: 0000 */
    public void ac() {
        af();
        ae();
        ad();
    }

    /* access modifiers changed from: 0000 */
    public void ad() {
    }

    /* access modifiers changed from: 0000 */
    public final void ae() {
        y j = j();
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (e(str)) {
                str = c(f(str));
            } else if (d(str)) {
                str = a(str, j);
            }
            this.g.a(str);
        }
    }

    /* access modifiers changed from: 0000 */
    public void af() {
        this.o = String.valueOf((this.R - this.Q) + (this.N - this.M));
    }

    /* access modifiers changed from: 0000 */
    public String ag() {
        return this.o;
    }

    /* access modifiers changed from: 0000 */
    public void ah() {
        if (this.g.b()) {
            ak();
            return;
        }
        this.Q = this.f.l();
        this.R = this.Q;
        this.i.a(new Runnable() {
            public void run() {
                aa.this.ai();
            }
        }, 500, 500);
    }

    /* access modifiers changed from: 0000 */
    public void ai() {
        if (!this.q) {
            this.P.cancel(true);
            this.P = null;
        }
        this.R = this.f.l();
        if (this.R - this.Q > 5000) {
            aj();
            return;
        }
        if (this.g.b()) {
            ak();
        }
    }

    /* access modifiers changed from: 0000 */
    public void aj() {
        this.q = false;
        this.r = true;
        ac();
    }

    /* access modifiers changed from: 0000 */
    public void ak() {
        this.q = false;
        if (!this.O) {
            this.O = true;
            this.i.b(new Runnable() {
                public void run() {
                    StringBuilder sb = new StringBuilder("<!DOCTYPE html><html><head></head><body><script type=\"text/javascript\">");
                    sb.append(aa.this.g.c());
                    sb.append("</script></script></body></html>");
                    aa.this.K.loadDataWithBaseURL("http://localhost/", sb.toString(), "text/html", "UTF-8", null);
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    public void al() {
        final WebView webView = this.K;
        if (webView != null) {
            this.K = null;
            this.i.a(new Runnable() {
                public void run() {
                    try {
                        aa.this.i.b(new Runnable() {
                            public void run() {
                                aa.this.a(webView);
                            }
                        });
                    } catch (Exception unused) {
                    }
                }
            }, 3000);
        }
    }

    /* access modifiers changed from: 0000 */
    public void am() {
        o();
    }

    /* access modifiers changed from: 0000 */
    public String an() {
        if (this.m.size() == 0) {
            return null;
        }
        return (String) this.m.get(0);
    }

    /* access modifiers changed from: 0000 */
    public List<String> ao() {
        return this.m;
    }

    /* access modifiers changed from: 0000 */
    public void b(boolean z2, HashMap<String, String> hashMap) {
        HashMap hashMap2 = new HashMap();
        hashMap2.put("iv", String.valueOf(z2));
        hashMap2.put("pid", this.n);
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            a((String) it.next(), this.K, hashMap2, hashMap);
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean b(String str) {
        int i;
        if (str == null) {
            return false;
        }
        String str2 = I;
        int indexOf = str.indexOf(str2);
        if (str.length() <= 0 || indexOf == -1) {
            return false;
        }
        String str3 = "";
        String replace = str.substring(indexOf).replace(str2, str3);
        if (replace != null && replace.length() > 0) {
            String trim = replace.trim();
            if (trim.equals("unload")) {
                Y();
            } else {
                String str4 = "cvt=";
                if (trim.startsWith(str4)) {
                    try {
                        i = Math.round(Float.valueOf(trim.replace(str4, str3)).floatValue());
                    } catch (Exception unused) {
                        i = 50;
                    }
                    d(i);
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public String c(String str) {
        return str;
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        ap();
    }

    /* access modifiers changed from: 0000 */
    public void d(int i) {
        c(i);
    }

    /* access modifiers changed from: 0000 */
    public final boolean d(String str) {
        return str != null && w.matcher(str).find();
    }

    /* access modifiers changed from: 0000 */
    public final boolean e(String str) {
        return str != null && v.matcher(str).find();
    }

    /* access modifiers changed from: 0000 */
    public String f(String str) {
        return this.t.a(str, this.p, this.o);
    }

    /* access modifiers changed from: 0000 */
    public void g(String str) {
        if (this.m.size() > 0) {
            this.m.clear();
        }
        this.m.add(str);
    }

    /* access modifiers changed from: 0000 */
    public void h(String str) {
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return;
            }
        }
        this.m.add(str);
    }

    /* access modifiers changed from: 0000 */
    public void n() {
        if (this.K != null) {
            ah();
        }
    }

    /* access modifiers changed from: 0000 */
    public void r() {
        ap();
    }
}
