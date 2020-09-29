package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;

/* renamed from: fs reason: default package */
public final class fs {
    public static int a(Context context, String str) {
        return a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    private static int a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String permissionToOp = VERSION.SDK_INT >= 23 ? AppOpsManager.permissionToOp(str) : null;
        if (permissionToOp == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return (VERSION.SDK_INT >= 23 ? ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, str2) : 1) != 0 ? -2 : 0;
    }
}
