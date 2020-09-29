package defpackage;

import android.app.ActivityManager.RunningAppProcessInfo;
import com.crashlytics.android.core.CodedOutputStream;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: aju reason: default package */
final class aju {
    private static final aih a = aih.a(Ad.DEFAULT_SKIPPABLE_AD_DELAY);
    private static final aih b = aih.a("Unity");

    private static int a() {
        return CodedOutputStream.b(1, a) + 0 + CodedOutputStream.b(2, a) + CodedOutputStream.b(3, 0);
    }

    private static int a(aih aih) {
        return CodedOutputStream.b(1, aih) + 0;
    }

    private static int a(aih aih, aih aih2) {
        int b2 = CodedOutputStream.b(1, 0) + 0 + CodedOutputStream.b(2, 0) + CodedOutputStream.b(3, aih);
        return aih2 != null ? b2 + CodedOutputStream.b(4, aih2) : b2;
    }

    private static int a(ajy ajy, int i, int i2) {
        int i3 = 0;
        int b2 = CodedOutputStream.b(1, aih.a(ajy.b)) + 0;
        String str = ajy.a;
        if (str != null) {
            b2 += CodedOutputStream.b(3, aih.a(str));
        }
        int i4 = b2;
        for (StackTraceElement a2 : ajy.c) {
            int a3 = a(a2, true);
            i4 += CodedOutputStream.a(4) + CodedOutputStream.c(a3) + a3;
        }
        ajy ajy2 = ajy.d;
        if (ajy2 == null) {
            return i4;
        }
        if (i < i2) {
            int a4 = a(ajy2, i + 1, i2);
            return i4 + CodedOutputStream.a(6) + CodedOutputStream.c(a4) + a4;
        }
        while (ajy2 != null) {
            ajy2 = ajy2.d;
            i3++;
        }
        return i4 + CodedOutputStream.c(7, i3);
    }

    private static int a(ajy ajy, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, aih aih, aih aih2) {
        int a2 = a(thread, stackTraceElementArr, 4, true);
        int a3 = CodedOutputStream.a(1) + CodedOutputStream.c(a2) + a2 + 0;
        int length = threadArr.length;
        int i2 = a3;
        for (int i3 = 0; i3 < length; i3++) {
            int a4 = a(threadArr[i3], (StackTraceElement[]) list.get(i3), 0, false);
            i2 += CodedOutputStream.a(1) + CodedOutputStream.c(a4) + a4;
        }
        int a5 = a(ajy, 1, i);
        int a6 = i2 + CodedOutputStream.a(2) + CodedOutputStream.c(a5) + a5;
        int a7 = a();
        int a8 = a6 + CodedOutputStream.a(3) + CodedOutputStream.c(a7) + a7;
        int a9 = a(aih, aih2);
        return a8 + CodedOutputStream.a(3) + CodedOutputStream.c(a9) + a9;
    }

    private static int a(ajy ajy, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, aih aih, aih aih2, Map<String, String> map, RunningAppProcessInfo runningAppProcessInfo, int i2) {
        int a2 = a(ajy, thread, stackTraceElementArr, threadArr, list, i, aih, aih2);
        int a3 = CodedOutputStream.a(1) + CodedOutputStream.c(a2) + a2;
        boolean z = false;
        int i3 = a3 + 0;
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                int a4 = a((String) entry.getKey(), (String) entry.getValue());
                i3 += CodedOutputStream.a(2) + CodedOutputStream.c(a4) + a4;
            }
        }
        if (runningAppProcessInfo != null) {
            if (runningAppProcessInfo.importance != 100) {
                z = true;
            }
            i3 += CodedOutputStream.b(3, z);
        }
        return i3 + CodedOutputStream.c(4, i2);
    }

    private static int a(DeviceIdentifierType deviceIdentifierType, String str) {
        return CodedOutputStream.d(1, deviceIdentifierType.protobufIndex) + CodedOutputStream.b(2, aih.a(str));
    }

    private static int a(Float f, int i, boolean z, int i2, long j, long j2) {
        int i3 = 0;
        if (f != null) {
            i3 = 0 + CodedOutputStream.a(1, f.floatValue());
        }
        return i3 + CodedOutputStream.e(2, i) + CodedOutputStream.b(3, z) + CodedOutputStream.c(4, i2) + CodedOutputStream.b(5, j) + CodedOutputStream.b(6, j2);
    }

    private static int a(StackTraceElement stackTraceElement, boolean z) {
        int i = 0;
        int b2 = (stackTraceElement.isNativeMethod() ? CodedOutputStream.b(1, (long) Math.max(stackTraceElement.getLineNumber(), 0)) : CodedOutputStream.b(1, 0)) + 0;
        StringBuilder sb = new StringBuilder();
        sb.append(stackTraceElement.getClassName());
        sb.append(".");
        sb.append(stackTraceElement.getMethodName());
        int b3 = b2 + CodedOutputStream.b(2, aih.a(sb.toString()));
        if (stackTraceElement.getFileName() != null) {
            b3 += CodedOutputStream.b(3, aih.a(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            b3 += CodedOutputStream.b(4, (long) stackTraceElement.getLineNumber());
        }
        if (z) {
            i = 2;
        }
        return b3 + CodedOutputStream.c(5, i);
    }

    private static int a(String str, String str2) {
        int b2 = CodedOutputStream.b(1, aih.a(str));
        if (str2 == null) {
            str2 = "";
        }
        return b2 + CodedOutputStream.b(2, aih.a(str2));
    }

    private static int a(Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        int b2 = CodedOutputStream.b(1, aih.a(thread.getName())) + CodedOutputStream.c(2, i);
        for (StackTraceElement a2 : stackTraceElementArr) {
            int a3 = a(a2, z);
            b2 += CodedOutputStream.a(3) + CodedOutputStream.c(a3) + a3;
        }
        return b2;
    }

    private static aih a(String str) {
        if (str == null) {
            return null;
        }
        return aih.a(str);
    }

    private static void a(CodedOutputStream codedOutputStream, int i, StackTraceElement stackTraceElement, boolean z) {
        codedOutputStream.f(i, 2);
        codedOutputStream.b(a(stackTraceElement, z));
        if (stackTraceElement.isNativeMethod()) {
            codedOutputStream.a(1, (long) Math.max(stackTraceElement.getLineNumber(), 0));
        } else {
            codedOutputStream.a(1, 0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(stackTraceElement.getClassName());
        sb.append(".");
        sb.append(stackTraceElement.getMethodName());
        codedOutputStream.a(2, aih.a(sb.toString()));
        if (stackTraceElement.getFileName() != null) {
            codedOutputStream.a(3, aih.a(stackTraceElement.getFileName()));
        }
        int i2 = 4;
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            codedOutputStream.a(4, (long) stackTraceElement.getLineNumber());
        }
        if (!z) {
            i2 = 0;
        }
        codedOutputStream.a(5, i2);
    }

    public static void a(CodedOutputStream codedOutputStream, int i, String str, int i2, long j, long j2, boolean z, Map<DeviceIdentifierType, String> map, int i3, String str2, String str3) {
        CodedOutputStream codedOutputStream2 = codedOutputStream;
        int i4 = i;
        int i5 = i2;
        long j3 = j;
        long j4 = j2;
        boolean z2 = z;
        int i6 = i3;
        aih a2 = a(str);
        aih a3 = a(str3);
        aih a4 = a(str2);
        codedOutputStream2.f(9, 2);
        int d = CodedOutputStream.d(3, i4) + 0 + (a2 == null ? 0 : CodedOutputStream.b(4, a2)) + CodedOutputStream.c(5, i5) + CodedOutputStream.b(6, j3) + CodedOutputStream.b(7, j4) + CodedOutputStream.b(10, z2);
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                int a5 = a((DeviceIdentifierType) entry.getKey(), (String) entry.getValue());
                d += CodedOutputStream.a(11) + CodedOutputStream.c(a5) + a5;
            }
        }
        codedOutputStream2.b(d + CodedOutputStream.c(12, i6) + (a4 == null ? 0 : CodedOutputStream.b(13, a4)) + (a3 == null ? 0 : CodedOutputStream.b(14, a3)));
        codedOutputStream2.b(3, i4);
        codedOutputStream2.a(4, a2);
        codedOutputStream2.a(5, i5);
        codedOutputStream2.a(6, j3);
        codedOutputStream2.a(7, j4);
        codedOutputStream2.a(10, z2);
        for (Entry entry2 : map.entrySet()) {
            codedOutputStream2.f(11, 2);
            codedOutputStream2.b(a((DeviceIdentifierType) entry2.getKey(), (String) entry2.getValue()));
            codedOutputStream2.b(1, ((DeviceIdentifierType) entry2.getKey()).protobufIndex);
            codedOutputStream2.a(2, aih.a((String) entry2.getValue()));
        }
        codedOutputStream2.a(12, i6);
        if (a4 != null) {
            codedOutputStream2.a(13, a4);
        }
        if (a3 != null) {
            codedOutputStream2.a(14, a3);
        }
    }

    public static void a(CodedOutputStream codedOutputStream, long j, String str, ajy ajy, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, Map<String, String> map, aje aje, RunningAppProcessInfo runningAppProcessInfo, int i, String str2, String str3, Float f, int i2, boolean z, long j2, long j3) {
        CodedOutputStream codedOutputStream2 = codedOutputStream;
        long j4 = j;
        Thread[] threadArr2 = threadArr;
        RunningAppProcessInfo runningAppProcessInfo2 = runningAppProcessInfo;
        int i3 = i;
        String str4 = str3;
        aih a2 = aih.a(str2);
        String str5 = "";
        aih a3 = str4 == null ? null : aih.a(str4.replace("-", str5));
        aih a4 = aje.a.a();
        if (a4 == null) {
            wja.a().a("CrashlyticsCore", "No log data to include with this event.");
        }
        aje.a();
        codedOutputStream2.f(10, 2);
        int b2 = CodedOutputStream.b(1, j4) + 0 + CodedOutputStream.b(2, aih.a(str));
        aih aih = a4;
        aih aih2 = a3;
        String str6 = str5;
        aih aih3 = a2;
        int a5 = a(ajy, thread, stackTraceElementArr, threadArr, list, 8, a2, a3, map, runningAppProcessInfo, i);
        int a6 = b2 + CodedOutputStream.a(3) + CodedOutputStream.c(a5) + a5;
        int a7 = a(f, i2, z, i, j2, j3);
        int a8 = a6 + CodedOutputStream.a(5) + CodedOutputStream.c(a7) + a7;
        if (aih != null) {
            int b3 = CodedOutputStream.b(1, aih);
            a8 += CodedOutputStream.a(6) + CodedOutputStream.c(b3) + b3;
        }
        codedOutputStream2.b(a8);
        codedOutputStream2.a(1, j4);
        codedOutputStream2.a(2, aih.a(str));
        codedOutputStream2.f(3, 2);
        Thread thread2 = thread;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        Thread[] threadArr3 = threadArr;
        List<StackTraceElement[]> list2 = list;
        aih aih4 = aih3;
        aih aih5 = aih2;
        codedOutputStream2.b(a(ajy, thread2, stackTraceElementArr2, threadArr3, list2, 8, aih4, aih5, map, runningAppProcessInfo, i));
        codedOutputStream2.f(1, 2);
        codedOutputStream2.b(a(ajy, thread2, stackTraceElementArr2, threadArr3, list2, 8, aih4, aih5));
        a(codedOutputStream2, thread2, stackTraceElementArr2, 4, true);
        int length = threadArr2.length;
        for (int i4 = 0; i4 < length; i4++) {
            a(codedOutputStream2, threadArr2[i4], (StackTraceElement[]) list.get(i4), 0, false);
        }
        a(codedOutputStream2, ajy, 1, 8, 2);
        codedOutputStream2.f(3, 2);
        codedOutputStream2.b(a());
        codedOutputStream2.a(1, a);
        codedOutputStream2.a(2, a);
        codedOutputStream2.a(3, 0);
        codedOutputStream2.f(4, 2);
        aih aih6 = aih2;
        aih aih7 = aih3;
        codedOutputStream2.b(a(aih7, aih6));
        codedOutputStream2.a(1, 0);
        codedOutputStream2.a(2, 0);
        codedOutputStream2.a(3, aih7);
        if (aih6 != null) {
            codedOutputStream2.a(4, aih6);
        }
        if (map != null && !map.isEmpty()) {
            for (Entry entry : map.entrySet()) {
                codedOutputStream2.f(2, 2);
                codedOutputStream2.b(a((String) entry.getKey(), (String) entry.getValue()));
                codedOutputStream2.a(1, aih.a((String) entry.getKey()));
                String str7 = (String) entry.getValue();
                if (str7 == null) {
                    str7 = str6;
                }
                codedOutputStream2.a(2, aih.a(str7));
            }
        }
        RunningAppProcessInfo runningAppProcessInfo3 = runningAppProcessInfo;
        if (runningAppProcessInfo3 != null) {
            codedOutputStream2.a(3, runningAppProcessInfo3.importance != 100);
        }
        int i5 = i;
        codedOutputStream2.a(4, i5);
        codedOutputStream2.f(5, 2);
        codedOutputStream2.b(a(f, i2, z, i, j2, j3));
        if (f != null) {
            float floatValue = f.floatValue();
            codedOutputStream2.f(1, 5);
            int floatToRawIntBits = Float.floatToRawIntBits(floatValue);
            codedOutputStream2.a((byte) (floatToRawIntBits & 255));
            codedOutputStream2.a((byte) ((floatToRawIntBits >> 8) & 255));
            codedOutputStream2.a((byte) ((floatToRawIntBits >> 16) & 255));
            codedOutputStream2.a((byte) (floatToRawIntBits >>> 24));
        }
        codedOutputStream2.f(2, 0);
        codedOutputStream2.b(CodedOutputStream.d(i2));
        codedOutputStream2.a(3, z);
        codedOutputStream2.a(4, i5);
        codedOutputStream2.a(5, j2);
        codedOutputStream2.a(6, j3);
        if (aih != null) {
            codedOutputStream2.f(6, 2);
            codedOutputStream2.b(CodedOutputStream.b(1, aih));
            codedOutputStream2.a(1, aih);
        }
    }

    private static void a(CodedOutputStream codedOutputStream, ajy ajy, int i, int i2, int i3) {
        codedOutputStream.f(i3, 2);
        codedOutputStream.b(a(ajy, 1, i2));
        codedOutputStream.a(1, aih.a(ajy.b));
        String str = ajy.a;
        if (str != null) {
            codedOutputStream.a(3, aih.a(str));
        }
        int i4 = 0;
        for (StackTraceElement a2 : ajy.c) {
            a(codedOutputStream, 4, a2, true);
        }
        ajy ajy2 = ajy.d;
        if (ajy2 != null) {
            if (i < i2) {
                a(codedOutputStream, ajy2, i + 1, i2, 6);
                return;
            }
            while (ajy2 != null) {
                ajy2 = ajy2.d;
                i4++;
            }
            codedOutputStream.a(7, i4);
        }
    }

    public static void a(CodedOutputStream codedOutputStream, String str, String str2, long j) {
        codedOutputStream.a(1, aih.a(str2));
        codedOutputStream.a(2, aih.a(str));
        codedOutputStream.a(3, j);
    }

    public static void a(CodedOutputStream codedOutputStream, String str, String str2, String str3) {
        if (str == null) {
            str = "";
        }
        aih a2 = aih.a(str);
        aih a3 = a(str2);
        aih a4 = a(str3);
        int b2 = CodedOutputStream.b(1, a2) + 0;
        if (str2 != null) {
            b2 += CodedOutputStream.b(2, a3);
        }
        if (str3 != null) {
            b2 += CodedOutputStream.b(3, a4);
        }
        codedOutputStream.f(6, 2);
        codedOutputStream.b(b2);
        codedOutputStream.a(1, a2);
        if (str2 != null) {
            codedOutputStream.a(2, a3);
        }
        if (str3 != null) {
            codedOutputStream.a(3, a4);
        }
    }

    public static void a(CodedOutputStream codedOutputStream, String str, String str2, String str3, String str4, String str5, int i, String str6) {
        CodedOutputStream codedOutputStream2 = codedOutputStream;
        int i2 = i;
        aih a2 = aih.a(str);
        aih a3 = aih.a(str2);
        aih a4 = aih.a(str3);
        aih a5 = aih.a(str4);
        aih a6 = aih.a(str5);
        aih a7 = str6 != null ? aih.a(str6) : null;
        codedOutputStream2.f(7, 2);
        int b2 = CodedOutputStream.b(1, a2) + 0 + CodedOutputStream.b(2, a4) + CodedOutputStream.b(3, a5);
        int a8 = a(a3);
        int a9 = b2 + CodedOutputStream.a(5) + CodedOutputStream.c(a8) + a8 + CodedOutputStream.b(6, a6);
        if (a7 != null) {
            a9 = a9 + CodedOutputStream.b(8, b) + CodedOutputStream.b(9, a7);
        }
        codedOutputStream2.b(a9 + CodedOutputStream.d(10, i2));
        codedOutputStream2.a(1, a2);
        codedOutputStream2.a(2, a4);
        codedOutputStream2.a(3, a5);
        codedOutputStream2.f(5, 2);
        codedOutputStream2.b(a(a3));
        codedOutputStream2.a(1, a3);
        codedOutputStream2.a(6, a6);
        if (a7 != null) {
            codedOutputStream2.a(8, b);
            codedOutputStream2.a(9, a7);
        }
        codedOutputStream2.b(10, i2);
    }

    public static void a(CodedOutputStream codedOutputStream, String str, String str2, boolean z) {
        aih a2 = aih.a(str);
        aih a3 = aih.a(str2);
        codedOutputStream.f(8, 2);
        codedOutputStream.b(CodedOutputStream.d(1, 3) + 0 + CodedOutputStream.b(2, a2) + CodedOutputStream.b(3, a3) + CodedOutputStream.b(4, z));
        codedOutputStream.b(1, 3);
        codedOutputStream.a(2, a2);
        codedOutputStream.a(3, a3);
        codedOutputStream.a(4, z);
    }

    private static void a(CodedOutputStream codedOutputStream, Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        codedOutputStream.f(1, 2);
        codedOutputStream.b(a(thread, stackTraceElementArr, i, z));
        codedOutputStream.a(1, aih.a(thread.getName()));
        codedOutputStream.a(2, i);
        for (StackTraceElement a2 : stackTraceElementArr) {
            a(codedOutputStream, 3, a2, z);
        }
    }
}
