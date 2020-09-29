package com.moat.analytics.mobile.spot;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

class j {
    boolean a = false;
    /* access modifiers changed from: private */
    public int b = 0;
    private boolean c = false;
    private boolean d = false;
    private final WeakReference<WebView> e;
    private final Map<b, String> f;
    private final LinkedList<String> g;
    private final AtomicBoolean h = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public final long i;
    private final a j;
    private final List<String> k;
    private final a l;
    private final BroadcastReceiver m = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            try {
                j.this.c();
            } catch (Exception e) {
                m.a(e);
            }
            if (System.currentTimeMillis() - j.this.i > 10000) {
                j.this.e();
            }
        }
    };
    private final BroadcastReceiver n = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            try {
                j.this.d();
            } catch (Exception e) {
                m.a(e);
            }
        }
    };

    enum a {
        WEBVIEW,
        NATIVE_DISPLAY,
        NATIVE_VIDEO
    }

    j(WebView webView, a aVar) {
        this.e = new WeakReference<>(webView);
        this.l = aVar;
        this.j = new a();
        this.g = new LinkedList<>();
        this.k = new ArrayList();
        this.f = new WeakHashMap();
        this.i = System.currentTimeMillis();
        IntentFilter intentFilter = new IntentFilter("UPDATE_METADATA");
        IntentFilter intentFilter2 = new IntentFilter("UPDATE_VIEW_INFO");
        mh.a(s.c()).a(this.m, intentFilter);
        mh.a(s.c()).a(this.n, intentFilter2);
        try {
            p.a(3, "JavaScriptBridge", (Object) this, b() ? "bridge installed" : "bridge not installed");
        } catch (Exception e2) {
            m.a(e2);
        }
    }

    private boolean a(WebView webView, String str) {
        StringBuilder sb;
        String str2 = "JavaScriptBridge";
        if (webView == null) {
            sb = new StringBuilder("WebView is null. Can't ");
        } else if (webView.getSettings().getJavaScriptEnabled()) {
            return true;
        } else {
            sb = new StringBuilder("JavaScript is not enabled in the given WebView. Can't ");
        }
        sb.append(str);
        p.a(6, str2, (Object) this, sb.toString());
        return false;
    }

    private boolean b() {
        if (h() != null && !a(h(), "installBridge")) {
            return false;
        }
        this.a = true;
        i.a().a(s.c(), this);
        return true;
    }

    /* access modifiers changed from: private */
    public void c() {
        String str = "JavaScriptBridge";
        try {
            if (w.a().a != d.OFF) {
                if (!this.d) {
                    p.a(3, str, (Object) this, "Ready for communication (setting environment variables).");
                    this.d = true;
                }
                String format = String.format("javascript:(function(e,k){function l(){function f(a){var b=a.c,c=a.a,f=a.b;a=a.f;var d=[];if(c)b[c]&&d.push(b[c].fn[0]);else for(key in b)if(b[key])for(var g=0,e=b[key].fn.length;g<e;g++)d.push(b[key].fn[g]);g=0;for(e=d.length;g<e;g++){var h=d[g];if('function'===typeof h)try{f?h(f):h()}catch(k){}a&&delete b[c]}}function d(a,b,c){'function'===typeof a&&(b===kuea&&c[b]?c[b].fn.push(a):c[b]={ts:+new Date,fn:[a]})}kuea=+new Date;iymv={};briz=!1;ewat=+new Date;bnkr=[];bjmk={};dptk={};uqaj={};ryup={};yhgt={};csif={};this.g=function(a){this.namespace=a.namespace;this.version=a.version;this.appName=a.appName;this.deviceOS=a.deviceOS;this.isNative=a.isNative;this.versionHash=a.versionHash;this.aqzx=a.aqzx;this.appId=a.appId};this.nvsj=function(a){briz||(d(a,ewat,iymv),briz=!0)};this.bpsy=function(a,b){var c=b||kuea;c!==kuea&&bjmk[c]||d(a,c,bjmk)};this.qmrv=function(a,b){var c=b||kuea;c!==kuea&&uqaj[c]||d(a,c,uqaj)};this.lgpr=function(a,b){d(a,b||kuea,yhgt)};this.hgen=function(a,b){d(a,b||kuea,csif)};this.xrnk=function(a){delete yhgt[a||kuea]};this.vgft=function(a){return dptk[a||kuea]||!1};this.lkpu=function(a){return ryup[a||kuea]||!1};this.crts=function(a){var b={c:iymv,b:a,a:ewat};briz?f(b):bnkr.push(a)};this.mqjh=function(a){var b=a||kuea;dptk[b]=!0;var c={c:bjmk,f:!0};b!==kuea&&(c.b=a,c.a=a);f(c)};this.egpw=function(a){var b=a||kuea;ryup[b]=!0;var c={c:uqaj,f:!0};b!==kuea&&(c.b=a,c.a=a);f(c)};this.sglu=function(a){var b={c:yhgt,b:a.event||a,f:!1};(a.adKey||kuea)!==kuea&&(b.a=a.adKey);f(b);return 0<Object.keys(yhgt).length};this.ucbx=function(a){f({a:a.adKey||kuea,c:csif,b:a.event,f:!1})}}'undefined'===typeof e.MoatMAK&&(e.MoatMAK=new l,e.MoatMAK.g(k),e.__zMoatInit__=!0)})(window,%s);", new Object[]{i()});
                if (g()) {
                    h().loadUrl(format);
                }
            }
        } catch (Exception e2) {
            p.a(str, (Object) this, "Failed to initialize communication (did not set environment variables).", (Throwable) e2);
        }
    }

    /* access modifiers changed from: private */
    public void d() {
        String sb;
        try {
            if (w.a().a != d.OFF) {
                String str = "JavaScriptBridge";
                if (this.e != null) {
                    if (g()) {
                        if (!this.c || h().getUrl() != null) {
                            if (h().getUrl() != null) {
                                this.c = true;
                            }
                            for (Entry key : this.f.entrySet()) {
                                b bVar = (b) key.getKey();
                                if (bVar == null || bVar.d() == null) {
                                    p.a(3, str, (Object) this, "Tracker has no subject");
                                    if (bVar != null) {
                                        if (!bVar.c) {
                                        }
                                    }
                                    c(bVar);
                                }
                                if (bVar.d) {
                                    f(String.format("javascript: MoatMAK.mqjh(\"%s\")", new Object[]{bVar.b}));
                                    String format = String.format("javascript: MoatMAK.sglu(%s)", new Object[]{bVar.f()});
                                    if (VERSION.SDK_INT >= 19) {
                                        h().evaluateJavascript(format, new ValueCallback<String>() {
                                            /* renamed from: a */
                                            public void onReceiveValue(String str) {
                                                String str2 = "null";
                                                String str3 = "JavaScriptBridge";
                                                if (str == null || str.equalsIgnoreCase(str2) || str.equalsIgnoreCase("false")) {
                                                    j jVar = j.this;
                                                    StringBuilder sb = new StringBuilder("Received value is:");
                                                    if (str != null) {
                                                        StringBuilder sb2 = new StringBuilder("(String)");
                                                        sb2.append(str);
                                                        str2 = sb2.toString();
                                                    }
                                                    sb.append(str2);
                                                    p.a(3, str3, (Object) jVar, sb.toString());
                                                    if (j.this.b >= 50) {
                                                        j.this.f();
                                                    }
                                                    j.this.b = j.this.b + 1;
                                                } else if (str.equalsIgnoreCase("true")) {
                                                    if (j.this.b != 0) {
                                                        p.a(3, str3, (Object) j.this, "Javascript has found ad");
                                                        j.this.e();
                                                    }
                                                    j.this.b = 0;
                                                } else {
                                                    j jVar2 = j.this;
                                                    StringBuilder sb3 = new StringBuilder("Received unusual value from Javascript:");
                                                    sb3.append(str);
                                                    p.a(3, str3, (Object) jVar2, sb3.toString());
                                                }
                                            }
                                        });
                                    } else {
                                        h().loadUrl(format);
                                    }
                                }
                            }
                            return;
                        }
                    }
                }
                if (this.e == null) {
                    sb = "WebView ref became null, stopping tracking loop";
                } else {
                    StringBuilder sb2 = new StringBuilder("WebView became null");
                    sb2.append(h() == null ? "" : "based on null url");
                    sb2.append(", stopping tracking loop");
                    sb = sb2.toString();
                }
                p.a(3, str, (Object) this, sb);
                f();
            }
        } catch (Exception e2) {
            m.a(e2);
            f();
        }
    }

    private void d(b bVar) {
        p.a(3, "JavaScriptBridge", (Object) this, "Stopping view update loop");
        if (bVar != null) {
            i.a().a(bVar);
        }
    }

    private void d(String str) {
        if (this.k.size() >= 50) {
            this.k.subList(0, 25).clear();
        }
        this.k.add(str);
    }

    /* access modifiers changed from: private */
    public void e() {
        p.a(3, "JavaScriptBridge", (Object) this, "Stopping metadata reporting loop");
        i.a().a(this);
        mh.a(s.c()).a(this.m);
    }

    private boolean e(String str) {
        if (this.a) {
            return true;
        }
        StringBuilder sb = new StringBuilder("Bridge is not installed in the given WebView. Can't ");
        sb.append(str);
        p.a(6, "JavaScriptBridge", (Object) this, sb.toString());
        return false;
    }

    /* access modifiers changed from: private */
    public void f() {
        p.a(3, "JavaScriptBridge", (Object) this, "Cleaning up");
        e();
        for (Entry key : this.f.entrySet()) {
            d((b) key.getKey());
        }
        this.f.clear();
        mh.a(s.c()).a(this.n);
    }

    private void f(String str) {
        if (g()) {
            h().loadUrl(str);
        }
    }

    private boolean g() {
        return h() != null;
    }

    private WebView h() {
        return (WebView) this.e.get();
    }

    private String i() {
        try {
            HashMap hashMap = new HashMap();
            String a2 = this.j.a();
            String b2 = this.j.b();
            String num = Integer.toString(VERSION.SDK_INT);
            String b3 = s.b();
            String str = this.l == a.WEBVIEW ? Ad.DEFAULT_SKIPPABLE_AD_DELAY : "1";
            hashMap.put("versionHash", "3f2ae9c1894282b5e0222f0d06bbf457191f816f");
            hashMap.put("appName", a2);
            hashMap.put("namespace", "SPOT");
            hashMap.put("version", "2.2.0");
            hashMap.put("deviceOS", num);
            hashMap.put("isNative", str);
            hashMap.put("appId", b2);
            if (b3 != null) {
                hashMap.put("aqzx", b3);
            }
            return new JSONObject(hashMap).toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        p.a(3, "JavaScriptBridge", (Object) this, "webViewReady");
        this.h.compareAndSet(false, true);
        e();
        for (String f2 : this.k) {
            f(f2);
        }
        this.k.clear();
    }

    /* access modifiers changed from: 0000 */
    public void a(b bVar) {
        if (bVar != null) {
            StringBuilder sb = new StringBuilder("adding tracker");
            sb.append(bVar.b);
            p.a(3, "JavaScriptBridge", (Object) this, sb.toString());
            this.f.put(bVar, "");
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        String format = String.format("javascript: MoatMAK.crts(%s)", new Object[]{str});
        if (this.h.get()) {
            f(format);
        } else {
            d(format);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        if (!this.h.get() || !g()) {
            this.g.add(jSONObject2);
            return;
        }
        f(String.format("javascript:%s.dispatchEvent(%s);", new Object[]{str, jSONObject2}));
    }

    /* access modifiers changed from: 0000 */
    public void b(String str) {
        StringBuilder sb = new StringBuilder("markUserInteractionEvent:");
        sb.append(str);
        p.a(3, "JavaScriptBridge", (Object) this, sb.toString());
        String format = String.format("javascript: MoatMAK.ucbx(%s)", new Object[]{str});
        if (this.h.get()) {
            f(format);
        } else {
            d(format);
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean b(b bVar) {
        String str = "startTracking";
        String str2 = "JavaScriptBridge";
        try {
            if (g() && a(h(), str)) {
                if (e(str)) {
                    if (bVar.d() == null) {
                        if (!bVar.c) {
                            p.a(3, str2, (Object) this, "Tracker subject is null, won't start tracking");
                            return false;
                        }
                        p.a(3, str2, (Object) this, "Tracker subject is null at start");
                    }
                    StringBuilder sb = new StringBuilder("Starting tracking on tracker");
                    sb.append(bVar.b);
                    p.a(3, str2, (Object) this, sb.toString());
                    f(String.format("javascript: MoatMAK.mqjh(\"%s\")", new Object[]{bVar.b}));
                    i.a().a(s.c(), bVar);
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            p.a(str2, (Object) this, "Failed to initialize impression start.", (Throwable) e2);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public void c(String str) {
        p.a(3, "JavaScriptBridge", (Object) this, "flushDispatchQueue");
        this.h.compareAndSet(false, true);
        if (this.g.size() >= 200) {
            LinkedList linkedList = new LinkedList();
            for (int i2 = 0; i2 < 10; i2++) {
                linkedList.addFirst((String) this.g.removeFirst());
            }
            int min = Math.min(Math.min(this.g.size() / 200, 10) + 200, this.g.size());
            for (int i3 = 0; i3 < min; i3++) {
                this.g.removeFirst();
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                this.g.addFirst((String) it.next());
            }
        }
        int i4 = 0;
        while (!this.g.isEmpty() && i4 < 200) {
            i4++;
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            while (!this.g.isEmpty() && i4 < 200) {
                i4++;
                String str2 = (String) this.g.getFirst();
                if (sb.length() + str2.length() > 2000) {
                    break;
                }
                this.g.removeFirst();
                if (z) {
                    z = false;
                } else {
                    sb.append(",");
                }
                sb.append(str2);
            }
            f(String.format("javascript:%s.dispatchMany([%s])", new Object[]{str, sb.toString()}));
        }
        this.g.clear();
    }

    /* access modifiers changed from: 0000 */
    public boolean c(b bVar) {
        String str = "JavaScriptBridge";
        boolean z = false;
        if (g()) {
            String str2 = "stopTracking";
            if (a(h(), str2) && e(str2)) {
                try {
                    StringBuilder sb = new StringBuilder("Ending tracking on tracker");
                    sb.append(bVar.b);
                    p.a(3, str, (Object) this, sb.toString());
                    f(String.format("javascript: MoatMAK.egpw(\"%s\")", new Object[]{bVar.b}));
                } catch (Exception e2) {
                    p.a(str, (Object) this, "Failed to end impression.", (Throwable) e2);
                }
                z = true;
            }
        }
        if (this.l == a.NATIVE_DISPLAY) {
            d(bVar);
        } else {
            f();
        }
        this.f.remove(bVar);
        return z;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            super.finalize();
            p.a(3, "JavaScriptBridge", (Object) this, "finalize");
            f();
        } catch (Exception e2) {
            m.a(e2);
        }
    }
}
