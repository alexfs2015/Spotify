package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;

/* renamed from: kwy reason: default package */
public final class kwy implements jro {
    private final Context a;
    private PackageInfo b;
    private final String c = this.a.getPackageManager().getInstallerPackageName(this.a.getPackageName());
    private final String d;
    private final String e;
    private final boolean f = false;
    private final jsi g;

    public /* synthetic */ String a(Context context) {
        return CC.$default$a((jro) this, context);
    }

    public /* synthetic */ String a(String str) {
        return CC.$default$a((jro) this, str);
    }

    public final String b() {
        return "8.5.27";
    }

    public final String c() {
        return "9a8d2f0ce77a4e248bb71fefcb557637";
    }

    public kwy(Context context, String str, boolean z, jsi jsi) {
        this.a = context;
        this.e = str;
        this.d = a(context);
        this.g = jsi;
    }

    public final String a() {
        i();
        return this.b.versionName;
    }

    public final String d() {
        return this.e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g() {
        /*
            r4 = this;
            boolean r0 = r4.f
            r1 = 1
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = r4.c
            java.lang.String r2 = "com.android.vending"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = r4.c
            java.lang.String r2 = "com.google.android.feedback"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0038
            jsi r0 = r4.g
            r0.a()
            java.lang.String r2 = r0.a
            boolean r2 = defpackage.fax.a(r2)
            r3 = 0
            if (r2 != 0) goto L_0x0033
            java.lang.String r0 = r0.a
            java.lang.String r2 = "false"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            if (r0 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            return r3
        L_0x0038:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kwy.g():boolean");
    }

    public final String f() {
        return this.c;
    }

    public final Uri h() {
        i();
        if ("com.android.vending".equals(this.c)) {
            StringBuilder sb = new StringBuilder("market://details?id=");
            sb.append(this.b.packageName);
            return Uri.parse(sb.toString());
        }
        if (!"com.amazon.venezia".equals(this.c)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder("http://www.amazon.com/gp/mas/dl/android?p=");
        sb2.append(this.b.packageName);
        return Uri.parse(sb2.toString());
    }

    public final String e() {
        return this.d;
    }

    private void i() {
        if (this.b == null) {
            String packageName = this.a.getPackageName();
            try {
                this.b = this.a.getPackageManager().getPackageInfo(packageName, 0);
            } catch (NameNotFoundException e2) {
                StringBuilder sb = new StringBuilder("Could not load package or application info for package ");
                sb.append(packageName);
                sb.append(": ");
                sb.append(e2.getMessage());
                throw new AssertionError(sb.toString());
            }
        }
    }
}
