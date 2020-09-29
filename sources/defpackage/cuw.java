package defpackage;

import android.net.Uri;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzcj;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map.Entry;

@cfp
/* renamed from: cuw reason: default package */
public final class cuw extends eak<cti> implements cup, cvk, cvm, cvo, cvp {
    private OnAttachStateChangeListener A;
    cti a;
    dpj b;
    bht c;
    bgi d;
    bgk e;
    cus f;
    boolean g;
    bhz h;
    cut i;
    private final Object j;
    private cuq k;
    private cur l;
    private bhg m;
    private boolean n;
    private boolean o;
    private OnGlobalLayoutListener p;
    private OnScrollChangedListener q;
    private boolean r;
    private final ccu s;
    private bla t;
    private ccm u;
    private ccw v;
    private clb w;
    private boolean x;
    private boolean y;
    private int z;

    public cuw(cti cti, boolean z2) {
        this(cti, z2, new ccu(cti, cti.s(), new dsr(cti.getContext())));
    }

    private cuw(cti cti, boolean z2, ccu ccu) {
        this.j = new Object();
        this.g = false;
        this.a = cti;
        this.n = z2;
        this.s = ccu;
        this.u = null;
    }

    private final WebResourceResponse e(cvh cvh) {
        HttpURLConnection httpURLConnection;
        URL url = new URL(cvh.a);
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Entry entry : cvh.c.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    bkc.e().a(this.a.getContext(), this.a.k().a, httpURLConnection);
                    cpg cpg = new cpg();
                    cpg.a(httpURLConnection, (byte[]) null);
                    int responseCode = httpURLConnection.getResponseCode();
                    cpg.a(httpURLConnection, responseCode);
                    if (responseCode < 300 || responseCode >= 400) {
                        bkc.e();
                    } else {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField != null) {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                cpn.a(5);
                                return null;
                            } else if (protocol.equals("http") || protocol.equals("https")) {
                                String str = "Redirecting to ";
                                String valueOf = String.valueOf(headerField);
                                if (valueOf.length() != 0) {
                                    str.concat(valueOf);
                                } else {
                                    new String(str);
                                }
                                cpn.a(3);
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                String str2 = "Unsupported scheme: ";
                                String valueOf2 = String.valueOf(protocol);
                                if (valueOf2.length() != 0) {
                                    str2.concat(valueOf2);
                                } else {
                                    new String(str2);
                                }
                                cpn.a(5);
                                return null;
                            }
                        } else {
                            throw new IOException("Missing Location header in redirect");
                        }
                    }
                } else {
                    throw new IOException("Invalid protocol.");
                }
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Too many redirects (20)");
                throw new IOException(sb.toString());
            }
        }
        bkc.e();
        return cmu.a(httpURLConnection);
    }

    private final void o() {
        if (this.A != null) {
            this.a.o().removeOnAttachStateChangeListener(this.A);
        }
    }

    private final void p() {
        if (this.k != null && ((this.x && this.z <= 0) || this.y)) {
            this.k.a(!this.y);
            this.k = null;
        }
        this.a.J();
    }

    public final bla a() {
        return this.t;
    }

    public final void a(int i2, int i3) {
        ccm ccm = this.u;
        if (ccm != null) {
            ccm.b(i2, i3);
        }
    }

    public final void a(int i2, int i3, boolean z2) {
        this.s.a(i2, i3);
        ccm ccm = this.u;
        if (ccm != null) {
            ccm.a(i2, i3, z2);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(View view, clb clb, int i2) {
        if (clb.b() && i2 > 0) {
            clb.a(view);
            if (clb.b()) {
                cmu.a.postDelayed(new cuy(this, view, clb, i2), 100);
            }
        }
    }

    public final void a(OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.j) {
            this.o = true;
            this.a.I();
            this.p = onGlobalLayoutListener;
            this.q = onScrollChangedListener;
        }
    }

    public final void a(bhj bhj) {
        boolean B = this.a.B();
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(bhj, (!B || this.a.v().c()) ? this.b : null, B ? null : this.c, this.h, this.a.k());
        a(adOverlayInfoParcel);
    }

    /* access modifiers changed from: 0000 */
    public final void a(AdOverlayInfoParcel adOverlayInfoParcel) {
        ccm ccm = this.u;
        boolean b2 = ccm != null ? ccm.b() : false;
        bkc.c();
        bhr.a(this.a.getContext(), adOverlayInfoParcel, !b2);
        if (this.w != null) {
            String str = adOverlayInfoParcel.l;
            if (str == null && adOverlayInfoParcel.a != null) {
                str = adOverlayInfoParcel.a.a;
            }
            this.w.a(str);
        }
    }

    public final void a(cuq cuq) {
        this.k = cuq;
    }

    public final void a(cur cur) {
        this.l = cur;
    }

    public final void a(cus cus) {
        this.f = cus;
    }

    public final void a(cut cut) {
        this.i = cut;
    }

    public final void a(cvh cvh) {
        this.x = true;
        cur cur = this.l;
        if (cur != null) {
            cur.a();
            this.l = null;
        }
        p();
    }

    public final void a(dpj dpj, bgi bgi, bht bht, bgk bgk, bhz bhz, boolean z2, bhg bhg, bla bla, ccw ccw, clb clb) {
        bgi bgi2 = bgi;
        bgk bgk2 = bgk;
        bhg bhg2 = bhg;
        ccw ccw2 = ccw;
        clb clb2 = clb;
        bla bla2 = bla == null ? new bla(this.a.getContext(), clb2, null) : bla;
        this.u = new ccm(this.a, ccw2);
        this.w = clb2;
        if (((Boolean) dqe.f().a(dtg.aD)).booleanValue()) {
            a("/adMetadata", (bhc<? super ReferenceT>) new bfy<Object>(bgi2));
        }
        a("/appEvent", (bhc<? super ReferenceT>) new bgj<Object>(bgk2));
        a("/backButton", bgm.j);
        a("/refresh", bgm.k);
        a("/canOpenURLs", bgm.a);
        a("/canOpenIntents", bgm.b);
        a("/click", bgm.c);
        a("/close", bgm.d);
        a("/customClose", bgm.e);
        a("/instrument", bgm.n);
        a("/delayPageLoaded", bgm.p);
        a("/delayPageClosed", bgm.q);
        a("/getLocationInfo", bgm.r);
        a("/httpTrack", bgm.f);
        a("/log", bgm.g);
        a("/mraid", (bhc<? super ReferenceT>) new bgb<Object>(bla2, this.u, ccw2));
        a("/mraidLoaded", (bhc<? super ReferenceT>) this.s);
        bgc bgc = r1;
        bla bla3 = bla2;
        bgc bgc2 = new bgc(this.a.getContext(), this.a.k(), this.a.A(), bhz, dpj, bgi, bgk, bht, bla2, this.u);
        a("/open", (bhc<? super ReferenceT>) bgc);
        a("/precache", (bhc<? super ReferenceT>) new csx<Object>());
        a("/touch", bgm.i);
        a("/video", bgm.l);
        a("/videoMeta", bgm.m);
        if (bkc.B().a(this.a.getContext())) {
            a("/logScionEvent", (bhc<? super ReferenceT>) new bga<Object>(this.a.getContext()));
        }
        if (bhg2 != null) {
            a("/setInterstitialProperties", (bhc<? super ReferenceT>) new bhf<Object>(bhg2));
        }
        this.b = dpj;
        this.c = bht;
        this.d = bgi2;
        this.e = bgk2;
        this.h = bhz;
        this.t = bla3;
        this.v = ccw;
        this.m = bhg2;
        this.g = z2;
    }

    public final void b(cvh cvh) {
        a(cvh.b);
    }

    public final boolean b() {
        boolean z2;
        synchronized (this.j) {
            z2 = this.n;
        }
        return z2;
    }

    public final boolean c() {
        boolean z2;
        synchronized (this.j) {
            z2 = this.o;
        }
        return z2;
    }

    public final boolean c(cvh cvh) {
        String valueOf = String.valueOf(cvh.a);
        String str = "AdWebView shouldOverrideUrlLoading: ";
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            new String(str);
        }
        cml.a();
        Uri uri = cvh.b;
        if (a(uri)) {
            return true;
        }
        if (this.g) {
            String scheme = uri.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                if (this.b != null) {
                    if (((Boolean) dqe.f().a(dtg.ah)).booleanValue()) {
                        this.b.e();
                        clb clb = this.w;
                        if (clb != null) {
                            clb.a(cvh.a);
                        }
                        this.b = null;
                    }
                }
                return false;
            }
        }
        if (!this.a.n().willNotDraw()) {
            try {
                dio A2 = this.a.A();
                if (A2 != null && A2.a(uri)) {
                    uri = A2.a(uri, this.a.getContext(), this.a.o(), this.a.d());
                }
            } catch (zzcj unused) {
                String str2 = "Unable to append parameter to URL: ";
                String valueOf2 = String.valueOf(cvh.a);
                if (valueOf2.length() != 0) {
                    str2.concat(valueOf2);
                } else {
                    new String(str2);
                }
                cpn.a(5);
            }
            bla bla = this.t;
            if (bla == null || bla.a()) {
                bhj bhj = new bhj("android.intent.action.VIEW", uri.toString(), null, null, null, null, null);
                a(bhj);
            } else {
                this.t.a(cvh.a);
            }
        } else {
            String str3 = "AdWebView unable to handle URL: ";
            String valueOf3 = String.valueOf(cvh.a);
            if (valueOf3.length() != 0) {
                str3.concat(valueOf3);
            } else {
                new String(str3);
            }
            cpn.a(5);
        }
        return true;
    }

    public final OnGlobalLayoutListener d() {
        OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.j) {
            onGlobalLayoutListener = this.p;
        }
        return onGlobalLayoutListener;
    }

    public final WebResourceResponse d(cvh cvh) {
        WebResourceResponse webResourceResponse;
        String str = "";
        clb clb = this.w;
        if (clb != null) {
            clb.a(cvh.a, cvh.c, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(cvh.a).getName())) {
            webResourceResponse = null;
        } else {
            m();
            dsw<String> dsw = this.a.v().c() ? dtg.K : this.a.B() ? dtg.J : dtg.I;
            String str2 = (String) dqe.f().a(dsw);
            bkc.e();
            webResourceResponse = cmu.c(this.a.getContext(), this.a.k().a, str2);
        }
        if (webResourceResponse != null) {
            return webResourceResponse;
        }
        try {
            if (!clk.a(cvh.a, this.a.getContext()).equals(cvh.a)) {
                return e(cvh);
            }
            dnr a2 = dnr.a(cvh.a);
            if (a2 != null) {
                dno a3 = bkc.k().a(a2);
                if (a3 != null && a3.a()) {
                    return new WebResourceResponse(str, str, a3.b());
                }
            }
            if (cpg.c()) {
                if (((Boolean) dqe.f().a(dtg.bg)).booleanValue()) {
                    return e(cvh);
                }
            }
            return null;
        } catch (Exception | NoClassDefFoundError e2) {
            bkc.i().a(e2, "AdWebViewClient.interceptRequest");
            return null;
        }
    }

    public final OnScrollChangedListener e() {
        OnScrollChangedListener onScrollChangedListener;
        synchronized (this.j) {
            onScrollChangedListener = this.q;
        }
        return onScrollChangedListener;
    }

    public final boolean f() {
        boolean z2;
        synchronized (this.j) {
            z2 = this.r;
        }
        return z2;
    }

    public final void g() {
        clb clb = this.w;
        if (clb != null) {
            WebView n2 = this.a.n();
            if (ip.E(n2)) {
                a((View) n2, clb, 10);
                return;
            }
            o();
            this.A = new cuz(this, clb);
            this.a.o().addOnAttachStateChangeListener(this.A);
        }
    }

    public final void h() {
        synchronized (this.j) {
            this.r = true;
        }
        this.z++;
        p();
    }

    public final void i() {
        this.z--;
        p();
    }

    public final void j() {
        this.y = true;
        p();
    }

    public final void k() {
        clb clb = this.w;
        if (clb != null) {
            clb.d();
            this.w = null;
        }
        o();
        super.k();
        synchronized (this.j) {
            this.b = null;
            this.c = null;
            this.k = null;
            this.l = null;
            this.d = null;
            this.e = null;
            this.g = false;
            this.n = false;
            this.o = false;
            this.r = false;
            this.h = null;
            this.f = null;
            if (this.u != null) {
                this.u.a(true);
                this.u = null;
            }
        }
    }

    public final clb l() {
        return this.w;
    }

    public final void m() {
        synchronized (this.j) {
            this.g = false;
            this.n = true;
            cqo.a.execute(new cux(this));
        }
    }

    public final /* synthetic */ Object n() {
        return this.a;
    }
}
