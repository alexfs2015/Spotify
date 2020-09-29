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

@cey
/* renamed from: css reason: default package */
public class css extends WebViewClient implements cty {
    private static final String[] h = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};
    private static final String[] i = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};
    private boolean A;
    private boolean B;
    private int C;
    private OnAttachStateChangeListener D;
    csr a;
    final HashMap<String, List<bgl<? super csr>>> b;
    final Object c;
    cub d;
    boolean e;
    cuc f;
    protected ckk g;
    private dos j;
    private bhc k;
    private ctz l;
    private cua m;
    private bfr n;
    private bft o;
    private bgp p;
    private boolean q;
    private boolean r;
    private OnGlobalLayoutListener s;
    private OnScrollChangedListener t;
    private boolean u;
    private bhi v;
    private final ccd w;
    private bkj x;
    private cbv y;
    private ccf z;

    public css(csr csr, boolean z2) {
        this(csr, z2, new ccd(csr, csr.s(), new dsa(csr.getContext())));
    }

    private css(csr csr, boolean z2, ccd ccd) {
        this.b = new HashMap<>();
        this.c = new Object();
        this.e = false;
        this.a = csr;
        this.q = z2;
        this.w = ccd;
        this.y = null;
    }

    private final void a(Context context, String str, String str2, String str3) {
        String str4;
        if (((Boolean) dpn.f().a(dsp.bq)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("err", str);
            bundle.putString("code", str2);
            if (!TextUtils.isEmpty(str3)) {
                Uri parse = Uri.parse(str3);
                if (parse.getHost() != null) {
                    str4 = parse.getHost();
                    bundle.putString("host", str4);
                    bjl.e().a(context, this.a.k().a, "gmob-apps", bundle, true);
                }
            }
            str4 = "";
            bundle.putString("host", str4);
            bjl.e().a(context, this.a.k().a, "gmob-apps", bundle, true);
        }
    }

    /* access modifiers changed from: private */
    public final void a(View view, ckk ckk, int i2) {
        if (ckk.b() && i2 > 0) {
            ckk.a(view);
            if (ckk.b()) {
                cmd.a.postDelayed(new csu(this, view, ckk, i2), 100);
            }
        }
    }

    private final void a(AdOverlayInfoParcel adOverlayInfoParcel) {
        cbv cbv = this.y;
        boolean b2 = cbv != null ? cbv.b() : false;
        bjl.c();
        bha.a(this.a.getContext(), adOverlayInfoParcel, !b2);
        if (this.g != null) {
            String str = adOverlayInfoParcel.l;
            if (str == null && adOverlayInfoParcel.a != null) {
                str = adOverlayInfoParcel.a.a;
            }
            this.g.a(str);
        }
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
            String a2 = ckt.a(str, this.a.getContext());
            if (!a2.equals(str)) {
                return b(a2, map);
            }
            dna a3 = dna.a(str);
            if (a3 != null) {
                dmx a4 = bjl.k().a(a3);
                if (a4 != null && a4.a()) {
                    return new WebResourceResponse(str2, str2, a4.b());
                }
            }
            if (cop.c()) {
                if (((Boolean) dpn.f().a(dsp.bg)).booleanValue()) {
                    return b(str, map);
                }
            }
            return null;
        } catch (Exception | NoClassDefFoundError e2) {
            bjl.i().a(e2, "AdWebViewClient.interceptRequest");
            return null;
        }
    }

    public final bkj a() {
        return this.x;
    }

    public final void a(int i2, int i3) {
        cbv cbv = this.y;
        if (cbv != null) {
            cbv.b(i2, i3);
        }
    }

    public final void a(int i2, int i3, boolean z2) {
        this.w.a(i2, i3);
        cbv cbv = this.y;
        if (cbv != null) {
            cbv.a(i2, i3, z2);
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

    public final void a(bgs bgs) {
        boolean B2 = this.a.B();
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(bgs, (!B2 || this.a.v().c()) ? this.j : null, B2 ? null : this.k, this.v, this.a.k());
        a(adOverlayInfoParcel);
    }

    public final void a(ctz ctz) {
        this.l = ctz;
    }

    public final void a(cua cua) {
        this.m = cua;
    }

    public final void a(cub cub) {
        this.d = cub;
    }

    public final void a(cuc cuc) {
        this.f = cuc;
    }

    public final void a(dos dos, bfr bfr, bhc bhc, bft bft, bhi bhi, boolean z2, bgp bgp, bkj bkj, ccf ccf, ckk ckk) {
        bfr bfr2 = bfr;
        bft bft2 = bft;
        bgp bgp2 = bgp;
        ccf ccf2 = ccf;
        ckk ckk2 = ckk;
        bkj bkj2 = bkj == null ? new bkj(this.a.getContext(), ckk2, null) : bkj;
        this.y = new cbv(this.a, ccf2);
        this.g = ckk2;
        if (((Boolean) dpn.f().a(dsp.aD)).booleanValue()) {
            a("/adMetadata", (bgl<? super csr>) new bfh<Object>(bfr2));
        }
        a("/appEvent", (bgl<? super csr>) new bfs<Object>(bft2));
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
        a("/mraid", (bgl<? super csr>) new bfk<Object>(bkj2, this.y, ccf2));
        a("/mraidLoaded", (bgl<? super csr>) this.w);
        bfl bfl = r1;
        bkj bkj3 = bkj2;
        bfl bfl2 = new bfl(this.a.getContext(), this.a.k(), this.a.A(), bhi, dos, bfr, bft, bhc, bkj2, this.y);
        a("/open", (bgl<? super csr>) bfl);
        a("/precache", (bgl<? super csr>) new csg<Object>());
        a("/touch", bfv.i);
        a("/video", bfv.l);
        a("/videoMeta", bfv.m);
        if (bjl.B().a(this.a.getContext())) {
            a("/logScionEvent", (bgl<? super csr>) new bfj<Object>(this.a.getContext()));
        }
        if (bgp2 != null) {
            a("/setInterstitialProperties", (bgl<? super csr>) new bgo<Object>(bgp2));
        }
        this.j = dos;
        this.k = bhc;
        this.n = bfr2;
        this.o = bft2;
        this.v = bhi;
        this.x = bkj3;
        this.z = ccf;
        this.p = bgp2;
        this.e = z2;
    }

    public final void a(String str, bgl<? super csr> bgl) {
        synchronized (this.c) {
            List list = (List) this.b.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.b.put(str, list);
            }
            list.add(bgl);
        }
    }

    public final void a(boolean z2, int i2) {
        dos dos = (!this.a.B() || this.a.v().c()) ? this.j : null;
        bhc bhc = this.k;
        bhi bhi = this.v;
        csr csr = this.a;
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(dos, bhc, bhi, csr, z2, i2, csr.k());
        a(adOverlayInfoParcel);
    }

    public final void a(boolean z2, int i2, String str) {
        boolean B2 = this.a.B();
        dos dos = (!B2 || this.a.v().c()) ? this.j : null;
        bhc csx = B2 ? null : new csx(this.a, this.k);
        bfr bfr = this.n;
        bft bft = this.o;
        bhi bhi = this.v;
        csr csr = this.a;
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(dos, csx, bfr, bft, bhi, csr, z2, i2, str, csr.k());
        a(adOverlayInfoParcel);
    }

    public final void a(boolean z2, int i2, String str, String str2) {
        boolean B2 = this.a.B();
        dos dos = (!B2 || this.a.v().c()) ? this.j : null;
        bhc csx = B2 ? null : new csx(this.a, this.k);
        bfr bfr = this.n;
        bft bft = this.o;
        bhi bhi = this.v;
        csr csr = this.a;
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(dos, csx, bfr, bft, bhi, csr, z2, i2, str, str2, csr.k());
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
        ckk ckk = this.g;
        if (ckk != null) {
            WebView n2 = this.a.n();
            if (ip.E(n2)) {
                a((View) n2, ckk, 10);
                return;
            }
            n();
            this.D = new csw(this, ckk);
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
        ckk ckk = this.g;
        if (ckk != null) {
            ckk.d();
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

    public final ckk l() {
        return this.g;
    }

    public final void m() {
        synchronized (this.c) {
            this.e = false;
            this.q = true;
            cpx.a.execute(new cst(this));
        }
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
            a(this.a.getContext(), "ssl_err", (primaryError < 0 || primaryError >= 6) ? String.valueOf(primaryError) : i[primaryError], bjl.g().a(sslError));
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
            csr r2 = r0.a     // Catch:{ all -> 0x0027 }
            boolean r2 = r2.D()     // Catch:{ all -> 0x0027 }
            if (r2 == 0) goto L_0x0015
            defpackage.clu.a()     // Catch:{ all -> 0x0027 }
            csr r2 = r0.a     // Catch:{ all -> 0x0027 }
            r2.E()     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            return
        L_0x0015:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            r1 = 1
            r0.A = r1
            cua r1 = r0.m
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.css.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        String str2 = "Loading resource: ";
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            new String(str2);
        }
        clu.a();
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme())) {
            if ("mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
                a(parse);
            }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        String str2 = "AdWebView shouldOverrideUrlLoading: ";
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            new String(str2);
        }
        clu.a();
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
                    if (((Boolean) dpn.f().a(dsp.ah)).booleanValue()) {
                        this.j.e();
                        ckk ckk = this.g;
                        if (ckk != null) {
                            ckk.a(str);
                        }
                        this.j = null;
                    }
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        }
        if (!this.a.n().willNotDraw()) {
            try {
                dhx A2 = this.a.A();
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
                cow.a(5);
            }
            bkj bkj = this.x;
            if (bkj == null || bkj.a()) {
                bgs bgs = new bgs("android.intent.action.VIEW", parse.toString(), null, null, null, null, null);
                a(bgs);
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
            cow.a(5);
        }
        return true;
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
                                String str2 = "Redirecting to ";
                                String valueOf = String.valueOf(headerField);
                                if (valueOf.length() != 0) {
                                    str2.concat(valueOf);
                                } else {
                                    new String(str2);
                                }
                                cow.a(3);
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

    private final void a(Uri uri) {
        String path = uri.getPath();
        List<bgl> list = (List) this.b.get(path);
        if (list != null) {
            bjl.e();
            Map a2 = cmd.a(uri);
            if (clu.a(2)) {
                String str = "Received GMSG: ";
                String valueOf = String.valueOf(path);
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    new String(str);
                }
                clu.a();
                for (String str2 : a2.keySet()) {
                    String str3 = (String) a2.get(str2);
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                    sb.append("  ");
                    sb.append(str2);
                    sb.append(": ");
                    sb.append(str3);
                    sb.toString();
                    clu.a();
                }
            }
            for (bgl zza : list) {
                zza.zza(this.a, a2);
            }
            return;
        }
        String valueOf2 = String.valueOf(uri);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
        sb2.append("No GMSG handler found for GMSG: ");
        sb2.append(valueOf2);
        sb2.toString();
        clu.a();
    }
}
