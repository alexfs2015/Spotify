package com.comscore.android;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Locale;

public class CommonUtils {
    private static final String a = "persist.sys.dalvik.vm.lib";
    private static final String b = "libdvm.so";
    private static final String c = "libart.so";
    private static final String d = "libartd.so";

    private CommonUtils() {
    }

    private static boolean a() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    private static boolean b() {
        try {
            if (new File("/system/app/Superuser.apk").exists()) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static String getApplicationName(Context context) {
        String str = "unknown";
        if (context == null) {
            return str;
        }
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        try {
            CharSequence applicationLabel = packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0));
            return applicationLabel != null ? applicationLabel.toString() : str;
        } catch (NameNotFoundException unused) {
            return str;
        }
    }

    public static String getApplicationResolution(Context context) {
        Point applicationSize = getApplicationSize(context);
        int i = applicationSize.x;
        int i2 = applicationSize.y;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(i));
        sb.append("x");
        sb.append(Integer.toString(i2));
        return sb.toString();
    }

    public static Point getApplicationSize(Context context) {
        Point point = new Point();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (VERSION.SDK_INT >= 13) {
            a.a(defaultDisplay, point);
            return point;
        }
        point.x = defaultDisplay.getWidth();
        point.y = defaultDisplay.getHeight();
        return point;
    }

    public static String getApplicationVersion(Context context) {
        String str = "unknown";
        if (context == null) {
            return str;
        }
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException unused) {
        }
        return str;
    }

    public static int getConnectivityType(Context context) {
        if (context == null || !b.a(context, "android.permission.ACCESS_NETWORK_STATE").booleanValue()) {
            return ConnectivityType.UNKNOWN;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return ConnectivityType.DISCONNECTED;
        }
        if (activeNetworkInfo.getType() == 1) {
            return ConnectivityType.WIFI;
        }
        if (activeNetworkInfo.getType() == 0) {
            return ConnectivityType.WWAN;
        }
        if (VERSION.SDK_INT >= 8 && (activeNetworkInfo.getType() == 4 || activeNetworkInfo.getType() == 5 || activeNetworkInfo.getType() == 2 || activeNetworkInfo.getType() == 3)) {
            return ConnectivityType.WWAN;
        }
        if (VERSION.SDK_INT >= 13) {
            if (activeNetworkInfo.getType() == 9) {
                return ConnectivityType.ETHERNET;
            }
            if (activeNetworkInfo.getType() == 7) {
                return ConnectivityType.BLUETOOTH;
            }
        }
        return ConnectivityType.CONNECTED;
    }

    public static String getDeviceArchitecture() {
        return System.getProperty("os.arch");
    }

    public static String getDeviceModel() {
        return Build.DEVICE;
    }

    public static String getDisplayResolution(Context context) {
        Point displaySize = getDisplaySize(context);
        int i = displaySize.x;
        int i2 = displaySize.y;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(i));
        sb.append("x");
        sb.append(Integer.toString(i2));
        return sb.toString();
    }

    public static Point getDisplaySize(Context context) {
        int i;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int i2 = 0;
        if (VERSION.SDK_INT >= 17) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            i2 = point.x;
            i = point.y;
        } else if (VERSION.SDK_INT >= 14) {
            try {
                Method method = Display.class.getMethod("getRawHeight", new Class[0]);
                int intValue = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i = ((Integer) method.invoke(defaultDisplay, new Object[0])).intValue();
                i2 = intValue;
            } catch (Exception unused) {
                i = 0;
            }
        } else {
            i2 = defaultDisplay.getWidth();
            i = defaultDisplay.getHeight();
        }
        return new Point(i2, i);
    }

    public static String getLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public static String getOsName() {
        return "android";
    }

    public static String getOsVersion() {
        return VERSION.RELEASE;
    }

    public static String getPackageName(Context context) {
        return context == null ? "unknown" : context.getPackageName();
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[ExcHandler: ClassNotFoundException (unused java.lang.ClassNotFoundException), SYNTHETIC, Splitter:B:12:0x0037] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getRuntime() {
        /*
            java.lang.String r0 = "java.vm.name"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = "Dalvik"
            r3 = 19
            if (r1 >= r3) goto L_0x001b
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r2.toLowerCase(r0)
            return r0
        L_0x001b:
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{  }
            java.lang.String r3 = "get"
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{  }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 0
            r5[r7] = r6     // Catch:{  }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r8 = 1
            r5[r8] = r6     // Catch:{  }
            java.lang.reflect.Method r3 = r1.getMethod(r3, r5)     // Catch:{  }
            if (r3 != 0) goto L_0x0037
            return r0
        L_0x0037:
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c }
            java.lang.String r5 = "persist.sys.dalvik.vm.lib"
            r4[r7] = r5     // Catch:{ ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c }
            r4[r8] = r2     // Catch:{ ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c }
            java.lang.Object r1 = r3.invoke(r1, r4)     // Catch:{ ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c }
            java.lang.String r3 = "libdvm.so"
            boolean r3 = r3.equals(r1)     // Catch:{ ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c }
            if (r3 == 0) goto L_0x0054
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c }
            java.lang.String r0 = r2.toLowerCase(r1)     // Catch:{ ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c }
            return r0
        L_0x0054:
            java.lang.String r2 = "libart.so"
            boolean r2 = r2.equals(r1)     // Catch:{ ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c }
            if (r2 == 0) goto L_0x0065
            java.lang.String r1 = "ART"
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c }
            java.lang.String r0 = r1.toLowerCase(r2)     // Catch:{ ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c }
            return r0
        L_0x0065:
            java.lang.String r2 = "libartd.so"
            boolean r2 = r2.equals(r1)     // Catch:{ ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c }
            if (r2 == 0) goto L_0x0076
            java.lang.String r1 = "ART_Debug"
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c }
            java.lang.String r0 = r1.toLowerCase(r2)     // Catch:{ ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c }
            return r0
        L_0x0076:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c }
            java.lang.String r0 = r1.toLowerCase(r2)     // Catch:{ ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c, ClassNotFoundException -> 0x007c }
        L_0x007c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comscore.android.CommonUtils.getRuntime():java.lang.String");
    }

    public static boolean isDeviceRooted() {
        return a() || b();
    }
}
