package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;

/* renamed from: bsa reason: default package */
public class bsa {
    private static bsa b;
    public final Context a;

    private bsa(Context context) {
        this.a = context.getApplicationContext();
    }

    public static bsa a(Context context) {
        bwx.a(context);
        synchronized (bsa.class) {
            if (b == null) {
                caf.a(context);
                b = new bsa(context);
            }
        }
        return b;
    }

    public final boolean a(int i) {
        cap cap;
        String[] packagesForUid = cab.a(this.a).a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && packagesForUid.length != 0) {
            cap = null;
            for (String a2 : packagesForUid) {
                cap = a(a2, i);
                if (cap.a) {
                    break;
                }
            }
        } else {
            cap = cap.a("no pkgs");
        }
        if (!cap.a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (cap.b != null) {
                cap.b();
            } else {
                cap.b();
            }
        }
        return cap.a;
    }

    public static boolean a(PackageInfo packageInfo, boolean z) {
        cah cah;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                cah = a(packageInfo, cak.a);
            } else {
                cah = a(packageInfo, cak.a[0]);
            }
            if (cah != null) {
                return true;
            }
        }
        return false;
    }

    private final cap a(String str, int i) {
        try {
            PackageInfo packageInfo = cab.a(this.a).a.getPackageManager().getPackageInfo(str, 64);
            boolean honorsDebugCertificates = brz.honorsDebugCertificates(this.a);
            if (packageInfo == null) {
                return cap.a("null pkg");
            }
            if (packageInfo.signatures.length != 1) {
                return cap.a("single cert required");
            }
            cai cai = new cai(packageInfo.signatures[0].toByteArray());
            String str2 = packageInfo.packageName;
            cap a2 = caf.a(str2, (cah) cai, honorsDebugCertificates);
            if (!a2.a || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || (honorsDebugCertificates && !caf.a(str2, (cah) cai, false).a)) {
                return a2;
            }
            return cap.a("debuggable release cert app rejected");
        } catch (NameNotFoundException unused) {
            String str3 = "no pkg ";
            String valueOf = String.valueOf(str);
            return cap.a(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
    }

    private static cah a(PackageInfo packageInfo, cah... cahArr) {
        if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
            return null;
        }
        cai cai = new cai(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < cahArr.length; i++) {
            if (cahArr[i].equals(cai)) {
                return cahArr[i];
            }
        }
        return null;
    }
}
