package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;

/* renamed from: ini reason: default package */
public final class ini {
    private final Context a;
    private fpf b = new fpf();

    public ini(Context context) {
        this.a = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        throw new com.samsung.android.sdk.SsdkUnsupportedException("This device is not supported Bixby Home.", 1);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r5 = this;
            r0 = 0
            fpf r1 = r5.b     // Catch:{ SsdkUnsupportedException -> 0x003c }
            android.content.Context r2 = r5.a     // Catch:{ SsdkUnsupportedException -> 0x003c }
            boolean r3 = defpackage.fox.a()     // Catch:{ SsdkUnsupportedException -> 0x003c }
            if (r3 == 0) goto L_0x0034
            if (r2 == 0) goto L_0x002c
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ SsdkUnsupportedException -> 0x003c }
            r3 = 1
            java.lang.String r4 = "com.samsung.android.app.spage"
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r4, r3)     // Catch:{ NameNotFoundException -> 0x0024 }
            r1.a = r2     // Catch:{ NameNotFoundException -> 0x0024 }
            fpf r1 = r5.b
            boolean r1 = r1.a(r3)
            if (r1 != 0) goto L_0x0023
            return r0
        L_0x0023:
            return r3
        L_0x0024:
            com.samsung.android.sdk.SsdkUnsupportedException r1 = new com.samsung.android.sdk.SsdkUnsupportedException     // Catch:{ SsdkUnsupportedException -> 0x003c }
            java.lang.String r2 = "This device is not supported Bixby Home."
            r1.<init>(r2, r3)     // Catch:{ SsdkUnsupportedException -> 0x003c }
            throw r1     // Catch:{ SsdkUnsupportedException -> 0x003c }
        L_0x002c:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ SsdkUnsupportedException -> 0x003c }
            java.lang.String r2 = "You should set context."
            r1.<init>(r2)     // Catch:{ SsdkUnsupportedException -> 0x003c }
            throw r1     // Catch:{ SsdkUnsupportedException -> 0x003c }
        L_0x0034:
            com.samsung.android.sdk.SsdkUnsupportedException r1 = new com.samsung.android.sdk.SsdkUnsupportedException     // Catch:{ SsdkUnsupportedException -> 0x003c }
            java.lang.String r2 = "This is not samsung product"
            r1.<init>(r2, r0)     // Catch:{ SsdkUnsupportedException -> 0x003c }
            throw r1     // Catch:{ SsdkUnsupportedException -> 0x003c }
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ini.a():boolean");
    }

    public final boolean b() {
        try {
            return this.a.getPackageManager().getPackageInfo("com.samsung.android.app.spage", 0).versionCode < 220400000;
        } catch (NameNotFoundException unused) {
            return true;
        }
    }
}
