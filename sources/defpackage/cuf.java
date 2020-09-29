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

@cey
/* renamed from: cuf reason: default package */
public final class cuf extends dzt<csr> implements cty, cut, cuv, cux, cuy {
    private OnAttachStateChangeListener A;
    csr a;
    dos b;
    bhc c;
    bfr d;
    bft e;
    cub f;
    boolean g;
    bhi h;
    cuc i;
    private final Object j;
    private ctz k;
    private cua l;
    private bgp m;
    private boolean n;
    private boolean o;
    private OnGlobalLayoutListener p;
    private OnScrollChangedListener q;
    private boolean r;
    private final ccd s;
    private bkj t;
    private cbv u;
    private ccf v;
    private ckk w;
    private boolean x;
    private boolean y;
    private int z;

    public cuf(csr csr, boolean z2) {
        this(csr, z2, new ccd(csr, csr.s(), new dsa(csr.getContext())));
    }

    private cuf(csr csr, boolean z2, ccd ccd) {
        this.j = new Object();
        this.g = false;
        this.a = csr;
        this.n = z2;
        this.s = ccd;
        this.u = null;
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

    public final bkj a() {
        return this.t;
    }

    public final void a(int i2, int i3) {
        cbv cbv = this.u;
        if (cbv != null) {
            cbv.b(i2, i3);
        }
    }

    public final void a(int i2, int i3, boolean z2) {
        this.s.a(i2, i3);
        cbv cbv = this.u;
        if (cbv != null) {
            cbv.a(i2, i3, z2);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(View view, ckk ckk, int i2) {
        if (ckk.b() && i2 > 0) {
            ckk.a(view);
            if (ckk.b()) {
                cmd.a.postDelayed(new cuh(this, view, ckk, i2), 100);
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

    public final void a(bgs bgs) {
        boolean B = this.a.B();
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(bgs, (!B || this.a.v().c()) ? this.b : null, B ? null : this.c, this.h, this.a.k());
        a(adOverlayInfoParcel);
    }

    /* access modifiers changed from: 0000 */
    public final void a(AdOverlayInfoParcel adOverlayInfoParcel) {
        cbv cbv = this.u;
        boolean b2 = cbv != null ? cbv.b() : false;
        bjl.c();
        bha.a(this.a.getContext(), adOverlayInfoParcel, !b2);
        if (this.w != null) {
            String str = adOverlayInfoParcel.l;
            if (str == null && adOverlayInfoParcel.a != null) {
                str = adOverlayInfoParcel.a.a;
            }
            this.w.a(str);
        }
    }

    public final void a(ctz ctz) {
        this.k = ctz;
    }

    public final void a(cua cua) {
        this.l = cua;
    }

    public final void a(cub cub) {
        this.f = cub;
    }

    public final void a(cuc cuc) {
        this.i = cuc;
    }

    public final void a(cuq cuq) {
        this.x = true;
        cua cua = this.l;
        if (cua != null) {
            cua.a();
            this.l = null;
        }
        p();
    }

    public final void a(dos dos, bfr bfr, bhc bhc, bft bft, bhi bhi, boolean z2, bgp bgp, bkj bkj, ccf ccf, ckk ckk) {
        bfr bfr2 = bfr;
        bft bft2 = bft;
        bgp bgp2 = bgp;
        ccf ccf2 = ccf;
        ckk ckk2 = ckk;
        bkj bkj2 = bkj == null ? new bkj(this.a.getContext(), ckk2, null) : bkj;
        this.u = new cbv(this.a, ccf2);
        this.w = ckk2;
        if (((Boolean) dpn.f().a(dsp.aD)).booleanValue()) {
            a("/adMetadata", (bgl<? super ReferenceT>) new bfh<Object>(bfr2));
        }
        a("/appEvent", (bgl<? super ReferenceT>) new bfs<Object>(bft2));
        a("/backButton", bfv.j);
        a("/refresh", bfv.k);
        a("/canOpenURLs", bfv.a);
        a("/canOpenIntents", bfv.b);
        a("/click", bfv.c);
        a("/close", bfv.d);
        a("/customClose", bfv.e);
        a("/instrument", bfv.n);
        a("/delayPageLoaded", bfv.p);
        a("/delayPageClosed", bfv.q);
        a("/getLocationInfo", bfv.r);
        a("/httpTrack", bfv.f);
        a("/log", bfv.g);
        a("/mraid", (bgl<? super ReferenceT>) new bfk<Object>(bkj2, this.u, ccf2));
        a("/mraidLoaded", (bgl<? super ReferenceT>) this.s);
        bfl bfl = r1;
        bkj bkj3 = bkj2;
        bfl bfl2 = new bfl(this.a.getContext(), this.a.k(), this.a.A(), bhi, dos, bfr, bft, bhc, bkj2, this.u);
        a("/open", (bgl<? super ReferenceT>) bfl);
        a("/precache", (bgl<? super ReferenceT>) new csg<Object>());
        a("/touch", bfv.i);
        a("/video", bfv.l);
        a("/videoMeta", bfv.m);
        if (bjl.B().a(this.a.getContext())) {
            a("/logScionEvent", (bgl<? super ReferenceT>) new bfj<Object>(this.a.getContext()));
        }
        if (bgp2 != null) {
            a("/setInterstitialProperties", (bgl<? super ReferenceT>) new bgo<Object>(bgp2));
        }
        this.b = dos;
        this.c = bhc;
        this.d = bfr2;
        this.e = bft2;
        this.h = bhi;
        this.t = bkj3;
        this.v = ccf;
        this.m = bgp2;
        this.g = z2;
    }

    public final void b(cuq cuq) {
        a(cuq.b);
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

    public final OnGlobalLayoutListener d() {
        OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.j) {
            onGlobalLayoutListener = this.p;
        }
        return onGlobalLayoutListener;
    }

    public final WebResourceResponse d(cuq cuq) {
        WebResourceResponse webResourceResponse;
        String str = "";
        ckk ckk = this.w;
        if (ckk != null) {
            ckk.a(cuq.a, cuq.c, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(cuq.a).getName())) {
            webResourceResponse = null;
        } else {
            m();
            dsf<String> dsf = this.a.v().c() ? dsp.K : this.a.B() ? dsp.J : dsp.I;
            String str2 = (String) dpn.f().a(dsf);
            bjl.e();
            webResourceResponse = cmd.c(this.a.getContext(), this.a.k().a, str2);
        }
        if (webResourceResponse != null) {
            return webResourceResponse;
        }
        try {
            if (!ckt.a(cuq.a, this.a.getContext()).equals(cuq.a)) {
                return e(cuq);
            }
            dna a2 = dna.a(cuq.a);
            if (a2 != null) {
                dmx a3 = bjl.k().a(a2);
                if (a3 != null && a3.a()) {
                    return new WebResourceResponse(str, str, a3.b());
                }
            }
            if (cop.c()) {
                if (((Boolean) dpn.f().a(dsp.bg)).booleanValue()) {
                    return e(cuq);
                }
            }
            return null;
        } catch (Exception | NoClassDefFoundError e2) {
            bjl.i().a(e2, "AdWebViewClient.interceptRequest");
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
        ckk ckk = this.w;
        if (ckk != null) {
            WebView n2 = this.a.n();
            if (ip.E(n2)) {
                a((View) n2, ckk, 10);
                return;
            }
            o();
            this.A = new cui(this, ckk);
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
        ckk ckk = this.w;
        if (ckk != null) {
            ckk.d();
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

    public final ckk l() {
        return this.w;
    }

    public final void m() {
        synchronized (this.j) {
            this.g = false;
            this.n = true;
            cpx.a.execute(new cug(this));
        }
    }

    public final /* synthetic */ Object n() {
        return this.a;
    }

    public final boolean c(cuq cuq) {
        String valueOf = String.valueOf(cuq.a);
        String str = "AdWebView shouldOverrideUrlLoading: ";
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            new String(str);
        }
        clu.a();
        Uri uri = cuq.b;
        if (a(uri)) {
            return true;
        }
        if (this.g) {
            String scheme = uri.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                if (this.b != null) {
                    if (((Boolean) dpn.f().a(dsp.ah)).booleanValue()) {
                        this.b.e();
                        ckk ckk = this.w;
                        if (ckk != null) {
                            ckk.a(cuq.a);
                        }
                        this.b = null;
                    }
                }
                return false;
            }
        }
        if (!this.a.n().willNotDraw()) {
            try {
                dhx A2 = this.a.A();
                if (A2 != null && A2.a(uri)) {
                    uri = A2.a(uri, this.a.getContext(), this.a.o(), this.a.d());
                }
            } catch (zzcj unused) {
                String str2 = "Unable to append parameter to URL: ";
                String valueOf2 = String.valueOf(cuq.a);
                if (valueOf2.length() != 0) {
                    str2.concat(valueOf2);
                } else {
                    new String(str2);
                }
                cow.a(5);
            }
            bkj bkj = this.t;
            if (bkj == null || bkj.a()) {
                bgs bgs = new bgs("android.intent.action.VIEW", uri.toString(), null, null, null, null, null);
                a(bgs);
            } else {
                this.t.a(cuq.a);
            }
        } else {
            String str3 = "AdWebView unable to handle URL: ";
            String valueOf3 = String.valueOf(cuq.a);
            if (valueOf3.length() != 0) {
                str3.concat(valueOf3);
            } else {
                new String(str3);
            }
            cow.a(5);
        }
        return true;
    }

    private final WebResourceResponse e(cuq cuq) {
        HttpURLConnection httpURLConnection;
        URL url = new URL(cuq.a);
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Entry entry : cuq.c.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    bjl.e().a(this.a.getContext(), this.a.k().a, httpURLConnection);
                    cop cop = new cop();
                    cop.a(httpURLConnection, (byte[]) null);
                    int responseCode = httpURLConnection.getResponseCode();
                    cop.a(httpURLConnection, responseCode);
                    if (responseCode < 300 || responseCode >= 400) {
                        bjl.e();
                    } else {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField != null) {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                cow.a(5);
                                return null;
                            } else if (protocol.equals("http") || protocol.equals("https")) {
                                String str = "Redirecting to ";
                                String valueOf = String.valueOf(headerField);
                                if (valueOf.length() != 0) {
                                    str.concat(valueOf);
                                } else {
                                    new String(str);
                                }
                                cow.a(3);
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
                                cow.a(5);
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
        bjl.e();
        return cmd.a(httpURLConnection);
    }
}
