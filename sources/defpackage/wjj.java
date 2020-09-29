package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: wjj reason: default package */
final class wjj extends wjf<Boolean> {
    private final wlh a = new wlg();
    private PackageManager b;
    private String c;
    private PackageInfo d;
    private String e;
    private String l;
    private String m;
    private String n;
    private String o;
    private final Future<Map<String, wjh>> p;
    private final Collection<wjf> q;

    public wjj(Future<Map<String, wjh>> future, Collection<wjf> collection) {
        this.p = future;
        this.q = collection;
    }

    private static Map<String, wjh> a(Map<String, wjh> map, Collection<wjf> collection) {
        for (wjf wjf : collection) {
            if (!map.containsKey(wjf.b())) {
                map.put(wjf.b(), new wjh(wjf.b(), wjf.a(), "binary"));
            }
        }
        return map;
    }

    private wls a(wmc wmc, Collection<wjh> collection) {
        Context context = this.h;
        wls wls = new wls(new wju().a(context), this.j.b, this.l, this.e, CommonUtils.a(CommonUtils.k(context)), this.n, DeliveryMechanism.a(this.m).id, this.o, Ad.DEFAULT_SKIPPABLE_AD_DELAY, wmc, collection);
        return wls;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public Boolean e() {
        boolean z;
        String str = "Fabric";
        String i = CommonUtils.i(this.h);
        wmh f = f();
        boolean z2 = false;
        if (f != null) {
            try {
                Map a2 = a(this.p != null ? (Map) this.p.get() : new HashMap<>(), this.q);
                wlt wlt = f.a;
                Collection values = a2.values();
                if ("new".equals(wlt.a)) {
                    if (new wlw(this, g(), wlt.b, this.a).a(a(wmc.a(this.h, i), values))) {
                        z = a.a.c();
                    } else {
                        wja.a().c(str, "Failed to create app with Crashlytics service.", null);
                    }
                } else if ("configured".equals(wlt.a)) {
                    z = a.a.c();
                } else {
                    if (wlt.e) {
                        wja.a().a(str, "Server says an update is required - forcing a full App update.");
                        new wmm(this, g(), wlt.b, this.a).a(a(wmc.a(this.h, i), values));
                    }
                    z2 = true;
                }
                z2 = z;
            } catch (Exception e2) {
                wja.a().c(str, "Error performing auto configuration.", e2);
            }
        }
        return Boolean.valueOf(z2);
    }

    private wmh f() {
        try {
            a.a.a(this, this.j, this.a, this.e, this.l, g()).b();
            return a.a.a();
        } catch (Exception e2) {
            wja.a().c("Fabric", "Error dealing with settings", e2);
            return null;
        }
    }

    private String g() {
        return CommonUtils.c(this.h, "com.crashlytics.ApiEndpoint");
    }

    public final String a() {
        return "1.4.7.30";
    }

    public final String b() {
        return "io.fabric.sdk.android:fabric";
    }

    /* access modifiers changed from: protected */
    public final boolean g_() {
        try {
            this.m = this.j.d();
            this.b = this.h.getPackageManager();
            this.c = this.h.getPackageName();
            this.d = this.b.getPackageInfo(this.c, 0);
            this.e = Integer.toString(this.d.versionCode);
            this.l = this.d.versionName == null ? "0.0" : this.d.versionName;
            this.n = this.b.getApplicationLabel(this.h.getApplicationInfo()).toString();
            this.o = Integer.toString(this.h.getApplicationInfo().targetSdkVersion);
            return true;
        } catch (NameNotFoundException e2) {
            wja.a().c("Fabric", "Failed init", e2);
            return false;
        }
    }
}
