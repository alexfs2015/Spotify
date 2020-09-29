package defpackage;

import android.content.Context;
import android.net.Uri;

/* renamed from: obg reason: default package */
public final class obg {
    private final String a = "com.android.vending";

    public obg(Context context) {
        context.getPackageManager().getInstallerPackageName(context.getPackageName());
    }

    public final Uri a(String str) {
        if ("com.android.vending".equals(this.a)) {
            StringBuilder sb = new StringBuilder("market://details?id=");
            sb.append(str);
            return Uri.parse(sb.toString());
        }
        if ("com.amazon.venezia".equals(this.a)) {
            StringBuilder sb2 = new StringBuilder("http://www.amazon.com/gp/mas/dl/android?p=");
            sb2.append(str);
            return Uri.parse(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder("https://play.google.com/store/apps/details?id=");
        sb3.append(str);
        return Uri.parse(sb3.toString());
    }
}
