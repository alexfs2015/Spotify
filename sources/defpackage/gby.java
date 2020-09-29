package defpackage;

import android.os.Build;
import android.os.Build.VERSION;

/* renamed from: gby reason: default package */
public final class gby {
    public static String a() {
        if (VERSION.SDK_INT >= 21) {
            StringBuilder sb = new StringBuilder(128);
            for (String append : Build.SUPPORTED_ABIS) {
                sb.append(append);
                sb.append('/');
            }
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.CPU_ABI);
        sb2.append('/');
        sb2.append(Build.CPU_ABI2);
        return sb2.toString();
    }
}
