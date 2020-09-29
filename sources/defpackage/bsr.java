package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;

/* renamed from: bsr reason: default package */
public class bsr {
    private static bsr b;
    public final Context a;

    private bsr(Context context) {
        this.a = context.getApplicationContext();
    }

    public static bsr a(Context context) {
        bxo.a(context);
        synchronized (bsr.class) {
            if (b == null) {
                caw.a(context);
                b = new bsr(context);
            }
        }
        return b;
    }

    private static cay a(PackageInfo packageInfo, cay... cayArr) {
        if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
            return null;
        }
        caz caz = new caz(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < cayArr.length; i++) {
            if (cayArr[i].equals(caz)) {
                return cayArr[i];
            }
        }
        return null;
    }

    private final cbg a(String str, int i) {
        try {
            PackageInfo packageInfo = cas.a(this.a).a.getPackageManager().getPackageInfo(str, 64);
            boolean honorsDebugCertificates = bsq.honorsDebugCertificates(this.a);
            if (packageInfo == null) {
                return cbg.a("null pkg");
            }
            if (packageInfo.signatures.length != 1) {
                return cbg.a("single cert required");
            }
            caz caz = new caz(packageInfo.signatures[0].toByteArray());
            String str2 = packageInfo.packageName;
            cbg a2 = caw.a(str2, (cay) caz, honorsDebugCertificates);
            return (!a2.a || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || (honorsDebugCertificates && !caw.a(str2, (cay) caz, false).a)) ? a2 : cbg.a("debuggable release cert app rejected");
        } catch (NameNotFoundException unused) {
            String str3 = "no pkg ";
            String valueOf = String.valueOf(str);
            return cbg.a(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
    }

    public static boolean a(PackageInfo packageInfo, boolean z) {
        cay cay;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                cay = a(packageInfo, cbb.a);
            } else {
                cay = a(packageInfo, cbb.a[0]);
            }
            if (cay != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(int i) {
        cbg cbg;
        String[] packagesForUid = cas.a(this.a).a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && packagesForUid.length != 0) {
            cbg = null;
            for (String a2 : packagesForUid) {
                cbg = a(a2, i);
                if (cbg.a) {
                    break;
                }
            }
        } else {
            cbg = cbg.a("no pkgs");
        }
        if (!cbg.a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (cbg.b != null) {
                cbg.b();
            } else {
                cbg.b();
            }
        }
        return cbg.a;
    }
}
