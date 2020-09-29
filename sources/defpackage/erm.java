package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import java.util.List;

/* renamed from: erm reason: default package */
public final class erm {
    final ery a;

    erm(ery ery) {
        this.a = ery;
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        if (str == null || str.isEmpty()) {
            this.a.q().i.a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.a.p().c();
        if (!a()) {
            this.a.q().i.a("Install Referrer Reporter is not available");
            return;
        }
        this.a.q().i.a("Install Referrer Reporter is initializing");
        ern ern = new ern(this, str);
        this.a.p().c();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        String str2 = "com.android.vending";
        intent.setComponent(new ComponentName(str2, "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.a.m().getPackageManager();
        if (packageManager == null) {
            this.a.q().f.a("Failed to obtain Package Manager to verify binding conditions");
            return;
        }
        List queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.a.q().i.a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
        if (resolveInfo.serviceInfo != null) {
            String str3 = resolveInfo.serviceInfo.packageName;
            if (resolveInfo.serviceInfo.name == null || !str2.equals(str3) || !a()) {
                this.a.q().i.a("Play Store missing or incompatible. Version 8.3.73 or later required");
            } else {
                try {
                    this.a.q().i.a("Install Referrer Service is", bzb.a().b(this.a.m(), new Intent(intent), ern, 1) ? "available" : "not available");
                } catch (Exception e) {
                    this.a.q().c.a("Exception occurred while binding to Install Referrer Service", e.getMessage());
                }
            }
        }
    }

    private final boolean a() {
        boolean z = false;
        try {
            caa a2 = cab.a(this.a.m());
            if (a2 == null) {
                this.a.q().i.a("Failed to retrieve Package Manager to check Play Store compatibility");
                return false;
            }
            if (a2.b("com.android.vending", 128).versionCode >= 80837300) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            this.a.q().i.a("Failed to retrieve Play Store version", e);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public final Bundle a(String str, elm elm) {
        this.a.p().c();
        if (elm == null) {
            this.a.q().f.a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle a2 = elm.a(bundle);
            if (a2 != null) {
                return a2;
            }
            this.a.q().c.a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e) {
            this.a.q().c.a("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }
}
