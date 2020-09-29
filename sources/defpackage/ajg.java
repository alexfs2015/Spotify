package defpackage;

import android.app.ActivityManager.RunningAppProcessInfo;
import com.crashlytics.android.core.CodedOutputStream;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: ajg reason: default package */
final class ajg {
    private static final aht a = aht.a(Ad.DEFAULT_SKIPPABLE_AD_DELAY);
    private static final aht b = aht.a("Unity");

    public static void a(CodedOutputStream codedOutputStream, String str, String str2, long j) {
        codedOutputStream.a(1, aht.a(str2));
        codedOutputStream.a(2, aht.a(str));
        codedOutputStream.a(3, j);
    }

    public static void a(CodedOutputStream codedOutputStream, String str, String str2, String str3, String str4, String str5, int i, String str6) {
        CodedOutputStream codedOutputStream2 = codedOutputStream;
        int i2 = i;
        aht a2 = aht.a(str);
        aht a3 = aht.a(str2);
        aht a4 = aht.a(str3);
        aht a5 = aht.a(str4);
        aht a6 = aht.a(str5);
        aht a7 = str6 != null ? aht.a(str6) : null;
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
        aht a2 = aht.a(str);
        aht a3 = aht.a(str2);
        codedOutputStream.f(8, 2);
        codedOutputStream.b(CodedOutputStream.d(1, 3) + 0 + CodedOutputStream.b(2, a2) + CodedOutputStream.b(3, a3) + CodedOutputStream.b(4, z));
        codedOutputStream.b(1, 3);
        codedOutputStream.a(2, a2);
        codedOutputStream.a(3, a3);
        codedOutputStream.a(4, z);
    }

    public static void a(CodedOutputStream codedOutputStream, int i, String str, int i2, long j, long j2, boolean z, Map<DeviceIdentifierType, String> map, int i3, String str2, String str3) {
        int i4;
        int i5;
        int i6;
        CodedOutputStream codedOutputStream2 = codedOutputStream;
        int i7 = i;
        int i8 = i2;
        long j3 = j;
        long j4 = j2;
        boolean z2 = z;
        int i9 = i3;
        aht a2 = a(str);
        aht a3 = a(str3);
        aht a4 = a(str2);
        codedOutputStream2.f(9, 2);
        int d = CodedOutputStream.d(3, i7) + 0;
        if (a2 == null) {
            i4 = 0;
        } else {
            i4 = CodedOutputStream.b(4, a2);
        }
        int c = d + i4 + CodedOutputStream.c(5, i8) + CodedOutputStream.b(6, j3) + CodedOutputStream.b(7, j4) + CodedOutputStream.b(10, z2);
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                int a5 = a((DeviceIdentifierType) entry.getKey(), (String) entry.getValue());
                c += CodedOutputStream.a(11) + CodedOutputStream.c(a5) + a5;
            }
        }
        int c2 = c + CodedOutputStream.c(12, i9);
        if (a4 == null) {
            i5 = 0;
        } else {
            i5 = CodedOutputStream.b(13, a4);
        }
        int i10 = c2 + i5;
        if (a3 == null) {
            i6 = 0;
        } else {
            i6 = CodedOutputStream.b(14, a3);
        }
        codedOutputStream2.b(i10 + i6);
        codedOutputStream2.b(3, i7);
        codedOutputStream2.a(4, a2);
        codedOutputStream2.a(5, i8);
        codedOutputStream2.a(6, j3);
        codedOutputStream2.a(7, j4);
        codedOutputStream2.a(10, z2);
        for (Entry entry2 : map.entrySet()) {
            codedOutputStream2.f(11, 2);
            codedOutputStream2.b(a((DeviceIdentifierType) entry2.getKey(), (String) entry2.getValue()));
            codedOutputStream2.b(1, ((DeviceIdentifierType) entry2.getKey()).protobufIndex);
            codedOutputStream2.a(2, aht.a((String) entry2.getValue()));
        }
        codedOutputStream2.a(12, i9);
        if (a4 != null) {
            codedOutputStream2.a(13, a4);
        }
        if (a3 != null) {
            codedOutputStream2.a(14, a3);
        }
    }

    public static void a(CodedOutputStream codedOutputStream, String str, String str2, String str3) {
        if (str == null) {
            str = "";
        }
        aht a2 = aht.a(str);
        aht a3 = a(str2);
        aht a4 = a(str3);
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

    public static void a(CodedOutputStream codedOutputStream, long j, String str, ajk ajk, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, Map<String, String> map, aiq aiq, RunningAppProcessInfo runningAppProcessInfo, int i, String str2, String str3, Float f, int i2, boolean z, long j2, long j3) {
        aht aht;
        CodedOutputStream codedOutputStream2 = codedOutputStream;
        long j4 = j;
        Thread[] threadArr2 = threadArr;
        RunningAppProcessInfo runningAppProcessInfo2 = runningAppProcessInfo;
        int i3 = i;
        String str4 = str3;
        aht a2 = aht.a(str2);
        String str5 = "";
        if (str4 == null) {
            aht = null;
        } else {
            aht = aht.a(str4.replace("-", str5));
        }
        aht aht2 = aht;
        aht a3 = aiq.a.a();
        if (a3 == null) {
            vuu.a().a("CrashlyticsCore", "No log data to include with this event.");
        }
        aiq.a();
        codedOutputStream2.f(10, 2);
        int b2 = CodedOutputStream.b(1, j4) + 0 + CodedOutputStream.b(2, aht.a(str));
        aht aht3 = a3;
        aht aht4 = aht2;
        String str6 = str5;
        aht aht5 = a2;
        int a4 = a(ajk, thread, stackTraceElementArr, threadArr, list, 8, a2, aht2, map, runningAppProcessInfo, i);
        int a5 = b2 + CodedOutputStream.a(3) + CodedOutputStream.c(a4) + a4;
        int a6 = a(f, i2, z, i, j2, j3);
        int a7 = a5 + CodedOutputStream.a(5) + CodedOutputStream.c(a6) + a6;
        if (aht3 != null) {
            int b3 = CodedOutputStream.b(1, aht3);
            a7 += CodedOutputStream.a(6) + CodedOutputStream.c(b3) + b3;
        }
        codedOutputStream2.b(a7);
        codedOutputStream2.a(1, j4);
        codedOutputStream2.a(2, aht.a(str));
        codedOutputStream2.f(3, 2);
        Thread thread2 = thread;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        Thread[] threadArr3 = threadArr;
        List<StackTraceElement[]> list2 = list;
        aht aht6 = aht5;
        aht aht7 = aht4;
        codedOutputStream2.b(a(ajk, thread2, stackTraceElementArr2, threadArr3, list2, 8, aht6, aht7, map, runningAppProcessInfo, i));
        codedOutputStream2.f(1, 2);
        codedOutputStream2.b(a(ajk, thread2, stackTraceElementArr2, threadArr3, list2, 8, aht6, aht7));
        a(codedOutputStream2, thread2, stackTraceElementArr2, 4, true);
        int length = threadArr2.length;
        for (int i4 = 0; i4 < length; i4++) {
            a(codedOutputStream2, threadArr2[i4], (StackTraceElement[]) list.get(i4), 0, false);
        }
        a(codedOutputStream2, ajk, 1, 8, 2);
        codedOutputStream2.f(3, 2);
        codedOutputStream2.b(a());
        codedOutputStream2.a(1, a);
        codedOutputStream2.a(2, a);
        codedOutputStream2.a(3, 0);
        codedOutputStream2.f(4, 2);
        aht aht8 = aht4;
        aht aht9 = aht5;
        codedOutputStream2.b(a(aht9, aht8));
        codedOutputStream2.a(1, 0);
        codedOutputStream2.a(2, 0);
        codedOutputStream2.a(3, aht9);
        if (aht8 != null) {
            codedOutputStream2.a(4, aht8);
        }
        if (map != null && !map.isEmpty()) {
            for (Entry entry : map.entrySet()) {
                codedOutputStream2.f(2, 2);
                codedOutputStream2.b(a((String) entry.getKey(), (String) entry.getValue()));
                codedOutputStream2.a(1, aht.a((String) entry.getKey()));
                String str7 = (String) entry.getValue();
                if (str7 == null) {
                    str7 = str6;
                }
                codedOutputStream2.a(2, aht.a(str7));
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
        if (aht3 != null) {
            codedOutputStream2.f(6, 2);
            codedOutputStream2.b(CodedOutputStream.b(1, aht3));
            codedOutputStream2.a(1, aht3);
        }
    }

    private static void a(CodedOutputStream codedOutputStream, ajk ajk, int i, int i2, int i3) {
        codedOutputStream.f(i3, 2);
        codedOutputStream.b(a(ajk, 1, i2));
        codedOutputStream.a(1, aht.a(ajk.b));
        String str = ajk.a;
        if (str != null) {
            codedOutputStream.a(3, aht.a(str));
        }
        int i4 = 0;
        for (StackTraceElement a2 : ajk.c) {
            a(codedOutputStream, 4, a2, true);
        }
        ajk ajk2 = ajk.d;
        if (ajk2 != null) {
            if (i < i2) {
                a(codedOutputStream, ajk2, i + 1, i2, 6);
                return;
            }
            while (ajk2 != null) {
                ajk2 = ajk2.d;
                i4++;
            }
            codedOutputStream.a(7, i4);
        }
    }

    private static void a(CodedOutputStream codedOutputStream, Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        codedOutputStream.f(1, 2);
        codedOutputStream.b(a(thread, stackTraceElementArr, i, z));
        codedOutputStream.a(1, aht.a(thread.getName()));
        codedOutputStream.a(2, i);
        for (StackTraceElement a2 : stackTraceElementArr) {
            a(codedOutputStream, 3, a2, z);
        }
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
        codedOutputStream.a(2, aht.a(sb.toString()));
        if (stackTraceElement.getFileName() != null) {
            codedOutputStream.a(3, aht.a(stackTraceElement.getFileName()));
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

    private static int a(aht aht) {
        return CodedOutputStream.b(1, aht) + 0;
    }

    private static int a(DeviceIdentifierType deviceIdentifierType, String str) {
        return CodedOutputStream.d(1, deviceIdentifierType.protobufIndex) + CodedOutputStream.b(2, aht.a(str));
    }

    private static int a(aht aht, aht aht2) {
        int b2 = CodedOutputStream.b(1, 0) + 0 + CodedOutputStream.b(2, 0) + CodedOutputStream.b(3, aht);
        return aht2 != null ? b2 + CodedOutputStream.b(4, aht2) : b2;
    }

    private static int a(ajk ajk, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, aht aht, aht aht2, Map<String, String> map, RunningAppProcessInfo runningAppProcessInfo, int i2) {
        int a2 = a(ajk, thread, stackTraceElementArr, threadArr, list, i, aht, aht2);
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

    private static int a(ajk ajk, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, aht aht, aht aht2) {
        int a2 = a(thread, stackTraceElementArr, 4, true);
        int a3 = CodedOutputStream.a(1) + CodedOutputStream.c(a2) + a2 + 0;
        int length = threadArr.length;
        int i2 = a3;
        for (int i3 = 0; i3 < length; i3++) {
            int a4 = a(threadArr[i3], (StackTraceElement[]) list.get(i3), 0, false);
            i2 += CodedOutputStream.a(1) + CodedOutputStream.c(a4) + a4;
        }
        int a5 = a(ajk, 1, i);
        int a6 = i2 + CodedOutputStream.a(2) + CodedOutputStream.c(a5) + a5;
        int a7 = a();
        int a8 = a6 + CodedOutputStream.a(3) + CodedOutputStream.c(a7) + a7;
        int a9 = a(aht, aht2);
        return a8 + CodedOutputStream.a(3) + CodedOutputStream.c(a9) + a9;
    }

    private static int a(String str, String str2) {
        int b2 = CodedOutputStream.b(1, aht.a(str));
        if (str2 == null) {
            str2 = "";
        }
        return b2 + CodedOutputStream.b(2, aht.a(str2));
    }

    private static int a(Float f, int i, boolean z, int i2, long j, long j2) {
        int i3 = 0;
        if (f != null) {
            i3 = 0 + CodedOutputStream.a(1, f.floatValue());
        }
        return i3 + CodedOutputStream.e(2, i) + CodedOutputStream.b(3, z) + CodedOutputStream.c(4, i2) + CodedOutputStream.b(5, j) + CodedOutputStream.b(6, j2);
    }

    private static int a(ajk ajk, int i, int i2) {
        int i3 = 0;
        int b2 = CodedOutputStream.b(1, aht.a(ajk.b)) + 0;
        String str = ajk.a;
        if (str != null) {
            b2 += CodedOutputStream.b(3, aht.a(str));
        }
        int i4 = b2;
        for (StackTraceElement a2 : ajk.c) {
            int a3 = a(a2, true);
            i4 += CodedOutputStream.a(4) + CodedOutputStream.c(a3) + a3;
        }
        ajk ajk2 = ajk.d;
        if (ajk2 == null) {
            return i4;
        }
        if (i < i2) {
            int a4 = a(ajk2, i + 1, i2);
            return i4 + CodedOutputStream.a(6) + CodedOutputStream.c(a4) + a4;
        }
        while (ajk2 != null) {
            ajk2 = ajk2.d;
            i3++;
        }
        return i4 + CodedOutputStream.c(7, i3);
    }

    private static int a() {
        return CodedOutputStream.b(1, a) + 0 + CodedOutputStream.b(2, a) + CodedOutputStream.b(3, 0);
    }

    private static int a(StackTraceElement stackTraceElement, boolean z) {
        int i;
        int i2 = 0;
        if (stackTraceElement.isNativeMethod()) {
            i = CodedOutputStream.b(1, (long) Math.max(stackTraceElement.getLineNumber(), 0));
        } else {
            i = CodedOutputStream.b(1, 0);
        }
        int i3 = i + 0;
        StringBuilder sb = new StringBuilder();
        sb.append(stackTraceElement.getClassName());
        sb.append(".");
        sb.append(stackTraceElement.getMethodName());
        int b2 = i3 + CodedOutputStream.b(2, aht.a(sb.toString()));
        if (stackTraceElement.getFileName() != null) {
            b2 += CodedOutputStream.b(3, aht.a(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            b2 += CodedOutputStream.b(4, (long) stackTraceElement.getLineNumber());
        }
        if (z) {
            i2 = 2;
        }
        return b2 + CodedOutputStream.c(5, i2);
    }

    private static int a(Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        int b2 = CodedOutputStream.b(1, aht.a(thread.getName())) + CodedOutputStream.c(2, i);
        for (StackTraceElement a2 : stackTraceElementArr) {
            int a3 = a(a2, z);
            b2 += CodedOutputStream.a(3) + CodedOutputStream.c(a3) + a3;
        }
        return b2;
    }

    private static aht a(String str) {
        if (str == null) {
            return null;
        }
        return aht.a(str);
    }
}
