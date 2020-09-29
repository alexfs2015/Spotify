package defpackage;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.os.Build.VERSION;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: alq reason: default package */
public final class alq {
    private static final FileFilter a = new FileFilter() {
        public final boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    };

    public static int a() {
        if (VERSION.SDK_INT <= 10) {
            return 1;
        }
        int i = -1;
        try {
            int a2 = a("/sys/devices/system/cpu/possible");
            if (a2 == -1) {
                a2 = a("/sys/devices/system/cpu/present");
            }
            i = a2 == -1 ? new File("/sys/devices/system/cpu/").listFiles(a).length : a2;
        } catch (NullPointerException | SecurityException unused) {
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003e A[SYNTHETIC, Splitter:B:21:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045 A[SYNTHETIC, Splitter:B:27:0x0045] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(java.lang.String r3) {
        /*
            r0 = -1
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0042, all -> 0x003a }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0042, all -> 0x003a }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0038, all -> 0x0036 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0038, all -> 0x0036 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0038, all -> 0x0036 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0038, all -> 0x0036 }
            java.lang.String r1 = r3.readLine()     // Catch:{ IOException -> 0x0038, all -> 0x0036 }
            r3.close()     // Catch:{ IOException -> 0x0038, all -> 0x0036 }
            if (r1 == 0) goto L_0x0032
            java.lang.String r3 = "0-[\\d]+$"
            boolean r3 = r1.matches(r3)     // Catch:{ IOException -> 0x0038, all -> 0x0036 }
            if (r3 != 0) goto L_0x0023
            goto L_0x0032
        L_0x0023:
            r3 = 2
            java.lang.String r3 = r1.substring(r3)     // Catch:{ IOException -> 0x0038, all -> 0x0036 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x0038, all -> 0x0036 }
            int r3 = r3.intValue()     // Catch:{ IOException -> 0x0038, all -> 0x0036 }
            int r0 = r3 + 1
        L_0x0032:
            r2.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            return r0
        L_0x0036:
            r3 = move-exception
            goto L_0x003c
        L_0x0038:
            r1 = r2
            goto L_0x0043
        L_0x003a:
            r3 = move-exception
            r2 = r1
        L_0x003c:
            if (r2 == 0) goto L_0x0041
            r2.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            throw r3
        L_0x0042:
        L_0x0043:
            if (r1 == 0) goto L_0x0048
            r1.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alq.a(java.lang.String):int");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x005f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b() {
        /*
            r0 = 0
            r1 = -1
            r2 = 0
            r3 = -1
        L_0x0004:
            int r4 = a()     // Catch:{ IOException -> 0x008b }
            if (r2 >= r4) goto L_0x006b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008b }
            java.lang.String r5 = "/sys/devices/system/cpu/cpu"
            r4.<init>(r5)     // Catch:{ IOException -> 0x008b }
            r4.append(r2)     // Catch:{ IOException -> 0x008b }
            java.lang.String r5 = "/cpufreq/cpuinfo_max_freq"
            r4.append(r5)     // Catch:{ IOException -> 0x008b }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x008b }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x008b }
            r5.<init>(r4)     // Catch:{ IOException -> 0x008b }
            boolean r4 = r5.exists()     // Catch:{ IOException -> 0x008b }
            if (r4 == 0) goto L_0x0068
            boolean r4 = r5.canRead()     // Catch:{ IOException -> 0x008b }
            if (r4 == 0) goto L_0x0068
            r4 = 128(0x80, float:1.794E-43)
            byte[] r6 = new byte[r4]     // Catch:{ IOException -> 0x008b }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException -> 0x008b }
            r7.<init>(r5)     // Catch:{ IOException -> 0x008b }
            r7.read(r6)     // Catch:{ NumberFormatException -> 0x005f, all -> 0x0063 }
            r5 = 0
        L_0x003b:
            byte r8 = r6[r5]     // Catch:{ NumberFormatException -> 0x005f, all -> 0x0063 }
            boolean r8 = java.lang.Character.isDigit(r8)     // Catch:{ NumberFormatException -> 0x005f, all -> 0x0063 }
            if (r8 == 0) goto L_0x0048
            if (r5 >= r4) goto L_0x0048
            int r5 = r5 + 1
            goto L_0x003b
        L_0x0048:
            java.lang.String r4 = new java.lang.String     // Catch:{ NumberFormatException -> 0x005f, all -> 0x0063 }
            r4.<init>(r6, r0, r5)     // Catch:{ NumberFormatException -> 0x005f, all -> 0x0063 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x005f, all -> 0x0063 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x005f, all -> 0x0063 }
            int r5 = r4.intValue()     // Catch:{ NumberFormatException -> 0x005f, all -> 0x0063 }
            if (r5 <= r3) goto L_0x005f
            int r3 = r4.intValue()     // Catch:{ NumberFormatException -> 0x005f, all -> 0x0063 }
        L_0x005f:
            r7.close()     // Catch:{ IOException -> 0x008b }
            goto L_0x0068
        L_0x0063:
            r0 = move-exception
            r7.close()     // Catch:{ IOException -> 0x008b }
            throw r0     // Catch:{ IOException -> 0x008b }
        L_0x0068:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x006b:
            if (r3 != r1) goto L_0x008a
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x008b }
            java.lang.String r2 = "/proc/cpuinfo"
            r0.<init>(r2)     // Catch:{ IOException -> 0x008b }
            java.lang.String r2 = "cpu MHz"
            int r2 = a(r2, r0)     // Catch:{ all -> 0x0085 }
            int r2 = r2 * 1000
            if (r2 <= r3) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r2 = r3
        L_0x0080:
            r0.close()     // Catch:{ IOException -> 0x008b }
            r1 = r2
            goto L_0x008b
        L_0x0085:
            r2 = move-exception
            r0.close()     // Catch:{ IOException -> 0x008b }
            throw r2     // Catch:{ IOException -> 0x008b }
        L_0x008a:
            r1 = r3
        L_0x008b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alq.b():int");
    }

    public static long a(Context context) {
        FileInputStream fileInputStream;
        if (VERSION.SDK_INT >= 16) {
            MemoryInfo memoryInfo = new MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem;
        }
        long j = -1;
        try {
            fileInputStream = new FileInputStream("/proc/meminfo");
            j = ((long) a("MemTotal", fileInputStream)) << 10;
            fileInputStream.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
        return j;
    }

    private static int a(String str, FileInputStream fileInputStream) {
        byte[] bArr = new byte[1024];
        try {
            int read = fileInputStream.read(bArr);
            int i = 0;
            while (i < read) {
                if (bArr[i] == 10 || i == 0) {
                    if (bArr[i] == 10) {
                        i++;
                    }
                    int i2 = i;
                    while (i2 < read) {
                        int i3 = i2 - i;
                        if (bArr[i2] != str.charAt(i3)) {
                            continue;
                            break;
                        } else if (i3 == str.length() - 1) {
                            while (i2 < 1024 && bArr[i2] != 10) {
                                if (Character.isDigit(bArr[i2])) {
                                    int i4 = i2 + 1;
                                    while (i4 < 1024 && Character.isDigit(bArr[i4])) {
                                        i4++;
                                    }
                                    return Integer.parseInt(new String(bArr, 0, i2, i4 - i2));
                                }
                                i2++;
                            }
                            return -1;
                        } else {
                            i2++;
                        }
                    }
                    continue;
                }
                i++;
            }
        } catch (IOException | NumberFormatException unused) {
        }
        return -1;
    }
}
