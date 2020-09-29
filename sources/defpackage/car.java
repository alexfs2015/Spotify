package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;

/* renamed from: car reason: default package */
public final class car {
    public final Context a;

    public car(Context context) {
        this.a = context;
    }

    public final int a(String str) {
        return this.a.checkCallingOrSelfPermission(str);
    }

    public final ApplicationInfo a(String str, int i) {
        return this.a.getPackageManager().getApplicationInfo(str, i);
    }

    public final boolean a() {
        if (Binder.getCallingUid() == Process.myUid()) {
            return caq.a(this.a);
        }
        if (caf.i()) {
            String nameForUid = this.a.getPackageManager().getNameForUid(Binder.getCallingUid());
            if (nameForUid != null) {
                return this.a.getPackageManager().isInstantApp(nameForUid);
            }
        }
        return false;
    }

    public final boolean a(int i, String str) {
        if (caf.e()) {
            try {
                ((AppOpsManager) this.a.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public final PackageInfo b(String str, int i) {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }

    public final CharSequence b(String str) {
        return this.a.getPackageManager().getApplicationLabel(this.a.getPackageManager().getApplicationInfo(str, 0));
    }
}
