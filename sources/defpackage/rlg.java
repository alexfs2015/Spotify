package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.content.res.Configuration;
import com.google.common.hash.Hashing;

/* renamed from: rlg reason: default package */
final class rlg extends rle {
    private final Context a;
    private final String b;
    private final String c;
    private final rmh d;

    rlg(Context context, rmh rmh, String str, String str2) {
        fay.a(context);
        this.a = context;
        this.d = rmh;
        this.b = str;
        this.c = str2;
    }

    public final void a(aia aia, boolean z) {
        Configuration configuration = this.a.getResources().getConfiguration();
        aia.a("user-locale", String.valueOf(jrq.a(configuration)));
        aia.a("font-scale", String.valueOf(configuration.fontScale));
        aia.a("package-signature", a());
        String installerPackageName = this.a.getPackageManager().getInstallerPackageName(this.a.getPackageName());
        if (fax.a(installerPackageName)) {
            installerPackageName = "no-installer-package";
        }
        aia.a("installer-package", installerPackageName);
    }

    private String a() {
        try {
            Signature[] signatureArr = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 64).signatures;
            if (!(signatureArr == null || signatureArr.length == 0)) {
                return Hashing.d().a(signatureArr[0].toByteArray()).toString();
            }
        } catch (NameNotFoundException unused) {
        }
        return "No-signature";
    }
}
