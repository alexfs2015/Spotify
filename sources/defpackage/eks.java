package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.UserManager;

/* renamed from: eks reason: default package */
public class eks {
    private static volatile UserManager a;
    private static volatile boolean b = (!a());

    private eks() {
    }

    public static boolean a() {
        return VERSION.SDK_INT >= 24;
    }

    public static boolean a(Context context) {
        return !a() || b(context);
    }

    private static boolean b(Context context) {
        boolean z = b;
        if (!z) {
            boolean z2 = z;
            int i = 1;
            while (true) {
                if (i > 2) {
                    break;
                }
                UserManager c = c(context);
                if (c == null) {
                    b = true;
                    return true;
                }
                try {
                    if (!c.isUserUnlocked()) {
                        if (c.isUserRunning(Process.myUserHandle())) {
                            z2 = false;
                            b = z2;
                        }
                    }
                    z2 = true;
                    b = z2;
                } catch (NullPointerException unused) {
                    a = null;
                    i++;
                }
            }
            z = z2;
            if (z) {
                a = null;
            }
        }
        return z;
    }

    private static UserManager c(Context context) {
        UserManager userManager = a;
        if (userManager == null) {
            synchronized (eks.class) {
                userManager = a;
                if (userManager == null) {
                    UserManager userManager2 = (UserManager) context.getSystemService(UserManager.class);
                    a = userManager2;
                    userManager = userManager2;
                }
            }
        }
        return userManager;
    }
}
