package defpackage;

import java.util.HashMap;

/* renamed from: ajr reason: default package */
final class ajr implements ajx {
    private final int a;

    public ajr() {
        this(1);
    }

    public ajr(int i) {
        this.a = i;
    }

    private static boolean a(StackTraceElement[] stackTraceElementArr, int i, int i2) {
        int i3 = i2 - i;
        if (i2 + i3 > stackTraceElementArr.length) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!stackTraceElementArr[i + i4].equals(stackTraceElementArr[i2 + i4])) {
                return false;
            }
        }
        return true;
    }

    public final StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int i;
        int i2 = this.a;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i3 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i3];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num == null || !a(stackTraceElementArr, num.intValue(), i3)) {
                stackTraceElementArr2[i4] = stackTraceElementArr[i3];
                i4++;
                i = i3;
                i5 = 1;
            } else {
                int intValue = i3 - num.intValue();
                if (i5 < i2) {
                    System.arraycopy(stackTraceElementArr, i3, stackTraceElementArr2, i4, intValue);
                    i4 += intValue;
                    i5++;
                }
                i = (intValue - 1) + i3;
            }
            hashMap.put(stackTraceElement, Integer.valueOf(i3));
            i3 = i + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i4];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, stackTraceElementArr3.length);
        return stackTraceElementArr3.length < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }
}
