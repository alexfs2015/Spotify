package defpackage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: fpb reason: default package */
public abstract class fpb extends ContentProvider {
    private static boolean a(Context context, String str) {
        Signature[] signatureArr;
        if ("com.samsung.android.app.spage".equals(str)) {
            if ("eng".equals(Build.TYPE)) {
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
                    return (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
                } catch (NameNotFoundException unused) {
                    new StringBuilder("NameNotFoundException ").append(str);
                    return false;
                }
            } else {
                try {
                    for (Signature signature : context.getPackageManager().getPackageInfo(str, 64).signatures) {
                        MessageDigest instance = MessageDigest.getInstance("SHA");
                        instance.update(signature.toByteArray());
                        if ("nKUXDzgZGd/gRG/NqxixmhQ7MWM=".equals(Base64.encodeToString(instance.digest(), 2))) {
                            return true;
                        }
                    }
                } catch (NameNotFoundException | NoSuchAlgorithmException unused2) {
                    new StringBuilder("NameNotFoundException/NoSuchAlgorithmException").append(str);
                    return false;
                }
            }
        }
        new StringBuilder("Not allowed package ").append(str);
        return false;
    }

    /* access modifiers changed from: protected */
    public void a(Context context, int i, fpk fpk) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(Context context, int[] iArr);

    /* access modifiers changed from: protected */
    public void b(Context context, int[] iArr) {
    }

    /* access modifiers changed from: protected */
    public void c(Context context, int[] iArr) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle call(java.lang.String r9, java.lang.String r10, android.os.Bundle r11) {
        /*
            r8 = this;
            java.lang.String r10 = "callRequest"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x00d0
            if (r11 == 0) goto L_0x00d0
            android.content.Context r9 = r8.getContext()
            int r10 = android.os.Binder.getCallingUid()
            android.content.pm.PackageManager r0 = r9.getPackageManager()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0026
            java.lang.String[] r10 = r0.getPackagesForUid(r10)
            if (r10 == 0) goto L_0x0026
            int r0 = r10.length
            if (r0 <= 0) goto L_0x0026
            r10 = r10[r1]
            goto L_0x0027
        L_0x0026:
            r10 = r2
        L_0x0027:
            boolean r10 = a(r9, r10)
            if (r10 == 0) goto L_0x00d0
            java.lang.String r10 = "callIntent"
            android.os.Parcelable r10 = r11.getParcelable(r10)
            android.content.Intent r10 = (android.content.Intent) r10
            if (r10 != 0) goto L_0x0038
            return r2
        L_0x0038:
            java.lang.String r0 = r10.getAction()
            long r3 = android.os.Binder.clearCallingIdentity()
            java.lang.String r5 = "com.samsung.android.app.spage.action.CARD_UPDATE"
            boolean r5 = r5.equals(r0)     // Catch:{ all -> 0x00cb }
            java.lang.String r6 = "IdNo"
            if (r5 == 0) goto L_0x0056
            defpackage.foz.a()     // Catch:{ all -> 0x00cb }
            int[] r10 = r10.getIntArrayExtra(r6)     // Catch:{ all -> 0x00cb }
            r8.a(r9, r10)     // Catch:{ all -> 0x00cb }
            goto L_0x00c7
        L_0x0056:
            java.lang.String r5 = "com.samsung.android.app.spage.action.CARD_ENABLED"
            boolean r5 = r5.equals(r0)     // Catch:{ all -> 0x00cb }
            if (r5 == 0) goto L_0x0066
            int[] r10 = r10.getIntArrayExtra(r6)     // Catch:{ all -> 0x00cb }
            r8.b(r9, r10)     // Catch:{ all -> 0x00cb }
            goto L_0x00c7
        L_0x0066:
            java.lang.String r5 = "com.samsung.android.app.spage.action.CARD_DISABLED"
            boolean r5 = r5.equals(r0)     // Catch:{ all -> 0x00cb }
            if (r5 == 0) goto L_0x0076
            int[] r10 = r10.getIntArrayExtra(r6)     // Catch:{ all -> 0x00cb }
            r8.c(r9, r10)     // Catch:{ all -> 0x00cb }
            goto L_0x00c7
        L_0x0076:
            java.lang.String r5 = "com.samsung.android.app.spage.action.CARD_EVENT"
            boolean r5 = r5.equals(r0)     // Catch:{ all -> 0x00cb }
            r7 = -1
            if (r5 == 0) goto L_0x009a
            android.os.Bundle r0 = r10.getExtras()     // Catch:{ all -> 0x00cb }
            if (r0 != 0) goto L_0x0089
            android.os.Binder.restoreCallingIdentity(r3)
            return r2
        L_0x0089:
            fpk r0 = defpackage.fpk.a(r0)     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x00c7
            defpackage.foz.a()     // Catch:{ all -> 0x00cb }
            int r10 = r10.getIntExtra(r6, r7)     // Catch:{ all -> 0x00cb }
            r8.a(r9, r10, r0)     // Catch:{ all -> 0x00cb }
            goto L_0x00c7
        L_0x009a:
            java.lang.String r9 = "com.samsung.android.app.spage.action.CARD_INSTANT_UPDATE"
            boolean r9 = r9.equals(r0)     // Catch:{ all -> 0x00cb }
            if (r9 == 0) goto L_0x00b9
            java.lang.String r9 = "updateCode"
            int r9 = r10.getIntExtra(r9, r1)     // Catch:{ all -> 0x00cb }
            if (r9 == 0) goto L_0x00b1
            defpackage.foz.a()     // Catch:{ all -> 0x00cb }
            r10.getIntExtra(r6, r7)     // Catch:{ all -> 0x00cb }
            goto L_0x00c7
        L_0x00b1:
            java.lang.String r9 = "CardProvider"
            java.lang.String r10 = "wrong update code - zero"
            android.util.Log.e(r9, r10)     // Catch:{ all -> 0x00cb }
            goto L_0x00c7
        L_0x00b9:
            java.lang.String r9 = "com.samsung.android.app.spage.action.MULTI_INSTANCE_PREFERENCE_UPDATE"
            boolean r9 = r9.equals(r0)     // Catch:{ all -> 0x00cb }
            if (r9 == 0) goto L_0x00c7
            defpackage.foz.a()     // Catch:{ all -> 0x00cb }
            r10.getIntExtra(r6, r7)     // Catch:{ all -> 0x00cb }
        L_0x00c7:
            android.os.Binder.restoreCallingIdentity(r3)
            goto L_0x00d0
        L_0x00cb:
            r9 = move-exception
            android.os.Binder.restoreCallingIdentity(r3)
            throw r9
        L_0x00d0:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fpb.call(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public final String getType(Uri uri) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public final boolean onCreate() {
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
