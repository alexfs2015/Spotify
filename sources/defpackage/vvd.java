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

/* renamed from: vvd reason: default package */
final class vvd extends vuz<Boolean> {
    private final vxb a = new vxa();
    private PackageManager b;
    private String c;
    private PackageInfo d;
    private String e;
    private String l;
    private String m;
    private String n;
    private String o;
    private final Future<Map<String, vvb>> p;
    private final Collection<vuz> q;

    public final String a() {
        return "1.4.7.30";
    }

    public final String b() {
        return "io.fabric.sdk.android:fabric";
    }

    public vvd(Future<Map<String, vvb>> future, Collection<vuz> collection) {
        this.p = future;
        this.q = collection;
    }

    private static Map<String, vvb> a(Map<String, vvb> map, Collection<vuz> collection) {
        for (vuz vuz : collection) {
            if (!map.containsKey(vuz.b())) {
                map.put(vuz.b(), new vvb(vuz.b(), vuz.a(), "binary"));
            }
        }
        return map;
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
            vuu.a().c("Fabric", "Failed init", e2);
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public Boolean e() {
        Map map;
        boolean z;
        String str = "Fabric";
        String i = CommonUtils.i(this.h);
        vyb f = f();
        boolean z2 = false;
        if (f != null) {
            try {
                if (this.p != null) {
                    map = (Map) this.p.get();
                } else {
                    map = new HashMap();
                }
                Map a2 = a(map, this.q);
                vxn vxn = f.a;
                Collection values = a2.values();
                if ("new".equals(vxn.a)) {
                    if (new vxq(this, g(), vxn.b, this.a).a(a(vxw.a(this.h, i), values))) {
                        z = a.a.c();
                    } else {
                        vuu.a().c(str, "Failed to create app with Crashlytics service.", null);
                    }
                } else if ("configured".equals(vxn.a)) {
                    z = a.a.c();
                } else {
                    if (vxn.e) {
                        vuu.a().a(str, "Server says an update is required - forcing a full App update.");
                        new vyg(this, g(), vxn.b, this.a).a(a(vxw.a(this.h, i), values));
                    }
                    z2 = true;
                }
                z2 = z;
            } catch (Exception e2) {
                vuu.a().c(str, "Error performing auto configuration.", e2);
            }
        }
        return Boolean.valueOf(z2);
    }

    private vyb f() {
        try {
            a.a.a(this, this.j, this.a, this.e, this.l, g()).b();
            return a.a.a();
        } catch (Exception e2) {
            vuu.a().c("Fabric", "Error dealing with settings", e2);
            return null;
        }
    }

    private vxm a(vxw vxw, Collection<vvb> collection) {
        Context context = this.h;
        vxm vxm = new vxm(new vvo().a(context), this.j.b, this.l, this.e, CommonUtils.a(CommonUtils.k(context)), this.n, DeliveryMechanism.a(this.m).id, this.o, Ad.DEFAULT_SKIPPABLE_AD_DELAY, vxw, collection);
        return vxm;
    }

    private String g() {
        return CommonUtils.c(this.h, "com.crashlytics.ApiEndpoint");
    }
}
