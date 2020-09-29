package com.comscore.android.vce;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class g {
    static final String a = "Core";
    WebViewReferences b = this.c.a();
    h c;
    p d;
    b e;
    v f = this.c.a(this.d);
    u g = this.c.d();
    s h;
    j i;
    i j;
    o k;
    k l = this.c.b(this.d);
    t m;
    r n;
    w o;
    q p;
    ac q;
    m r;
    a s;
    ag t;
    af u;
    f v;
    boolean w;

    g(h hVar, b bVar, p pVar, Context context) {
        Application application = (Application) context;
        this.c = hVar;
        this.e = bVar;
        this.d = pVar;
        this.g.a(context);
        this.g.a(application);
        this.h = this.c.a(this.g, this.f);
        this.m = this.c.a(this.h, this.l);
        this.l.a(this.m);
        this.l.a(this.b);
        this.i = this.c.a(this.d, this.h, this.l);
        this.j = this.c.a(this.d, this.e, this.h, this.i);
        this.k = this.c.a(this.d, this.e, this.h, this.j, this.l);
        this.k.f();
        this.w = false;
        if (this.e.d()) {
            b();
        }
    }

    /* access modifiers changed from: 0000 */
    public Activity a(View view) {
        Activity activity = (Activity) view.getContext();
        return activity == null ? this.h.d() : activity;
    }

    /* access modifiers changed from: 0000 */
    public aa a(View view, Activity activity) {
        View view2 = view;
        ah a2 = this.g.a(view);
        Activity activity2 = activity;
        ah a3 = this.g.a(activity2);
        aa a4 = this.c.a(this.d, a("5", this.l.d(view)), this.l, this.s, e(), this.h, this.j, activity2, view2, this.q);
        this.i.a(a3, a2, a4);
        return a4;
    }

    /* access modifiers changed from: 0000 */
    public final v a() {
        return this.f;
    }

    /* access modifiers changed from: 0000 */
    public y a(String str, String str2) {
        y a2 = this.c.a(this.d, this.l);
        a2.b(str);
        a2.c(str2);
        a2.a(this.p.I());
        a2.f(this.e.k());
        a2.e(this.e.j());
        return a2;
    }

    /* access modifiers changed from: 0000 */
    public void a(View view, String str) {
        if (this.e.f()) {
            a(false);
            Activity a2 = a(view);
            if (a2 != null) {
                ah a3 = this.g.a(view);
                String valueOf = String.valueOf(this.l.l());
                int e2 = e(str);
                if (this.i.a(a3)) {
                    x b2 = this.i.b(a3);
                    if (b2 instanceof aa) {
                        aa aaVar = (aa) b2;
                        if (aaVar.e()) {
                            aaVar.h(str);
                        } else {
                            aaVar.g(str);
                            aaVar.a(e2, valueOf);
                        }
                    }
                    return;
                }
                aa a4 = a(view, a2);
                a4.g(str);
                a4.a(e2, valueOf);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(View view, String str, String str2, HashMap<String, String> hashMap) {
        if (this.e.f()) {
            boolean z = false;
            a(false);
            Activity a2 = a(view);
            if (a2 != null) {
                ah a3 = this.g.a(view);
                StringBuilder sb = new StringBuilder();
                sb.append(this.l.l());
                String sb2 = sb.toString();
                int e2 = e(str2);
                if (this.i.a(a3)) {
                    x b2 = this.i.b(a3);
                    if (b2 instanceof ab) {
                        ab abVar = (ab) b2;
                        if (b2.e()) {
                            abVar.a(str, str2, sb2, hashMap);
                        } else {
                            abVar.g(str2);
                            abVar.a(str, hashMap);
                            abVar.a(e2, sb2);
                        }
                    }
                    return;
                }
                if (this.l.a(a2, "MraidVideoPlayerActivity")) {
                    ab i2 = this.i.i();
                    if (i2 != null) {
                        z = true;
                        i2.a(str, str2, sb2, hashMap);
                    }
                }
                if (!z) {
                    ab b3 = b(view, a2);
                    b3.g(str2);
                    b3.a(str, hashMap);
                    b3.a(e2, sb2);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(WebView webView, Activity activity) {
        a(true);
        if (!this.i.a((View) webView)) {
            b(webView, activity);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(WebView webView, String str) {
        if (this.e.d() || !this.e.e()) {
            this.e.d();
            return;
        }
        this.e.a(str);
        a(webView, a((View) webView));
    }

    /* access modifiers changed from: 0000 */
    public void a(WebView webView, boolean z) {
        this.e.d(z);
        a(webView, "3");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.comscore.android.vce.ae r5, boolean r6) {
        /*
            r4 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0014
            com.comscore.android.vce.w r6 = r4.o
            com.comscore.android.vce.ae r6 = r6.j()
            int r1 = r6.b()
            if (r1 <= 0) goto L_0x0014
            int r6 = r6.b()
            goto L_0x0015
        L_0x0014:
            r6 = 0
        L_0x0015:
            com.comscore.android.vce.w r1 = r4.o
            com.comscore.android.vce.ae r1 = r1.l()
            int r2 = r1.b()
            if (r2 <= 0) goto L_0x003a
            com.comscore.android.vce.k r2 = r4.l
            com.comscore.android.vce.ae r2 = r2.b()
            int r5 = r5.b()
            int r3 = r1.b()
            int r5 = r5 + r3
            int r2 = r2.b()
            if (r5 > r2) goto L_0x003a
            int r0 = r1.b()
        L_0x003a:
            com.comscore.android.vce.i r5 = r4.j
            r5.a(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comscore.android.vce.g.a(com.comscore.android.vce.ae, boolean):void");
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        this.j.a(str);
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        if (!this.e.h()) {
            d();
            this.f.e(this.k.e());
            this.f.f(this.i.m());
            this.f.h(i());
        }
        boolean z2 = false;
        a aVar = this.s;
        if (z) {
            aVar.e();
            this.e.f(true);
            if (this.v == null) {
                h hVar = this.c;
                this.v = hVar.a(this.d, hVar.a(this.l), this.i);
                this.v.a();
                this.f.d(this.v.b());
                this.j.a(this.v);
                z2 = true;
            }
        } else {
            aVar.f();
        }
        if (!this.e.h()) {
            this.e.e(true);
            this.j.g();
            return;
        }
        if (z && z2) {
            this.j.h();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(View[] viewArr, boolean z) {
        this.e.d(z);
        if (this.e.d() || !this.e.e()) {
            this.e.d();
            return;
        }
        for (WebView webView : viewArr) {
            if (webView instanceof WebView) {
                a(webView, "4");
            } else {
                this.d.b("Analytics", "the view is not an instance of a WebView");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public ab b(View view, Activity activity) {
        View view2 = view;
        ah a2 = this.g.a(view);
        Activity activity2 = activity;
        ah a3 = this.g.a(activity2);
        ab b2 = this.c.b(this.d, a("5", this.l.d(view)), this.l, this.s, e(), this.h, this.j, activity2, view2, this.q);
        this.i.a(a3, a2, b2);
        return b2;
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        if (!this.f.k()) {
            this.f.g(c());
        }
        this.j.f();
    }

    /* access modifiers changed from: 0000 */
    public void b(View view) {
        if (this.e.f()) {
            ah a2 = this.g.a(view);
            if (this.i.a(a2)) {
                this.i.b(a2).q();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(final View view, final String str) {
        this.f.b(new Runnable() {
            public void run() {
                try {
                    g.this.a(view, str);
                } catch (Exception unused) {
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void b(View view, String str, String str2, HashMap<String, String> hashMap) {
        final View view2 = view;
        final String str3 = str;
        final String str4 = str2;
        final HashMap<String, String> hashMap2 = hashMap;
        AnonymousClass2 r0 = new Runnable() {
            public void run() {
                try {
                    g.this.a(view2, str3, str4, hashMap2);
                } catch (Exception unused) {
                }
            }
        };
        this.f.b(r0);
    }

    /* access modifiers changed from: 0000 */
    public void b(WebView webView, Activity activity) {
        WebView webView2 = webView;
        ah a2 = this.g.a((View) webView2);
        Activity activity2 = activity;
        ah a3 = this.g.a(activity2);
        String d2 = this.l.d((View) webView2);
        StringBuilder sb = new StringBuilder("cs_");
        sb.append(this.l.k());
        String sb2 = sb.toString();
        this.v.a(sb2, "-2");
        y a4 = a(this.e.b(), d2);
        l e2 = e();
        am a5 = this.c.a(this.d, this.h, this.l, this.c.a(this.d, this.h, this.l, webView2), webView);
        h hVar = this.c;
        p pVar = this.d;
        k kVar = this.l;
        a aVar = this.s;
        s sVar = this.h;
        i iVar = this.j;
        f fVar = this.v;
        y yVar = a4;
        l lVar = e2;
        s sVar2 = sVar;
        i iVar2 = iVar;
        f fVar2 = fVar;
        String str = sb2;
        ah ahVar = a2;
        ah ahVar2 = a3;
        z a6 = hVar.a(pVar, yVar, a5, kVar, aVar, lVar, sVar2, iVar2, activity2, webView2, fVar2, sb2, this.e.g());
        this.i.a(ahVar2, ahVar, a6, str);
    }

    /* access modifiers changed from: 0000 */
    public void b(final WebView webView, final boolean z) {
        this.f.b(new Runnable() {
            public void run() {
                try {
                    g.this.a(webView, z);
                } catch (Exception unused) {
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void b(final String str) {
        this.f.b(new Runnable() {
            public void run() {
                g.this.a(str);
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void b(final View[] viewArr, final boolean z) {
        this.f.b(new Runnable() {
            public void run() {
                try {
                    g.this.a(viewArr, z);
                } catch (Exception unused) {
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public Runnable c() {
        return new Runnable() {
            public void run() {
                try {
                    g.this.h();
                } catch (Exception unused) {
                }
            }
        };
    }

    /* access modifiers changed from: 0000 */
    public void c(final View view) {
        this.f.b(new Runnable() {
            public void run() {
                try {
                    g.this.b(view);
                } catch (Exception unused) {
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void c(String str) {
        this.j.b(str);
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        this.n = this.c.a(this.d, this.h);
        this.o = this.c.a(this.h);
        this.l.a(this.o);
        this.p = this.c.a(this.d, this.h, this.j, this.o);
        this.q = this.c.a(this.e, this.p);
        this.r = this.c.e();
        this.s = this.c.a(this.d, this.h, this.n, this.q, this.r, this.l, this.p);
        this.t = this.c.b(this.d, this.h, this.l);
        this.u = this.c.b(this.d, this.h);
        this.e.a(this.l.a(this.g.a()));
        this.j.a(this.p);
        this.j.a(this.t);
        this.j.a(this.u);
    }

    /* access modifiers changed from: 0000 */
    public void d(final String str) {
        this.f.b(new Runnable() {
            public void run() {
                g.this.c(str);
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public int e(String str) {
        Matcher matcher = Pattern.compile("cvt=(\\d{1,3}+)&").matcher(str);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        }
        return 50;
    }

    /* access modifiers changed from: 0000 */
    public l e() {
        return this.c.a(this.d, this.l, this.o.i());
    }

    /* access modifiers changed from: 0000 */
    public String f() {
        return this.e.l();
    }

    /* access modifiers changed from: 0000 */
    public String g() {
        return this.e.m();
    }

    /* access modifiers changed from: 0000 */
    public void h() {
        Activity c2 = this.g.c();
        if (c2 != null) {
            View a2 = this.l.a(c2);
            if (a2 != null) {
                HashSet a3 = this.l.a(a2, this.e.c(), (String[]) null);
                Iterator it = a3.iterator();
                while (it.hasNext()) {
                    WebView webView = (WebView) it.next();
                    if (!this.i.a(this.g.a((View) webView))) {
                        a(webView, c2);
                    }
                }
                a3.clear();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public Runnable i() {
        return new Runnable() {
            public void run() {
                try {
                    g.this.j();
                } catch (Exception unused) {
                }
            }
        };
    }

    /* access modifiers changed from: 0000 */
    public void j() {
        if (this.i.h()) {
            Activity c2 = this.g.c();
            if (c2 != null) {
                View c3 = this.l.c(c2);
                if (c3 != null) {
                    ae c4 = this.l.c(c3);
                    if (c4.b() > 0) {
                        boolean z = c4.c() == 0;
                        if (this.w != z) {
                            this.w = z;
                            a(c4, this.w);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void k() {
        if (this.e.d()) {
            b();
        }
    }

    /* access modifiers changed from: 0000 */
    public void l() {
        this.f.b(new Runnable() {
            public void run() {
                try {
                    g.this.k();
                } catch (Exception unused) {
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void m() {
        if (this.e.d()) {
            b();
        }
    }

    /* access modifiers changed from: 0000 */
    public void n() {
        this.f.b(new Runnable() {
            public void run() {
                try {
                    g.this.m();
                } catch (Exception unused) {
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void o() {
        try {
            if (this.i != null) {
                this.i.b();
            }
            if (this.v != null) {
                this.v.c();
            }
            if (this.k != null) {
                this.k.a();
            }
            if (this.p != null) {
                this.p.a();
            }
            if (this.t != null) {
                this.t.a();
            }
            if (this.i != null) {
                this.i.a();
            }
            if (this.f != null) {
                this.f.a();
            }
            if (this.o != null) {
                this.o.a();
            }
        } catch (Exception unused) {
        }
    }
}
