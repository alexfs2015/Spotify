package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Handler;
import com.adjust.sdk.ActivityKind;
import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.ActivityState;
import com.adjust.sdk.AdjustAttribution;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* renamed from: vd reason: default package */
public final class vd implements vp {
    static long a;
    private static long h;
    private static long i;
    private static long j;
    private static long k;
    ws b;
    vs c;
    vr d = vh.a();
    ww e;
    a f;
    vf g;
    private ActivityState l;
    private wv m;
    private ww n;
    private String o;
    private String p;
    private vm q;
    private AdjustAttribution r;
    private vq s;
    private vv t;
    private wj u;
    private vw v;

    /* renamed from: vd$a */
    public class a {
        boolean a;
        boolean b;
        boolean c;
        boolean d;
        boolean e;
        boolean f;
        boolean g;
        boolean h;

        public a() {
        }

        public final boolean a() {
            return !this.c;
        }

        public final boolean b() {
            return !this.d;
        }

        public final boolean c() {
            return !this.h;
        }
    }

    vd(vf vfVar) {
        this.g = vfVar;
        this.d.a();
        this.b = new wq("ActivityHandler");
        this.f = new a();
        this.f.a = vfVar.l != null ? vfVar.l.booleanValue() : true;
        this.f.b = vfVar.m;
        a aVar = this.f;
        aVar.c = true;
        aVar.d = false;
        aVar.e = false;
        aVar.g = false;
        aVar.h = false;
        this.b.a(new Runnable() {
            public final void run() {
                vd.a(vd.this);
            }
        });
    }

    public final vf a() {
        return this.g;
    }

    public final vm b() {
        return this.q;
    }

    public final ActivityState c() {
        return this.l;
    }

    public final wj d() {
        return this.u;
    }

    public final void e() {
        this.f.c = false;
        this.b.a(new Runnable() {
            public final void run() {
                vd.b(vd.this);
                vd vdVar = vd.this;
                if (vdVar.e != null) {
                    vdVar.e.a(false);
                }
                vd.c(vd.this);
                vd.this.d.a("Subsession start", new Object[0]);
                vd.d(vd.this);
            }
        });
    }

    public final void f() {
        this.f.c = true;
        this.b.a(new Runnable() {
            public final void run() {
                vd.this.m();
                vd vdVar = vd.this;
                if (vdVar.e != null && vdVar.n() && vdVar.e.a() <= 0) {
                    vdVar.e.a(vd.a);
                }
                vd.this.d.a("Subsession end", new Object[0]);
                vd.e(vd.this);
            }
        });
    }

    public final void a(final vg vgVar) {
        this.b.a(new Runnable() {
            public final void run() {
                if (vd.this.f.c()) {
                    vd.this.d.d("Event tracked before first activity resumed.\nIf it was triggered in the Application class, it might timestamp or even send an install long before the user opens the app.\nPlease check https://github.com/adjust/android_sdk#can-i-trigger-an-event-at-application-launch for more information.", new Object[0]);
                    vd.d(vd.this);
                }
                vd.a(vd.this, vgVar);
            }
        });
    }

    public final void a(wg wgVar) {
        if (wgVar instanceof wk) {
            this.s.a((wk) wgVar);
        } else if (wgVar instanceof wi) {
            wi wiVar = (wi) wgVar;
            if (wiVar.a) {
                this.l.clickTime = wiVar.j;
                this.l.installBegin = wiVar.k;
                this.l.installReferrer = wiVar.l;
                x();
            }
            this.s.a(wiVar);
        } else {
            if (wgVar instanceof vn) {
                final vn vnVar = (vn) wgVar;
                this.b.a(new Runnable() {
                    public final void run() {
                        vd.a(vd.this, vnVar);
                    }
                });
            }
        }
    }

    public final boolean g() {
        return o();
    }

    private boolean o() {
        ActivityState activityState = this.l;
        if (activityState != null) {
            return activityState.enabled;
        }
        return this.f.a;
    }

    public final void a(final Uri uri, final long j2) {
        this.b.a(new Runnable() {
            public final void run() {
                vd.a(vd.this, uri, j2);
            }
        });
    }

    private void a(String str) {
        if (str != null && !str.equals(this.l.adid)) {
            this.l.adid = str;
            x();
        }
    }

    private boolean a(AdjustAttribution adjustAttribution) {
        if (adjustAttribution == null || adjustAttribution.equals(this.r)) {
            return false;
        }
        this.r = adjustAttribution;
        synchronized (AdjustAttribution.class) {
            if (this.r != null) {
                wm.a(this.r, this.g.c, "AdjustAttribution", "Attribution");
            }
        }
        return true;
    }

    public final void a(final boolean z) {
        this.b.a(new Runnable() {
            public final void run() {
                vd.b(vd.this, z);
            }
        });
    }

    public final void h() {
        this.b.a(new Runnable() {
            public final void run() {
                vd.this.q();
            }
        });
    }

    public final void a(final wi wiVar) {
        this.b.a(new Runnable() {
            public final void run() {
                vd.a(vd.this, wiVar);
            }
        });
    }

    public final void a(final wk wkVar) {
        this.b.a(new Runnable() {
            public final void run() {
                vd.a(vd.this, wkVar);
            }
        });
    }

    public final void a(final vl vlVar) {
        this.b.a(new Runnable() {
            public final void run() {
                vd.a(vd.this, vlVar);
            }
        });
    }

    private void a(final String str, final boolean z) {
        this.b.a(new Runnable() {
            public final void run() {
                if (!z) {
                    new wl(vd.this.g.c).a(str);
                }
                if (!vd.this.f.c()) {
                    vd.a(vd.this, str);
                }
            }
        });
    }

    public final void i() {
        this.b.a(new Runnable() {
            public final void run() {
                vd.h(vd.this);
            }
        });
    }

    public final Context j() {
        return this.g.c;
    }

    public final String k() {
        return this.o;
    }

    public final String l() {
        return this.p;
    }

    private void a(List<vu> list) {
        if (list != null) {
            for (vu a2 : list) {
                a2.a(this);
            }
        }
    }

    private void a(long j2) {
        long j3 = j2 - this.l.lastActivity;
        this.l.sessionCount++;
        this.l.lastInterval = j3;
        c(j2);
        this.l.a(j2);
        x();
    }

    private void p() {
        if (y()) {
            wl wlVar = new wl(this.g.c);
            String i2 = wlVar.i();
            long j2 = wlVar.j();
            if (i2 != null && j2 != -1) {
                a(Uri.parse(i2), j2);
                wlVar.k();
            }
        }
    }

    /* access modifiers changed from: private */
    public void b(boolean z) {
        boolean z2;
        boolean o2 = o();
        if (o2 != z) {
            z2 = true;
        } else {
            if (o2) {
                this.d.b("Adjust already enabled", new Object[0]);
            } else {
                this.d.b("Adjust already disabled", new Object[0]);
            }
            z2 = false;
        }
        if (z2) {
            if (!z || !this.l.isGdprForgotten) {
                a aVar = this.f;
                aVar.a = z;
                if (aVar.c()) {
                    a(!z, "Handlers will start as paused due to the SDK being disabled", "Handlers will still start as paused", "Handlers will start as active due to the SDK being enabled");
                    return;
                }
                this.l.enabled = z;
                x();
                if (z) {
                    wl wlVar = new wl(this.g.c);
                    if (wlVar.g()) {
                        w();
                    }
                    if (!wlVar.f()) {
                        a(System.currentTimeMillis());
                    }
                    a(wlVar);
                }
                a(!z, "Pausing handlers due to SDK being disabled", "Handlers remain paused", "Resuming handlers due to SDK being enabled");
                return;
            }
            this.d.f("Re-enabling SDK not possible for forgotten user", new Object[0]);
        }
    }

    private void a(wl wlVar) {
        String c2 = wlVar.c();
        if (c2 != null && !c2.equals(this.l.pushToken)) {
            a(c2, true);
        }
        wlVar.a();
        h();
        this.v.a();
    }

    private void a(boolean z, String str, String str2, String str3) {
        if (z) {
            this.d.c(str, new Object[0]);
        } else if (!c(false)) {
            this.d.c(str3, new Object[0]);
        } else if (c(true)) {
            this.d.c(str2, new Object[0]);
        } else {
            vr vrVar = this.d;
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(", except the Sdk Click Handler");
            vrVar.c(sb.toString(), new Object[0]);
        }
        r();
    }

    /* access modifiers changed from: private */
    public void q() {
        if (o() && !this.f.c()) {
            this.t.c();
        }
    }

    private void s() {
        this.s.b();
        this.c.b();
        if (!d(true)) {
            this.t.a();
        } else {
            this.t.b();
        }
    }

    private void t() {
        this.s.c();
        this.c.c();
        this.t.b();
    }

    private boolean b(long j2) {
        if (!y()) {
            return false;
        }
        long j3 = j2 - this.l.lastActivity;
        if (j3 > j) {
            return false;
        }
        ActivityState activityState = this.l;
        activityState.lastActivity = j2;
        if (j3 < 0) {
            this.d.f("Time travel!", new Object[0]);
        } else {
            activityState.sessionLength += j3;
            this.l.timeSpent += j3;
        }
        return true;
    }

    private void c(long j2) {
        wb wbVar = new wb(this.g, this.q, this.l, this.u, j2);
        this.c.a(wbVar.a(this.f.d));
        this.c.a();
    }

    /* access modifiers changed from: 0000 */
    public void m() {
        wv wvVar = this.m;
        if (wvVar.g) {
            wvVar.h.a("%s is already suspended", wvVar.c);
            return;
        }
        wvVar.e = wvVar.b.getDelay(TimeUnit.MILLISECONDS);
        wvVar.b.cancel(false);
        DecimalFormat decimalFormat = wm.a;
        double d2 = (double) wvVar.e;
        Double.isNaN(d2);
        String format = decimalFormat.format(d2 / 1000.0d);
        wvVar.h.a("%s suspended with %s seconds left", wvVar.c, format);
        wvVar.g = true;
    }

    private void u() {
        this.c.a(this.u);
        this.f.e = false;
        ActivityState activityState = this.l;
        if (activityState != null) {
            activityState.updatePackages = false;
            x();
        }
    }

    private boolean v() {
        ActivityState activityState = this.l;
        if (activityState != null) {
            return activityState.updatePackages;
        }
        return this.f.e;
    }

    /* access modifiers changed from: private */
    public void w() {
        if (y() && o() && !this.l.isGdprForgotten) {
            this.l.isGdprForgotten = true;
            x();
            wb wbVar = new wb(this.g, this.q, this.l, this.u, System.currentTimeMillis());
            this.c.a(wbVar.a());
            new wl(this.g.c).h();
            this.c.a();
        }
    }

    private void x() {
        synchronized (ActivityState.class) {
            if (this.l != null) {
                wm.a(this.l, this.g.c, "AdjustIoActivityState", "Activity state");
            }
        }
    }

    private boolean y() {
        if (!this.f.c()) {
            return true;
        }
        this.d.f("Sdk did not yet start", new Object[0]);
        return false;
    }

    private boolean c(boolean z) {
        return z ? this.f.b || !o() : this.f.b || !o() || this.f.d;
    }

    /* access modifiers changed from: 0000 */
    public boolean n() {
        return d(false);
    }

    private boolean d(boolean z) {
        if (c(z)) {
            return false;
        }
        return this.f.a();
    }

    private void r() {
        if (!d(false)) {
            s();
            return;
        }
        t();
        this.c.a();
    }

    static /* synthetic */ void a(vd vdVar) {
        vd vdVar2 = vdVar;
        String str = "Session Partner parameters";
        String str2 = "Session Callback parameters";
        String str3 = "Activity state";
        String str4 = "Attribution";
        String str5 = "Failed to read %s file (%s)";
        j = vh.d();
        k = vh.e();
        h = vh.b();
        i = vh.c();
        a = vh.b();
        try {
            vdVar2.r = (AdjustAttribution) wm.a(vdVar2.g.c, "AdjustAttribution", str4, AdjustAttribution.class);
        } catch (Exception e2) {
            vdVar2.d.f(str5, str4, e2.getMessage());
            vdVar2.r = null;
        }
        try {
            vdVar2.l = (ActivityState) wm.a(vdVar2.g.c, "AdjustIoActivityState", str3, ActivityState.class);
        } catch (Exception e3) {
            vdVar2.d.f(str5, str3, e3.getMessage());
            vdVar2.l = null;
        }
        if (vdVar2.l != null) {
            vdVar2.f.h = true;
        }
        vdVar2.u = new wj();
        Context context = vdVar2.g.c;
        try {
            vdVar2.u.a = (Map) wm.a(context, "AdjustSessionCallbackParameters", str2, Map.class);
        } catch (Exception e4) {
            vdVar2.d.f(str5, str2, e4.getMessage());
            vdVar2.u.a = null;
        }
        Context context2 = vdVar2.g.c;
        try {
            vdVar2.u.b = (Map) wm.a(context2, "AdjustSessionPartnerParameters", str, Map.class);
        } catch (Exception e5) {
            vdVar2.d.f(str5, str, e5.getMessage());
            vdVar2.u.b = null;
        }
        if (vdVar2.g.l != null) {
            if (vdVar2.g.j == null) {
                vdVar2.g.j = new ArrayList();
            }
            vdVar2.g.j.add(new vu() {
                public final void a(vd vdVar) {
                    vdVar.b(vd.this.g.l.booleanValue());
                }
            });
        }
        if (vdVar2.f.h) {
            vdVar2.f.a = vdVar2.l.enabled;
            vdVar2.f.e = vdVar2.l.updatePackages;
            vdVar2.f.f = false;
        } else {
            vdVar2.f.f = true;
        }
        try {
            InputStream open = vdVar2.g.c.getAssets().open("adjust_config.properties");
            Properties properties = new Properties();
            properties.load(open);
            vdVar2.d.a("adjust_config.properties file read and loaded", new Object[0]);
            String property = properties.getProperty("defaultTracker");
            if (property != null) {
                vdVar2.g.g = property;
            }
        } catch (Exception e6) {
            vdVar2.d.b("%s file not found in this app", e6.getMessage());
        }
        vdVar2.q = new vm(vdVar2.g.c, null);
        vdVar2.q.a(vdVar2.g.c);
        if (vdVar2.q.a == null) {
            vdVar2.d.d("Unable to get Google Play Services Advertising ID at start time", new Object[0]);
            if (vdVar2.q.d == null && vdVar2.q.e == null && vdVar2.q.f == null) {
                vdVar2.d.f("Unable to get any device id's. Please check if Proguard is correctly set with Adjust SDK", new Object[0]);
            }
        } else {
            vdVar2.d.c("Google Play Services Advertising ID read correctly at start time", new Object[0]);
        }
        if (vdVar2.g.g != null) {
            vdVar2.d.c("Default tracker: '%s'", vdVar2.g.g);
        }
        if (vdVar2.g.k != null) {
            vdVar2.d.c("Push token: '%s'", vdVar2.g.k);
            if (vdVar2.f.h) {
                vdVar2.a(vdVar2.g.k, false);
            } else {
                new wl(vdVar2.g.c).a(vdVar2.g.k);
            }
        } else if (vdVar2.f.h) {
            vdVar2.a(new wl(vdVar2.g.c).c(), true);
        }
        if (vdVar2.f.h && new wl(vdVar2.g.c).g()) {
            vdVar2.b.a(new Runnable() {
                public final void run() {
                    vd.this.w();
                }
            });
        }
        wv wvVar = new wv(new Runnable() {
            public final void run() {
                vd vdVar = vd.this;
                vdVar.b.a(new Runnable() {
                    public final void run() {
                        vd.i(vd.this);
                    }
                });
            }
        }, i, h, "Foreground timer");
        vdVar2.m = wvVar;
        wn.a = null;
        vdVar2.o = vdVar2.g.a;
        vdVar2.p = vdVar2.g.b;
        vdVar2.c = vh.a(vdVar2, vdVar2.g.c, vdVar2.d(false));
        vdVar2.s = vh.a((vp) vdVar2, vdVar2.d(false));
        vdVar2.t = vh.b(vdVar2, vdVar2.d(true));
        if (vdVar.v()) {
            vdVar.u();
        }
        vdVar2.v = new vw(vdVar2.g.c, new vx() {
            public final void a(String str, long j, long j2) {
                vd vdVar = vd.this;
                ws wsVar = vdVar.b;
                AnonymousClass2 r0 = new Runnable(str, j, j2) {
                    private /* synthetic */ String a;
                    private /* synthetic */ long b;
                    private /* synthetic */ long c;

                    {
                        this.a = r2;
                        this.b = r3;
                        this.c = r5;
                    }

                    public final void run() {
                        vd.a(vd.this, this.a, this.b, this.c);
                    }
                };
                wsVar.a(r0);
            }
        });
        vdVar2.a(vdVar2.g.j);
        vdVar.q();
    }

    static /* synthetic */ void b(vd vdVar) {
        double d2;
        if (!vdVar.f.b() && !vdVar.v()) {
            long h2 = vh.h();
            if (0 > h2) {
                d2 = (double) (h2 / 1000);
                String format = wm.a.format(0.0d);
                String format2 = wm.a.format(d2);
                vdVar.d.d("Delay start of %s seconds bigger than max allowed value of %s seconds", format, format2);
            } else {
                h2 = 0;
                d2 = 0.0d;
            }
            String format3 = wm.a.format(d2);
            vdVar.d.c("Waiting %s seconds before starting first session", format3);
            vdVar.n.a(h2);
            vdVar.f.e = true;
            ActivityState activityState = vdVar.l;
            if (activityState != null) {
                activityState.updatePackages = true;
                vdVar.x();
            }
        }
    }

    static /* synthetic */ void c(vd vdVar) {
        if (vdVar.o()) {
            wv wvVar = vdVar.m;
            if (!wvVar.g) {
                wvVar.h.a("%s is already started", wvVar.c);
                return;
            }
            wvVar.h.a("%s starting", wvVar.c);
            wvVar.b = wvVar.a.a(new Runnable() {
                public final void run() {
                    wv.this.h.a("%s fired", wv.this.c);
                    wv.this.d.run();
                }
            }, wvVar.e, wvVar.f);
            wvVar.g = false;
        }
    }

    static /* synthetic */ void d(vd vdVar) {
        if (vdVar.f.c()) {
            vdVar.r();
            vdVar.l = new ActivityState();
            vdVar.f.h = true;
            long currentTimeMillis = System.currentTimeMillis();
            wl wlVar = new wl(vdVar.g.c);
            vdVar.l.pushToken = wlVar.c();
            if (vdVar.f.a) {
                if (!wlVar.g()) {
                    vdVar.l.sessionCount = 1;
                    vdVar.c(currentTimeMillis);
                    vdVar.a(wlVar);
                } else {
                    vdVar.w();
                }
            }
            vdVar.l.a(currentTimeMillis);
            vdVar.l.enabled = vdVar.f.a;
            vdVar.l.updatePackages = vdVar.f.e;
            vdVar.x();
            wlVar.d();
            wlVar.h();
            vdVar.p();
            return;
        }
        if (vdVar.l.enabled) {
            vdVar.r();
            if (!vdVar.l.isGdprForgotten) {
                long currentTimeMillis2 = System.currentTimeMillis();
                long j2 = currentTimeMillis2 - vdVar.l.lastActivity;
                if (j2 < 0) {
                    vdVar.d.f("Time travel!", new Object[0]);
                    vdVar.l.lastActivity = currentTimeMillis2;
                    vdVar.x();
                } else if (j2 > j) {
                    vdVar.a(currentTimeMillis2);
                    vdVar.a(new wl(vdVar.g.c));
                } else if (j2 > k) {
                    vdVar.l.subsessionCount++;
                    vdVar.l.sessionLength += j2;
                    ActivityState activityState = vdVar.l;
                    activityState.lastActivity = currentTimeMillis2;
                    vdVar.d.a("Started subsession %d of session %d", Integer.valueOf(activityState.subsessionCount), Integer.valueOf(vdVar.l.sessionCount));
                    vdVar.x();
                    vdVar.v.a();
                } else {
                    vdVar.d.a("Time span since last activity too short for a new subsession", new Object[0]);
                }
            }
            if (vdVar.y() && ((!vdVar.f.f || !(!vdVar.f.g)) && (vdVar.r == null || vdVar.l.askingAttribution))) {
                vdVar.s.a();
            }
            vdVar.p();
        }
    }

    static /* synthetic */ void e(vd vdVar) {
        if (!vdVar.d(false)) {
            vdVar.s();
        }
        if (vdVar.b(System.currentTimeMillis())) {
            vdVar.x();
        }
    }

    static /* synthetic */ void a(vd vdVar, vg vgVar) {
        boolean z;
        if (vdVar.y() && vdVar.o()) {
            if (vgVar == null) {
                vdVar.d.f("Event missing", new Object[0]);
            } else {
                if (!(vgVar.a != null)) {
                    vdVar.d.f("Event not initialized correctly", new Object[0]);
                } else {
                    z = true;
                    if (z && !vdVar.l.isGdprForgotten) {
                        long currentTimeMillis = System.currentTimeMillis();
                        vdVar.l.eventCount++;
                        vdVar.b(currentTimeMillis);
                        wb wbVar = new wb(vdVar.g, vdVar.q, vdVar.l, vdVar.u, currentTimeMillis);
                        boolean z2 = vdVar.f.d;
                        ContentResolver contentResolver = wbVar.d.c.getContentResolver();
                        HashMap hashMap = new HashMap();
                        Map a2 = we.a(wbVar.d.c, wb.a);
                        if (a2 != null) {
                            hashMap.putAll(a2);
                        }
                        if (!z2) {
                            wb.a((Map<String, String>) hashMap, "callback_params", wm.a(wbVar.f.a, vgVar.b, "Callback"));
                            wb.a((Map<String, String>) hashMap, "partner_params", wm.a(wbVar.f.b, null, "Partner"));
                        }
                        wbVar.c.a(wbVar.d.c);
                        wb.a((Map<String, String>) hashMap, "android_uuid", wbVar.e.g);
                        wb.a((Map<String, String>) hashMap, "tracking_enabled", wbVar.c.c);
                        wb.a((Map<String, String>) hashMap, "gps_adid", wbVar.c.a);
                        wb.a((Map<String, String>) hashMap, "gps_adid_src", wbVar.c.b);
                        if (!wb.a((Map<String, String>) hashMap)) {
                            wb.a.d("Google Advertising ID not detected, fallback to non Google Play identifiers will take place", new Object[0]);
                            wbVar.c.b(wbVar.d.c);
                            wb.a((Map<String, String>) hashMap, "mac_sha1", wbVar.c.d);
                            wb.a((Map<String, String>) hashMap, "mac_md5", wbVar.c.e);
                            wb.a((Map<String, String>) hashMap, "android_id", wbVar.c.f);
                        }
                        wb.a((Map<String, String>) hashMap, "api_level", wbVar.c.p);
                        wb.a((Map<String, String>) hashMap, "app_secret", (String) null);
                        wb.a((Map<String, String>) hashMap, "app_token", wbVar.d.d);
                        wb.a((Map<String, String>) hashMap, "app_version", wbVar.c.j);
                        wb.a((Map<String, String>) hashMap, "attribution_deeplink", Boolean.TRUE);
                        wb.a((Map<String, String>) hashMap, "connectivity_type", (long) wm.e(wbVar.d.c));
                        wb.a((Map<String, String>) hashMap, "country", wbVar.c.r);
                        wb.a((Map<String, String>) hashMap, "cpu_type", wbVar.c.y);
                        wb.b(hashMap, "created_at", wbVar.b);
                        wb.a((Map<String, String>) hashMap, "currency", (String) null);
                        wb.a((Map<String, String>) hashMap, "device_known", (Boolean) null);
                        wb.a((Map<String, String>) hashMap, "device_manufacturer", wbVar.c.m);
                        wb.a((Map<String, String>) hashMap, "device_name", wbVar.c.l);
                        wb.a((Map<String, String>) hashMap, "device_type", wbVar.c.k);
                        wb.a((Map<String, String>) hashMap, "display_height", wbVar.c.w);
                        wb.a((Map<String, String>) hashMap, "display_width", wbVar.c.v);
                        wb.a((Map<String, String>) hashMap, "environment", wbVar.d.e);
                        wb.a((Map<String, String>) hashMap, "event_callback_id", (String) null);
                        wb.a((Map<String, String>) hashMap, "event_count", (long) wbVar.e.a);
                        wb.a((Map<String, String>) hashMap, "event_buffering_enabled", Boolean.FALSE);
                        wb.a((Map<String, String>) hashMap, "event_token", vgVar.a);
                        wb.a((Map<String, String>) hashMap, "fb_id", wbVar.c.g);
                        wb.a((Map<String, String>) hashMap, "fire_adid", wm.a(contentResolver));
                        wb.a((Map<String, String>) hashMap, "fire_tracking_enabled", wm.b(contentResolver));
                        wb.a((Map<String, String>) hashMap, "hardware_name", wbVar.c.x);
                        wb.a((Map<String, String>) hashMap, "language", wbVar.c.q);
                        wb.a((Map<String, String>) hashMap, "mcc", wm.g(wbVar.d.c));
                        wb.a((Map<String, String>) hashMap, "mnc", wm.h(wbVar.d.c));
                        wb.a((Map<String, String>) hashMap, "needs_response_details", Boolean.TRUE);
                        wb.a((Map<String, String>) hashMap, "network_type", (long) wm.f(wbVar.d.c));
                        wb.a((Map<String, String>) hashMap, "os_build", wbVar.c.z);
                        wb.a((Map<String, String>) hashMap, "os_name", wbVar.c.n);
                        wb.a((Map<String, String>) hashMap, "os_version", wbVar.c.o);
                        wb.a((Map<String, String>) hashMap, "package_name", wbVar.c.i);
                        wb.a((Map<String, String>) hashMap, "push_token", wbVar.e.h);
                        wb.a((Map<String, String>) hashMap, "revenue", (Double) null);
                        wb.a((Map<String, String>) hashMap, "screen_density", wbVar.c.u);
                        wb.a((Map<String, String>) hashMap, "screen_format", wbVar.c.t);
                        wb.a((Map<String, String>) hashMap, "screen_size", wbVar.c.s);
                        wb.a((Map<String, String>) hashMap, "secret_id", (String) null);
                        wb.a((Map<String, String>) hashMap, "session_count", (long) wbVar.e.b);
                        wb.c(hashMap, "session_length", wbVar.e.f);
                        wb.a((Map<String, String>) hashMap, "subsession_count", (long) wbVar.e.c);
                        wb.c(hashMap, "time_spent", wbVar.e.d);
                        wb.b((Map<String, String>) hashMap);
                        ActivityPackage a3 = wbVar.a(ActivityKind.EVENT);
                        a3.path = "/event";
                        a3.suffix = wb.a(vgVar);
                        a3.parameters = hashMap;
                        if (z2) {
                            a3.callbackParameters = vgVar.b;
                            a3.partnerParameters = null;
                        }
                        vdVar.c.a(a3);
                        vdVar.c.a();
                        vdVar.x();
                        return;
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
    }

    static /* synthetic */ void a(vd vdVar, Uri uri, long j2) {
        if (vdVar.o()) {
            if (wm.a(uri)) {
                vr vrVar = vdVar.d;
                StringBuilder sb = new StringBuilder("Deep link (");
                sb.append(uri.toString());
                sb.append(") processing skipped");
                vrVar.b(sb.toString(), new Object[0]);
                return;
            }
            ActivityState activityState = vdVar.l;
            vf vfVar = vdVar.g;
            vm vmVar = vdVar.q;
            wj wjVar = vdVar.u;
            ActivityPackage activityPackage = null;
            if (uri != null) {
                String uri2 = uri.toString();
                if (!(uri2 == null || uri2.length() == 0)) {
                    vh.a().a("Url to parse (%s)", uri);
                    UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
                    urlQuerySanitizer.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
                    urlQuerySanitizer.setAllowUnregisteredParamaters(true);
                    urlQuerySanitizer.parseUrl(uri2);
                    wb a2 = wc.a(urlQuerySanitizer.getParameterList(), activityState, vfVar, vmVar, wjVar);
                    if (a2 != null) {
                        a2.k = uri.toString();
                        a2.h = j2;
                        activityPackage = a2.a("deeplink");
                    }
                }
            }
            if (activityPackage != null) {
                vdVar.t.a(activityPackage);
            }
        }
    }

    static /* synthetic */ void b(vd vdVar, boolean z) {
        vdVar.l.askingAttribution = z;
        vdVar.x();
    }

    static /* synthetic */ void a(vd vdVar, String str, long j2, long j3) {
        ActivityPackage activityPackage;
        if (vdVar.o() && str != null) {
            if (j2 != vdVar.l.clickTime || j3 != vdVar.l.installBegin || !str.equals(vdVar.l.installReferrer)) {
                ActivityState activityState = vdVar.l;
                vf vfVar = vdVar.g;
                vm vmVar = vdVar.q;
                wj wjVar = vdVar.u;
                if (str == null || str.length() == 0) {
                    activityPackage = null;
                } else {
                    wb wbVar = new wb(vfVar, vmVar, activityState, wjVar, System.currentTimeMillis());
                    wbVar.l = str;
                    wbVar.g = j2;
                    wbVar.i = j3;
                    activityPackage = wbVar.a("install_referrer");
                }
                vdVar.t.a(activityPackage);
            }
        }
    }

    static /* synthetic */ void a(vd vdVar, vn vnVar) {
        vdVar.a(vnVar.d);
        new Handler(vdVar.g.c.getMainLooper());
    }

    static /* synthetic */ void a(vd vdVar, wi wiVar) {
        vdVar.a(wiVar.d);
        new Handler(vdVar.g.c.getMainLooper());
        vdVar.a(wiVar.i);
    }

    static /* synthetic */ void a(vd vdVar, wk wkVar) {
        vdVar.a(wkVar.d);
        new Handler(vdVar.g.c.getMainLooper());
        vdVar.a(wkVar.i);
        if (vdVar.r == null && !vdVar.l.askingAttribution) {
            vdVar.s.a();
        }
        if (wkVar.b) {
            new wl(vdVar.g.c).e();
        }
        vdVar.f.g = true;
    }

    static /* synthetic */ void a(vd vdVar, vl vlVar) {
        vdVar.a(vlVar.d);
        Handler handler = new Handler(vdVar.g.c.getMainLooper());
        vdVar.a(vlVar.i);
        final Uri uri = vlVar.a;
        if (uri != null) {
            vdVar.d.c("Deferred deeplink received (%s)", uri);
            final Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.setFlags(268435456);
            intent.setPackage(vdVar.g.c.getPackageName());
            handler.post(new Runnable() {
                public final void run() {
                    if (vd.this.g != null) {
                        if (vd.this.g.h != null ? vd.this.g.h.launchReceivedDeeplink(uri) : true) {
                            vd vdVar = vd.this;
                            Intent intent = intent;
                            Uri uri = uri;
                            if (!(vdVar.g.c.getPackageManager().queryIntentActivities(intent, 0).size() > 0)) {
                                vdVar.d.f("Unable to open deferred deep link (%s)", uri);
                            } else {
                                vdVar.d.c("Open deferred deep link (%s)", uri);
                                vdVar.g.c.startActivity(intent);
                            }
                        }
                    }
                }
            });
        }
    }

    static /* synthetic */ void a(vd vdVar, String str) {
        if (vdVar.y() && vdVar.o() && !vdVar.l.isGdprForgotten && str != null && !str.equals(vdVar.l.pushToken)) {
            vdVar.l.pushToken = str;
            vdVar.x();
            wb wbVar = new wb(vdVar.g, vdVar.q, vdVar.l, vdVar.u, System.currentTimeMillis());
            ContentResolver contentResolver = wbVar.d.c.getContentResolver();
            HashMap hashMap = new HashMap();
            Map a2 = we.a(wbVar.d.c, wb.a);
            if (a2 != null) {
                hashMap.putAll(a2);
            }
            wbVar.c.a(wbVar.d.c);
            wb.a((Map<String, String>) hashMap, "android_uuid", wbVar.e.g);
            wb.a((Map<String, String>) hashMap, "tracking_enabled", wbVar.c.c);
            wb.a((Map<String, String>) hashMap, "gps_adid", wbVar.c.a);
            wb.a((Map<String, String>) hashMap, "gps_adid_src", wbVar.c.b);
            if (!wb.a((Map<String, String>) hashMap)) {
                wb.a.d("Google Advertising ID not detected, fallback to non Google Play identifiers will take place", new Object[0]);
                wbVar.c.b(wbVar.d.c);
                wb.a((Map<String, String>) hashMap, "mac_sha1", wbVar.c.d);
                wb.a((Map<String, String>) hashMap, "mac_md5", wbVar.c.e);
                wb.a((Map<String, String>) hashMap, "android_id", wbVar.c.f);
            }
            wb.a((Map<String, String>) hashMap, "app_secret", (String) null);
            wb.a((Map<String, String>) hashMap, "app_token", wbVar.d.d);
            wb.a((Map<String, String>) hashMap, "attribution_deeplink", Boolean.TRUE);
            wb.b(hashMap, "created_at", wbVar.b);
            wb.a((Map<String, String>) hashMap, "device_known", (Boolean) null);
            wb.a((Map<String, String>) hashMap, "environment", wbVar.d.e);
            wb.a((Map<String, String>) hashMap, "event_buffering_enabled", Boolean.FALSE);
            wb.a((Map<String, String>) hashMap, "fire_adid", wm.a(contentResolver));
            wb.a((Map<String, String>) hashMap, "fire_tracking_enabled", wm.b(contentResolver));
            wb.a((Map<String, String>) hashMap, "needs_response_details", Boolean.TRUE);
            wb.a((Map<String, String>) hashMap, "push_token", wbVar.e.h);
            wb.a((Map<String, String>) hashMap, "secret_id", (String) null);
            wb.a((Map<String, String>) hashMap, "source", "push");
            wb.b((Map<String, String>) hashMap);
            ActivityPackage a3 = wbVar.a(ActivityKind.INFO);
            a3.path = "/sdk_info";
            a3.suffix = "";
            a3.parameters = hashMap;
            vdVar.c.a(a3);
            new wl(vdVar.g.c).d();
            vdVar.c.a();
        }
    }

    static /* synthetic */ void h(vd vdVar) {
        vdVar.l.isGdprForgotten = true;
        vdVar.x();
        vdVar.c.d();
        vdVar.b(false);
    }

    static /* synthetic */ void i(vd vdVar) {
        if (!vdVar.o()) {
            vdVar.m();
            return;
        }
        if (vdVar.d(false)) {
            vdVar.c.a();
        }
        if (vdVar.b(System.currentTimeMillis())) {
            vdVar.x();
        }
    }
}
