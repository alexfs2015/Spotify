package com.comscore.android.vce;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.webkit.WebView;
import com.comscore.Analytics;
import java.util.HashMap;

public class Vce {
    private static final String a = "VCESDK";
    private static final Object b = new Object();
    private static volatile Vce c;
    private static boolean d = false;
    private static boolean e = false;
    private static boolean f;
    private static h g = new h();
    private b h;
    private p i = g.b();
    private g j;

    static {
        boolean z = false;
        if (VERSION.SDK_INT < 15) {
            z = true;
        }
        f = z;
    }

    private Vce() {
        if (f) {
            d = true;
            this.i.b("Analytics", "Android version not supported");
        }
        if (!d) {
            this.h = g.c();
        }
    }

    private void a(Context context) {
        h hVar = g;
        this.j = hVar.a(hVar, this.h, this.i, context.getApplicationContext());
    }

    private void c() {
        p.c = true;
    }

    public static void disable() {
        if (!d) {
            synchronized (b) {
                if (!d) {
                    d = true;
                    if (c != null) {
                        c.b();
                    }
                }
            }
        }
    }

    public static String getSdkVersion() {
        return Analytics.getVersion();
    }

    public static Vce getSharedInstance(Context context) {
        if (c == null || !e) {
            synchronized (b) {
                if (c == null) {
                    c = new Vce();
                }
                if (!d && context != null && !e) {
                    c.a(context);
                    e = true;
                }
            }
        }
        return c;
    }

    public static boolean hasSharedInstance() {
        return c != null;
    }

    public static boolean isEnabled() {
        return !d;
    }

    public static boolean isRunning() {
        return !d && c != null && e;
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        return this.j == null;
    }

    public void addPartnerId(String str) {
        if (!d && str != null && str.length() > 0) {
            if (a()) {
                this.h.c(str);
                return;
            }
            this.j.d(str);
        }
    }

    public void addPublisherId(String str) {
        if (!d && str != null && str.length() > 0) {
            if (a()) {
                this.h.b(str);
                return;
            }
            this.j.b(str);
        }
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        g gVar = this.j;
        if (gVar != null) {
            gVar.o();
        }
    }

    public void discoverAndTrackAdClassNames(String[] strArr) {
        if (!d) {
            discoverAndTrackAdClassNames(strArr, true);
        }
    }

    public void discoverAndTrackAdClassNames(String[] strArr, boolean z) {
        if (!d) {
            this.h.a(strArr, z);
            if (!a()) {
                this.j.n();
            }
        }
    }

    public void discoverAndTrackAds() {
        if (!d) {
            discoverAndTrackAds(true);
        }
    }

    public void discoverAndTrackAds(boolean z) {
        if (!d) {
            this.h.i(z);
            if (!a()) {
                this.j.l();
            }
        }
    }

    public String getApiNumber() {
        return d ? "" : this.h.b();
    }

    public String getPartnerIds() {
        return d ? "" : this.h.m();
    }

    public String getPublisherIds() {
        return d ? "" : this.h.l();
    }

    public void manualTrack() {
        if (!d) {
            this.h.o();
        }
    }

    public void nativeTrack() {
        if (!d) {
            this.h.n();
        }
    }

    public void stopTrackingNativeView(View view) {
        if (!d && !a()) {
            if (view != null) {
                this.j.c(view);
                return;
            }
            this.i.b("Analytics", "The native tracking instance passed is null.");
        }
    }

    public void trackAdView(View view) {
        if (!d) {
            trackAdView(view, true);
        }
    }

    public void trackAdView(View view, boolean z) {
        if (!d && !a()) {
            String str = "Analytics";
            if (view == null) {
                this.i.b(str, "The view tracking instance passed is null.");
            }
            if (view instanceof WebView) {
                this.j.b((WebView) view, z);
                return;
            }
            this.i.b(str, "the view is not an instance of a WebView");
        }
    }

    public void trackAdViewArray(View[] viewArr) {
        if (!d) {
            trackAdViewArray(viewArr, true);
        }
    }

    public void trackAdViewArray(View[] viewArr, boolean z) {
        if (!d && !a()) {
            this.j.b(viewArr, z);
        }
    }

    public void trackNativeView(View view, String str) {
        if (!d && !a()) {
            if (view == null || str == null) {
                String str2 = "Analytics";
                if (view == null) {
                    this.i.b(str2, "The native tracking instance passed is null.");
                }
                if (str == null) {
                    this.i.b(str2, "The url passed for native tracking passed is null.");
                }
            } else {
                this.j.b(view, str);
            }
        }
    }

    public void trackNativeView(View view, String str, String str2, HashMap<String, String> hashMap) {
        if (!d && !a()) {
            if (view == null || str == null || str2 == null) {
                String str3 = "Analytics";
                if (view == null) {
                    this.i.b(str3, "The native tracking instance passed is null.");
                }
                if (str == null) {
                    this.i.b(str3, "The event passed for native tracking passed is null.");
                }
                if (str2 == null) {
                    this.i.b(str3, "The url passed for native tracking passed is null.");
                }
            } else {
                this.j.b(view, str, str2, hashMap);
            }
        }
    }
}
