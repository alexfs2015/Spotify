package com.comscore.android.vce;

import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

class a {
    static final String b = "gg";
    static final String c = "native";
    static final String d = "');";
    private static final String v = "Bridge";
    final p a;
    final s e;
    final r f;
    final ac g;
    final m h;
    final k i;
    final q j;
    String k;
    String l;
    boolean m = false;
    boolean n = false;
    String o;
    String p;
    boolean q;
    Set<String> r = new HashSet();
    Set<String> s = new HashSet();
    String[] t;
    C0005a u;

    /* renamed from: com.comscore.android.vce.a$a reason: collision with other inner class name */
    class C0005a implements Runnable {
        private WeakReference<WebView> b;
        private String c;
        private Boolean d = Boolean.FALSE;
        private String e;

        C0005a() {
        }

        public Boolean isInProcess() {
            return this.d;
        }

        public void run() {
            try {
                if (this.b != null) {
                    WebView webView = (WebView) this.b.get();
                    if (webView != null) {
                        a.this.a(webView, this.c, this.e);
                    }
                    this.b.clear();
                }
                this.d = Boolean.FALSE;
            } catch (Exception unused) {
            }
        }

        public synchronized void setComponents(WebView webView, String str, String str2) {
            if (!this.d.booleanValue()) {
                this.b = new WeakReference<>(webView);
                this.c = str;
                this.d = Boolean.TRUE;
                this.e = str2;
            }
        }
    }

    a(p pVar, s sVar, r rVar, ac acVar, m mVar, k kVar, q qVar) {
        this.a = pVar;
        this.e = sVar;
        this.f = rVar;
        this.g = acVar;
        this.h = mVar;
        this.i = kVar;
        this.j = qVar;
    }

    /* access modifiers changed from: private */
    public void c(String str) {
        this.h.a(str);
        this.o = this.h.b();
        this.r = this.h.c();
        this.s = this.h.d();
        this.t = this.h.e();
        String[] f2 = this.h.f();
        if (f2 == null || f2.length <= 0 || !a(this.j.z(), this.j.K(), f2)) {
            i();
        } else {
            this.e.a((Runnable) new Runnable() {
                public void run() {
                    try {
                        Vce.disable();
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    private void i() {
        int lastIndexOf = this.o.lastIndexOf("()");
        if (lastIndexOf > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.o.substring(0, lastIndexOf));
            sb.append("('");
            this.p = sb.toString();
            this.q = true;
            return;
        }
        this.q = false;
    }

    /* access modifiers changed from: 0000 */
    public String a(String str, y yVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = "','";
        sb.append(str2);
        sb.append(yVar.K());
        sb.append(str2);
        sb.append(yVar.J());
        return this.p.concat(sb.toString()).concat(d);
    }

    /* access modifiers changed from: 0000 */
    public void a(WebView webView, String str) {
        b(webView, "window.addEventListener('unload', function(e){try{if(VCEJSObj && VCEJSObj.foo == undefined){VCEJSObj.foo=1;VCEJSObj.wvUnload();}}catch(ex){}}, false);", str);
    }

    /* access modifiers changed from: 0000 */
    public void a(WebView webView, String str, y yVar, String str2) {
        if (this.q) {
            b(webView, a(str, yVar), str2);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(WebView webView, String str, String str2) {
        try {
            if (this.i.isWebViewAlive(webView, this.e)) {
                webView.loadUrl("javascript:".concat(str));
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        this.f.e(str);
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, WebView webView, String str2) {
        try {
            b(webView, b(str), str2);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        return this.f.a(b);
    }

    /* access modifiers changed from: 0000 */
    public boolean a(String str, String str2) {
        String str3 = "\\.";
        if (!(str == null || str2 == null)) {
            try {
                String[] split = str.split(str3);
                String[] split2 = str2.split(str3);
                if (split.length == split2.length) {
                    for (int i2 = 0; i2 < split.length; i2++) {
                        int parseInt = Integer.parseInt(split[i2]);
                        int parseInt2 = Integer.parseInt(split2[i2]);
                        if (parseInt < parseInt2) {
                            return true;
                        }
                        if (parseInt > parseInt2) {
                            return false;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(String str, String str2, String[] strArr) {
        if (str != null) {
            try {
                if (strArr.length != 0) {
                    if (str.trim().length() == 0) {
                        return false;
                    }
                    for (String split : strArr) {
                        String[] split2 = split.split(":");
                        if (split2.length >= 2 && split2[1].equals(str)) {
                            if (split2.length == 2) {
                                return true;
                            }
                            if (split2.length == 3) {
                                if (a(str2, split2[2])) {
                                    return true;
                                }
                            } else if (split2.length == 4 && split2[3].equals("e")) {
                                for (String equals : split2[2].split(",")) {
                                    if (str2.equals(equals)) {
                                        return true;
                                    }
                                }
                                continue;
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public String b(String str) {
        StringBuilder sb = new StringBuilder("ns_.mvce.sO('");
        sb.append(str);
        sb.append(d);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public void b(final WebView webView, final String str, final String str2) {
        if (this.u == null) {
            this.u = new C0005a();
        }
        if (ad.a()) {
            a(webView, str, str2);
        } else if (this.u.isInProcess().booleanValue()) {
            this.e.b(new Runnable() {
                public void run() {
                    a.this.a(webView, str, str2);
                }
            });
        } else {
            this.u.setComponents(webView, str, str2);
            this.e.b(this.u);
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(String str, WebView webView, String str2) {
        a(str, webView, str2);
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        return this.f.a(c);
    }

    /* access modifiers changed from: 0000 */
    public String c() {
        return this.f.c(c);
    }

    /* access modifiers changed from: 0000 */
    public String d() {
        return this.o;
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        if (!this.m) {
            this.m = true;
            if (this.k == null) {
                this.k = this.g.a(p.c ? "http://b.voicefive.com/rs/sdk/gg.js" : "https://sb.voicefive.com/rs/sdk/gg.js");
            }
            if (!this.f.b(b)) {
                this.e.c(new Runnable() {
                    public void run() {
                        try {
                            String a2 = a.this.f.a(a.b, a.this.k);
                            if (a2 != null && a2.length() > 0) {
                                a.this.c(a2);
                            }
                        } catch (Exception unused) {
                        }
                        a.this.m = false;
                    }
                });
                return;
            }
            this.m = false;
        }
    }

    /* access modifiers changed from: 0000 */
    public void f() {
        if (!this.n) {
            this.n = true;
            if (this.l == null) {
                this.l = this.g.a(p.c ? "http://b.scorecardresearch.com/rs/mobile/ntv/vce_st.js" : "https://sb.scorecardresearch.com/rs/mobile/ntv/vce_st.js");
            }
            if (!this.f.b(c)) {
                this.e.c(new Runnable() {
                    public void run() {
                        try {
                            a.this.f.a(a.c, a.this.l);
                        } catch (Exception unused) {
                        }
                        a.this.n = false;
                    }
                });
                return;
            }
            this.n = false;
        }
    }

    /* access modifiers changed from: 0000 */
    public Set<String> g() {
        return this.r;
    }

    /* access modifiers changed from: 0000 */
    public Set<String> h() {
        return this.s;
    }
}
