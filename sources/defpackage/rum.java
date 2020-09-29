package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.content.res.Configuration;
import com.google.common.hash.Hashing;

/* renamed from: rum reason: default package */
final class rum extends ruk {
    private final Context a;
    private final String b;
    private final String c;
    private final rvn d;

    rum(Context context, rvn rvn, String str, String str2) {
        fbp.a(context);
        this.a = context;
        this.d = rvn;
        this.b = str;
        this.c = str2;
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

    public final void a(aio aio, boolean z) {
        Configuration configuration = this.a.getResources().getConfiguration();
        aio.a("user-locale", String.valueOf(jua.a(configuration)));
        aio.a("font-scale", String.valueOf(configuration.fontScale));
        aio.a("package-signature", a());
        this.a.getPackageManager().getInstallerPackageName(this.a.getPackageName());
        String str = "com.android.vending";
        if (fbo.a(str)) {
            str = "no-installer-package";
        }
        aio.a("installer-package", str);
    }
}
