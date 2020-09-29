package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: vh reason: default package */
public final class vh {
    static {
        su.a("PackageManagerHelper");
    }

    public static void a(Context context, Class<?> cls, boolean z) {
        String str = "enabled";
        String str2 = "disabled";
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            su.a();
            String str3 = "%s %s";
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z ? str : str2;
            String.format(str3, objArr);
        } catch (Exception e) {
            su.a();
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z) {
                str = str2;
            }
            objArr2[1] = str;
            String.format("%s could not be %s", objArr2);
            new Throwable[1][0] = e;
        }
    }
}
