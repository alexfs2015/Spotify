package com.comscore.android.vce;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.webkit.WebView;
import java.util.HashMap;

class ab extends aa {
    private String u = "NativeVideoTrack";
    private String v;
    private final HashMap<String, a> w = new HashMap<>();
    private HashMap<String, String> x;
    private boolean y = false;

    class a {
        String a;
        HashMap<String, String> b;
        String c;
        String d;
        String e;
        String f;
        String g;
        String h;

        private a() {
        }
    }

    ab(p pVar, y yVar, k kVar, a aVar, l lVar, s sVar, i iVar, Activity activity, View view, ac acVar) {
        super(pVar, yVar, kVar, aVar, lVar, sVar, iVar, activity, view, acVar);
        this.e.b(false);
        view.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                ab.this.aq();
                return false;
            }
        });
    }

    private void aw() {
        HashMap<String, a> hashMap = this.w;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.v = null;
        this.x = null;
    }

    /* access modifiers changed from: 0000 */
    public boolean E() {
        Activity d = this.i.d();
        return d == null || !this.y || !this.f.a(d, "MraidVideoPlayerActivity");
    }

    /* access modifiers changed from: 0000 */
    public String a(String str, y yVar) {
        return a(str, yVar, "video", this.v);
    }

    /* access modifiers changed from: 0000 */
    public void a(a aVar) {
        String str = aVar.h;
        String str2 = aVar.d;
        if (e(str)) {
            str = this.t.a(str, aVar.g, aVar.f, aVar.c, str2, this.o);
        } else if (d(str)) {
            str = a(str, j(), "video", aVar.a);
        }
        this.g.a(str);
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, String str2, String str3, HashMap<String, String> hashMap) {
        a aVar = new a();
        aVar.a = str;
        aVar.c = "video";
        StringBuilder sb = new StringBuilder("v_");
        sb.append(str);
        aVar.d = sb.toString();
        aVar.e = this.o;
        aVar.f = this.p;
        aVar.g = str3;
        aVar.h = str2;
        aVar.b = hashMap;
        if (W()) {
            at();
            a(aVar);
        } else if (f()) {
            WebView webView = (WebView) this.d.get();
            if (webView != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("ns_ad_wt", this.o);
                hashMap2.put("bufferTime", this.o);
                a(str, str2, this.n, webView, hashMap2, hashMap);
            }
        } else {
            this.w.put(str, aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, HashMap<String, String> hashMap) {
        if (this.v == null) {
            this.v = str;
        }
        if (this.x == null) {
            this.x = hashMap;
        }
    }

    /* access modifiers changed from: 0000 */
    public void aa() {
        a(true, this.x);
        as();
    }

    /* access modifiers changed from: 0000 */
    public void ad() {
        at();
    }

    /* access modifiers changed from: 0000 */
    public boolean ap() {
        return this.y;
    }

    /* access modifiers changed from: 0000 */
    public void aq() {
        this.j.l();
        b(true);
    }

    /* access modifiers changed from: 0000 */
    public int ar() {
        return this.w.size();
    }

    /* access modifiers changed from: 0000 */
    public void as() {
        if (this.v != null) {
            WebView webView = (WebView) this.d.get();
            if (webView != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("ns_ad_wt", this.o);
                hashMap.put("bufferTime", this.o);
                a(this.v, an(), this.n, webView, hashMap, this.x);
                if (this.w.size() > 0) {
                    for (a aVar : this.w.values()) {
                        a(aVar.a, aVar.h, this.n, webView, hashMap, aVar.b);
                    }
                    this.w.clear();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void at() {
        if (this.w.size() > 0) {
            for (a a2 : this.w.values()) {
                a(a2);
            }
            this.w.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    public void au() {
        z();
        this.e.b(true);
        L();
    }

    /* access modifiers changed from: 0000 */
    public void av() {
        this.e.b(false);
        if (this.y) {
            this.y = false;
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(boolean z) {
        this.y = z;
    }

    /* access modifiers changed from: 0000 */
    public String c(String str) {
        if (this.v == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder("v_");
        sb.append(this.v);
        return String.format("%s&ns_ad_event=%s&ns_ad_vevent=%s", new Object[]{str, "video", sb.toString()});
    }

    /* access modifiers changed from: 0000 */
    public void c(boolean z) {
        Activity h = h();
        if (h != null) {
            s sVar = this.i;
            Activity e = z ? sVar.e() : sVar.d();
            if (e != null) {
                if (e != h) {
                    d(z);
                } else if (z) {
                    au();
                } else {
                    av();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        super.d();
        aw();
    }

    /* access modifiers changed from: 0000 */
    public void d(boolean z) {
        this.e.a(z);
        L();
    }

    /* access modifiers changed from: 0000 */
    public void r() {
        super.r();
        aw();
    }
}
