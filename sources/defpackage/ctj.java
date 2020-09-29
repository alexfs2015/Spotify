package defpackage;

import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzcj;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;

@cfp
/* renamed from: ctj reason: default package */
public class ctj extends WebViewClient implements cup {
    private static final String[] h = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};
    private static final String[] i = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};
    private boolean A;
    private boolean B;
    private int C;
    private OnAttachStateChangeListener D;
    cti a;
    final HashMap<String, List<bhc<? super cti>>> b;
    final Object c;
    cus d;
    boolean e;
    cut f;
    protected clb g;
    private dpj j;
    private bht k;
    private cuq l;
    private cur m;
    private bgi n;
    private bgk o;
    private bhg p;
    private boolean q;
    private boolean r;
    private OnGlobalLayoutListener s;
    private OnScrollChangedListener t;
    private boolean u;
    private bhz v;
    private final ccu w;
    private bla x;
    private ccm y;
    private ccw z;

    public ctj(cti cti, boolean z2) {
        this(cti, z2, new ccu(cti, cti.s(), new dsr(cti.getContext())));
    }

    private ctj(cti cti, boolean z2, ccu ccu) {
        this.b = new HashMap<>();
        this.c = new Object();
        this.e = false;
        this.a = cti;
        this.q = z2;
        this.w = ccu;
        this.y = null;
    }

    private final void a(Context context, String str, String str2, String str3) {
        String str4;
        if (((Boolean) dqe.f().a(dtg.bq)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("err", str);
            bundle.putString("code", str2);
            if (!TextUtils.isEmpty(str3)) {
                Uri parse = Uri.parse(str3);
                if (parse.getHost() != null) {
                    str4 = parse.getHost();
                    bundle.putString("host", str4);
                    bkc.e().a(context, this.a.k().a, "gmob-apps", bundle, true);
                }
            }
            str4 = "";
            bundle.putString("host", str4);
            bkc.e().a(context, this.a.k().a, "gmob-apps", bundle, true);
        }
    }

    private final void a(Uri uri) {
        String path = uri.getPath();
        List<bhc> list = (List) this.b.get(path);
        if (list != null) {
            bkc.e();
            Map a2 = cmu.a(uri);
            if (cml.a(2)) {
                String str = "Received GMSG: ";
                String valueOf = String.valueOf(path);
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    new String(str);
                }
                cml.a();
                for (String str2 : a2.keySet()) {
                    String str3 = (String) a2.get(str2);
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                    sb.append("  ");
                    sb.append(str2);
                    sb.append(": ");
                    sb.append(str3);
                    sb.toString();
                    cml.a();
                }
            }
            for (bhc zza : list) {
                zza.zza(this.a, a2);
            }
            return;
        }
        String valueOf2 = String.valueOf(uri);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
        sb2.append("No GMSG handler found for GMSG: ");
        sb2.append(valueOf2);
        sb2.toString();
        cml.a();
    }

    /* access modifiers changed from: private */
    public final void a(View view, clb clb, int i2) {
        if (clb.b() && i2 > 0) {
            clb.a(view);
            if (clb.b()) {
                cmu.a.postDelayed(new ctl(this, view, clb, i2), 100);
            }
        }
    }

    private final void a(AdOverlayInfoParcel adOverlayInfoParcel) {
        ccm ccm = this.y;
        boolean b2 = ccm != null ? ccm.b() : false;
        bkc.c();
        bhr.a(this.a.getContext(), adOverlayInfoParcel, !b2);
        if (this.g != null) {
            String str = adOverlayInfoParcel.l;
            if (str == null && adOverlayInfoParcel.a != null) {
                str = adOverlayInfoParcel.a.a;
            }
            this.g.a(str);
        }
    }

    private final WebResourceResponse b(String str, Map<String, String> map) {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Entry entry : map.entrySet()) {
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
                                String str2 = "Redirecting to ";
                                String valueOf = String.valueOf(headerField);
                                if (valueOf.length() != 0) {
                                    str2.concat(valueOf);
                                } else {
                                    new String(str2);
                                }
                                cpn.a(3);
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                String str3 = "Unsupported scheme: ";
                                String valueOf2 = String.valueOf(protocol);
                                if (valueOf2.length() != 0) {
                                    str3.concat(valueOf2);
                                } else {
                                    new String(str3);
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

    private final void n() {
        if (this.D != null) {
            this.a.o().removeOnAttachStateChangeListener(this.D);
        }
    }

    private final void o() {
        if (this.l != null && ((this.A && this.C <= 0) || this.B)) {
            this.l.a(!this.B);
            this.l = null;
        }
        this.a.J();
    }

    /* access modifiers changed from: protected */
    public final WebResourceResponse a(String str, Map<String, String> map) {
        String str2 = "";
        try {
            String a2 = clk.a(str, this.a.getContext());
            if (!a2.equals(str)) {
                return b(a2, map);
            }
            dnr a3 = dnr.a(str);
            if (a3 != null) {
                dno a4 = bkc.k().a(a3);
                if (a4 != null && a4.a()) {
                    return new WebResourceResponse(str2, str2, a4.b());
                }
            }
            if (cpg.c()) {
                if (((Boolean) dqe.f().a(dtg.bg)).booleanValue()) {
                    return b(str, map);
                }
            }
            return null;
        } catch (Exception | NoClassDefFoundError e2) {
            bkc.i().a(e2, "AdWebViewClient.interceptRequest");
            return null;
        }
    }

    public final bla a() {
        return this.x;
    }

    public final void a(int i2, int i3) {
        ccm ccm = this.y;
        if (ccm != null) {
            ccm.b(i2, i3);
        }
    }

    public final void a(int i2, int i3, boolean z2) {
        this.w.a(i2, i3);
        ccm ccm = this.y;
        if (ccm != null) {
            ccm.a(i2, i3, z2);
        }
    }

    public final void a(OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.c) {
            this.r = true;
            this.a.I();
            this.s = onGlobalLayoutListener;
            this.t = onScrollChangedListener;
        }
    }

    public final void a(bhj bhj) {
        boolean B2 = this.a.B();
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(bhj, (!B2 || this.a.v().c()) ? this.j : null, B2 ? null : this.k, this.v, this.a.k());
        a(adOverlayInfoParcel);
    }

    public final void a(cuq cuq) {
        this.l = cuq;
    }

    public final void a(cur cur) {
        this.m = cur;
    }

    public final void a(cus cus) {
        this.d = cus;
    }

    public final void a(cut cut) {
        this.f = cut;
    }

    public final void a(dpj dpj, bgi bgi, bht bht, bgk bgk, bhz bhz, boolean z2, bhg bhg, bla bla, ccw ccw, clb clb) {
        bgi bgi2 = bgi;
        bgk bgk2 = bgk;
        bhg bhg2 = bhg;
        ccw ccw2 = ccw;
        clb clb2 = clb;
        bla bla2 = bla == null ? new bla(this.a.getContext(), clb2, null) : bla;
        this.y = new ccm(this.a, ccw2);
        this.g = clb2;
        if (((Boolean) dqe.f().a(dtg.aD)).booleanValue()) {
            a("/adMetadata", (bhc<? super cti>) new bfy<Object>(bgi2));
        }
        a("/appEvent", (bhc<? super cti>) new bgj<Object>(bgk2));
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
        a("/mraid", (bhc<? super cti>) new bgb<Object>(bla2, this.y, ccw2));
        a("/mraidLoaded", (bhc<? super cti>) this.w);
        bgc bgc = r1;
        bla bla3 = bla2;
        bgc bgc2 = new bgc(this.a.getContext(), this.a.k(), this.a.A(), bhz, dpj, bgi, bgk, bht, bla2, this.y);
        a("/open", (bhc<? super cti>) bgc);
        a("/precache", (bhc<? super cti>) new csx<Object>());
        a("/touch", bgm.i);
        a("/video", bgm.l);
        a("/videoMeta", bgm.m);
        if (bkc.B().a(this.a.getContext())) {
            a("/logScionEvent", (bhc<? super cti>) new bga<Object>(this.a.getContext()));
        }
        if (bhg2 != null) {
            a("/setInterstitialProperties", (bhc<? super cti>) new bhf<Object>(bhg2));
        }
        this.j = dpj;
        this.k = bht;
        this.n = bgi2;
        this.o = bgk2;
        this.v = bhz;
        this.x = bla3;
        this.z = ccw;
        this.p = bhg2;
        this.e = z2;
    }

    public final void a(String str, bhc<? super cti> bhc) {
        synchronized (this.c) {
            List list = (List) this.b.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.b.put(str, list);
            }
            list.add(bhc);
        }
    }

    public final void a(boolean z2, int i2) {
        dpj dpj = (!this.a.B() || this.a.v().c()) ? this.j : null;
        bht bht = this.k;
        bhz bhz = this.v;
        cti cti = this.a;
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(dpj, bht, bhz, cti, z2, i2, cti.k());
        a(adOverlayInfoParcel);
    }

    public final void a(boolean z2, int i2, String str) {
        boolean B2 = this.a.B();
        dpj dpj = (!B2 || this.a.v().c()) ? this.j : null;
        bht cto = B2 ? null : new cto(this.a, this.k);
        bgi bgi = this.n;
        bgk bgk = this.o;
        bhz bhz = this.v;
        cti cti = this.a;
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(dpj, cto, bgi, bgk, bhz, cti, z2, i2, str, cti.k());
        a(adOverlayInfoParcel);
    }

    public final void a(boolean z2, int i2, String str, String str2) {
        boolean B2 = this.a.B();
        dpj dpj = (!B2 || this.a.v().c()) ? this.j : null;
        bht cto = B2 ? null : new cto(this.a, this.k);
        bgi bgi = this.n;
        bgk bgk = this.o;
        bhz bhz = this.v;
        cti cti = this.a;
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(dpj, cto, bgi, bgk, bhz, cti, z2, i2, str, str2, cti.k());
        a(adOverlayInfoParcel);
    }

    public final boolean b() {
        boolean z2;
        synchronized (this.c) {
            z2 = this.q;
        }
        return z2;
    }

    public final boolean c() {
        boolean z2;
        synchronized (this.c) {
            z2 = this.r;
        }
        return z2;
    }

    public final OnGlobalLayoutListener d() {
        OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.c) {
            onGlobalLayoutListener = this.s;
        }
        return onGlobalLayoutListener;
    }

    public final OnScrollChangedListener e() {
        OnScrollChangedListener onScrollChangedListener;
        synchronized (this.c) {
            onScrollChangedListener = this.t;
        }
        return onScrollChangedListener;
    }

    public final boolean f() {
        boolean z2;
        synchronized (this.c) {
            z2 = this.u;
        }
        return z2;
    }

    public final void g() {
        clb clb = this.g;
        if (clb != null) {
            WebView n2 = this.a.n();
            if (ip.E(n2)) {
                a((View) n2, clb, 10);
                return;
            }
            n();
            this.D = new ctn(this, clb);
            this.a.o().addOnAttachStateChangeListener(this.D);
        }
    }

    public final void h() {
        synchronized (this.c) {
            this.u = true;
        }
        this.C++;
        o();
    }

    public final void i() {
        this.C--;
        o();
    }

    public final void j() {
        this.B = true;
        o();
    }

    public final void k() {
        clb clb = this.g;
        if (clb != null) {
            clb.d();
            this.g = null;
        }
        n();
        synchronized (this.c) {
            this.b.clear();
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
            this.o = null;
            this.e = false;
            this.q = false;
            this.r = false;
            this.u = false;
            this.v = null;
            this.d = null;
            if (this.y != null) {
                this.y.a(true);
                this.y = null;
            }
        }
    }

    public final clb l() {
        return this.g;
    }

    public final void m() {
        synchronized (this.c) {
            this.e = false;
            this.q = true;
            cqo.a.execute(new ctk(this));
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        String str2 = "Loading resource: ";
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            new String(str2);
        }
        cml.a();
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme())) {
            if ("mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
                a(parse);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r1 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        r1.a();
        r0.m = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        r0.A = true;
        r1 = r0.m;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.c
            monitor-enter(r1)
            cti r2 = r0.a     // Catch:{ all -> 0x0027 }
            boolean r2 = r2.D()     // Catch:{ all -> 0x0027 }
            if (r2 == 0) goto L_0x0015
            defpackage.cml.a()     // Catch:{ all -> 0x0027 }
            cti r2 = r0.a     // Catch:{ all -> 0x0027 }
            r2.E()     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            return
        L_0x0015:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            r1 = 1
            r0.A = r1
            cur r1 = r0.m
            if (r1 == 0) goto L_0x0023
            r1.a()
            r1 = 0
            r0.m = r1
        L_0x0023:
            r0.o()
            return
        L_0x0027:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctj.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        String str3;
        if (i2 < 0) {
            int i3 = (-i2) - 1;
            if (i3 < 15) {
                str3 = h[i3];
                a(this.a.getContext(), "http_err", str3, str2);
                super.onReceivedError(webView, i2, str, str2);
            }
        }
        str3 = String.valueOf(i2);
        a(this.a.getContext(), "http_err", str3, str2);
        super.onReceivedError(webView, i2, str, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            a(this.a.getContext(), "ssl_err", (primaryError < 0 || primaryError >= 6) ? String.valueOf(primaryError) : i[primaryError], bkc.g().a(sslError));
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return a(str, Collections.emptyMap());
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (!(keyCode == 79 || keyCode == 222)) {
            switch (keyCode) {
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                    break;
                default:
                    switch (keyCode) {
                        case 126:
                        case 127:
                        case 128:
                        case 129:
                        case 130:
                            break;
                        default:
                            return false;
                    }
            }
        }
        return true;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        String str2 = "AdWebView shouldOverrideUrlLoading: ";
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            new String(str2);
        }
        cml.a();
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme())) {
            if ("mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
                a(parse);
                return true;
            }
        }
        if (this.e && webView == this.a.n()) {
            String scheme = parse.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                if (this.j != null) {
                    if (((Boolean) dqe.f().a(dtg.ah)).booleanValue()) {
                        this.j.e();
                        clb clb = this.g;
                        if (clb != null) {
                            clb.a(str);
                        }
                        this.j = null;
                    }
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        }
        if (!this.a.n().willNotDraw()) {
            try {
                dio A2 = this.a.A();
                if (A2 != null && A2.a(parse)) {
                    parse = A2.a(parse, this.a.getContext(), this.a.o(), this.a.d());
                }
            } catch (zzcj unused) {
                String str3 = "Unable to append parameter to URL: ";
                String valueOf2 = String.valueOf(str);
                if (valueOf2.length() != 0) {
                    str3.concat(valueOf2);
                } else {
                    new String(str3);
                }
                cpn.a(5);
            }
            bla bla = this.x;
            if (bla == null || bla.a()) {
                bhj bhj = new bhj("android.intent.action.VIEW", parse.toString(), null, null, null, null, null);
                a(bhj);
            } else {
                this.x.a(str);
            }
        } else {
            String str4 = "AdWebView unable to handle URL: ";
            String valueOf3 = String.valueOf(str);
            if (valueOf3.length() != 0) {
                str4.concat(valueOf3);
            } else {
                new String(str4);
            }
            cpn.a(5);
        }
        return true;
    }
}
