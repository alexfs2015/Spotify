package io.fabric.sdk.android.services.common;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public final class CommonUtils {
    public static final Comparator<File> a = new Comparator<File>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return (int) (((File) obj).lastModified() - ((File) obj2).lastModified());
        }
    };
    private static Boolean b;
    private static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static long d = -1;

    enum Architecture {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        
        private static final Map<String, Architecture> k = null;

        static {
            HashMap hashMap = new HashMap(4);
            k = hashMap;
            hashMap.put("armeabi-v7a", ARMV7);
            k.put("armeabi", ARMV6);
            k.put("arm64-v8a", ARM64);
            k.put("x86", X86_32);
        }

        static Architecture a() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                wja.a().a("Fabric", "Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            Architecture architecture = (Architecture) k.get(str.toLowerCase(Locale.US));
            if (architecture == null) {
                architecture = UNKNOWN;
            }
            return architecture;
        }
    }

    public static int a() {
        return Architecture.a().ordinal();
    }

    public static int a(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, o(context));
    }

    public static int a(Context context, boolean z) {
        Float c2 = c(context);
        if (!z || c2 == null) {
            return 1;
        }
        if (((double) c2.floatValue()) >= 99.0d) {
            return 3;
        }
        return ((double) c2.floatValue()) < 99.0d ? 2 : 0;
    }

    private static long a(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i);
    }

    public static RunningAppProcessInfo a(String str, Context context) {
        List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences("com.crashlytics.prefs", 0);
    }

    public static String a(int i) {
        if (i >= 0) {
            return String.format(Locale.US, "%1$10s", new Object[]{Integer.valueOf(i)}).replace(' ', '0');
        }
        throw new IllegalArgumentException("value must be zero or greater");
    }

    private static String a(File file, String str) {
        BufferedReader bufferedReader;
        String str2 = "Failed to close system file reader.";
        String str3 = null;
        if (file.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file), 1024);
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        String[] split = Pattern.compile("\\s*:\\s*").split(readLine, 2);
                        if (split.length > 1 && split[0].equals(str)) {
                            str3 = split[1];
                            break;
                        }
                    } catch (Exception e) {
                        e = e;
                        try {
                            StringBuilder sb = new StringBuilder("Error parsing ");
                            sb.append(file);
                            wja.a().c("Fabric", sb.toString(), e);
                            a((Closeable) bufferedReader, str2);
                            return str3;
                        } catch (Throwable th) {
                            th = th;
                        }
                    }
                }
            } catch (Exception e2) {
                e = e2;
                bufferedReader = null;
                StringBuilder sb2 = new StringBuilder("Error parsing ");
                sb2.append(file);
                wja.a().c("Fabric", sb2.toString(), e);
                a((Closeable) bufferedReader, str2);
                return str3;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                a((Closeable) bufferedReader, str2);
                throw th;
            }
            a((Closeable) bufferedReader, str2);
        }
        return str3;
    }

    public static String a(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    private static String a(InputStream inputStream, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return a(instance.digest());
                }
                instance.update(bArr, 0, read);
            }
        } catch (Exception e) {
            wja.a().c("Fabric", "Could not calculate hash for app icon.", e);
            return "";
        }
    }

    public static String a(String str) {
        return a(str, "SHA-1");
    }

    private static String a(String str, String str2) {
        return a(str.getBytes(), str2);
    }

    public static String a(byte[] bArr) {
        char[] cArr = new char[(bArr.length << 1)];
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i] & 255;
            int i2 = i << 1;
            char[] cArr2 = c;
            cArr[i2] = cArr2[b2 >>> 4];
            cArr[i2 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    private static String a(byte[] bArr, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            return a(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            wji a2 = wja.a();
            StringBuilder sb = new StringBuilder("Could not create hashing algorithm: ");
            sb.append(str);
            sb.append(", returning empty string.");
            a2.c("Fabric", sb.toString(), e);
            return "";
        }
    }

    public static String a(String... strArr) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i <= 0; i++) {
            String str = strArr[0];
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String append : arrayList) {
            sb.append(append);
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            return a(sb2, "SHA-1");
        }
        return null;
    }

    public static void a(Context context, int i, String str) {
        if (n(context)) {
            wja.a().a(4, "Fabric", str);
        }
    }

    public static void a(Context context, String str) {
        if (n(context)) {
            wja.a().a("Fabric", str);
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                wja.a().c("Fabric", str, e);
            }
        }
    }

    public static void a(Flushable flushable, String str) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (IOException e) {
                wja.a().c("Fabric", str, e);
            }
        }
    }

    public static void a(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static boolean a(Context context, String str, boolean z) {
        if (context != null) {
            Resources resources = context.getResources();
            if (resources != null) {
                int a2 = a(context, str, "bool");
                if (a2 > 0) {
                    return resources.getBoolean(a2);
                }
                int a3 = a(context, str, "string");
                if (a3 > 0) {
                    return Boolean.parseBoolean(context.getString(a3));
                }
            }
        }
        return z;
    }

    public static synchronized long b() {
        long j;
        synchronized (CommonUtils.class) {
            if (d == -1) {
                long j2 = 0;
                String a2 = a(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(a2)) {
                    String upperCase = a2.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j2 = a(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            j2 = a(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            j2 = a(upperCase, "GB", 1073741824);
                        } else {
                            StringBuilder sb = new StringBuilder("Unexpected meminfo format while computing RAM: ");
                            sb.append(upperCase);
                            wja.a().a("Fabric", sb.toString());
                        }
                    } catch (NumberFormatException e) {
                        StringBuilder sb2 = new StringBuilder("Unexpected meminfo format while computing RAM: ");
                        sb2.append(upperCase);
                        wja.a().c("Fabric", sb2.toString(), e);
                    }
                }
                d = j2;
            }
            j = d;
        }
        return j;
    }

    public static long b(Context context) {
        MemoryInfo memoryInfo = new MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static String b(int i) {
        switch (i) {
            case 2:
                return "V";
            case 3:
                return "D";
            case 4:
                return "I";
            case 5:
                return "W";
            case 6:
                return "E";
            case 7:
                return "A";
            default:
                return "?";
        }
    }

    public static String b(InputStream inputStream) {
        return a(inputStream, "SHA-1");
    }

    public static String b(String str) {
        return a(str, "SHA-256");
    }

    public static void b(Context context, String str) {
        if (n(context)) {
            wja.a().e("Fabric", str);
        }
    }

    public static long c(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = (long) statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    public static Float c(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return null;
        }
        return Float.valueOf(((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
    }

    public static String c(Context context, String str) {
        int a2 = a(context, str, "string");
        return a2 > 0 ? context.getString(a2) : "";
    }

    public static boolean d(Context context) {
        return !e(context) && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null;
    }

    public static boolean d(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean e(Context context) {
        String string = Secure.getString(context.getContentResolver(), "android_id");
        if (!"sdk".equals(Build.PRODUCT)) {
            if (!"google_sdk".equals(Build.PRODUCT) && string != null) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(Context context) {
        boolean e = e(context);
        String str = Build.TAGS;
        if ((!e && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        return !e && new File("/system/xbin/su").exists();
    }

    public static int g(Context context) {
        boolean e = e(context);
        if (f(context)) {
            e |= true;
        }
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger() ? e | true ? 1 : 0 : e ? 1 : 0;
    }

    public static boolean h(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static String i(Context context) {
        InputStream inputStream;
        String str = "Failed to close icon input stream.";
        String str2 = null;
        try {
            inputStream = context.getResources().openRawResource(j(context));
            try {
                String a2 = a(inputStream, "SHA-1");
                if (!d(a2)) {
                    str2 = a2;
                }
                a((Closeable) inputStream, str);
                return str2;
            } catch (Exception e) {
                e = e;
                try {
                    wja.a().c("Fabric", "Could not calculate hash for app icon.", e);
                    a((Closeable) inputStream, str);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    a((Closeable) inputStream, str);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            inputStream = null;
            wja.a().c("Fabric", "Could not calculate hash for app icon.", e);
            a((Closeable) inputStream, str);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            a((Closeable) inputStream, str);
            throw th;
        }
    }

    public static int j(Context context) {
        return context.getApplicationContext().getApplicationInfo().icon;
    }

    public static String k(Context context) {
        String str = "string";
        int a2 = a(context, "io.fabric.android.build_id", str);
        if (a2 == 0) {
            a2 = a(context, "com.crashlytics.android.build_id", str);
        }
        if (a2 == 0) {
            return null;
        }
        String string = context.getResources().getString(a2);
        wji a3 = wja.a();
        StringBuilder sb = new StringBuilder("Build ID is: ");
        sb.append(string);
        a3.a("Fabric", sb.toString());
        return string;
    }

    public static String l(Context context) {
        int a2 = a(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (a2 == 0) {
            return null;
        }
        String string = context.getResources().getString(a2);
        wji a3 = wja.a();
        StringBuilder sb = new StringBuilder("Unity Editor version is: ");
        sb.append(string);
        a3.a("Fabric", sb.toString());
        return string;
    }

    public static boolean m(Context context) {
        boolean z = false;
        if (!(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0)) {
            return true;
        }
        if (!(((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() == null || 0 == 0)) {
            z = true;
        }
        return z;
    }

    private static boolean n(Context context) {
        if (b == null) {
            b = Boolean.valueOf(a(context, "com.crashlytics.Trace", false));
        }
        return b.booleanValue();
    }

    private static String o(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        return i > 0 ? context.getResources().getResourcePackageName(i) : context.getPackageName();
    }
}
